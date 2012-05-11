/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modele.Batiments.Batiment;
import Modele.Batiments.BatimentNormal;
import Modele.Batiments.BatimentSpeciaux;
import Modele.*;
import Vue.ActionsPossibles.PanelChoixCase;
import Vue.Case;
import Vue.Configuration.TuileBatiment;
import Vue.PanelCreationLot;
import Vue.Plateau;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlito De La Vega
 */
public class Controleur extends Thread {

    private static Controleur controleur;
    private Plateau plateau;
    private Jeu jeu;
    private Case caseSelected;
    private List<Joueur> joueursEnJeu;
    private int phaseActive;

    public static Controleur getInstance() {
        if (controleur == null) {
            controleur = new Controleur();
        }
        return controleur;
    }

    private Controleur() {
        //On crée le modèle et la vue
        this.jeu = new Jeu();
        this.plateau = new Plateau();
        this.caseSelected = null;
        this.joueursEnJeu = null;
        this.phaseActive = 0;
    }

    public void initialisation() {
        //Création des batiments spéciaux
        for (BatimentSpeciaux bat : TuileBatiment.getBatimentsSpeciaux()) {
            this.addBatiment(bat);
        }

        //Création des batiments neutres de manière aléatoire
        Collections.shuffle(TuileBatiment.getBatimentsNeutres());
        for (BatimentNormal bat : TuileBatiment.getBatimentsNeutres()) {
            this.addBatiment(bat);
        }

        //Création
        plateau.initBailliPrevot(Jeu.CASE_INI_BAILLI_PREVOT);

        Collections.shuffle(jeu.getJoueurs());
        plateau.initJoueurs(jeu.getJoueurs());
        plateau.initInterfaceJoueur(jeu.getJoueurs().get(0));
        
        PanelChoixCase action = new PanelChoixCase();
        plateau.setActionJoueur(action);
    }

    @Override
    public void run() {
        //Lance le jeu
        Controleur.getInstance().gestionTourDeJeu();
    }

    public void gestionTourDeJeu() {
        do {
            // méthode qui gère la phase de collecte des revenus
            phaseCollecteDesRevenus();

            // méthode qui gère la phase du placement des ouvriers
            phasePlacementDesOuvriers();

            // méthode qui gère l'activation des bâtiments spéciaux
            phaseActivationBatimentSpeciaux();

            // méthode qui gère le déplacement du prévot
            phaseDeplacementDuPrevot();

            // méthode qui gère l'activation des batiments

            // méthode qui gère la construction du château
            phaseConstructionDuChateau();
            // méthode qui gère la fin du tour   
            phaseFinDuTour();
        } while (!isFin());
    }

    public void phaseCollecteDesRevenus() {
        plateau.setPhaseJeu("Collecte des revenus");
        phaseActive = 1;

        //On ajoute 2 deniers à tous les joueurs
        for (Joueur j : jeu.getJoueurs()) {
            j.setNbDenier(2);
        }

        //On ajoute :
        //  - 1 denier aux proprios de résidence et bibliothèque
        //  - 2 deniers aux proprios de l'hotel
        for (Batiment bat : jeu.getBatimentsNormaux()) {
            if (bat.getNom().compareTo("Résidence") == 0
                    || bat.getNom().compareTo("Bibliothèque") == 0) {
                bat.getProprio().setNbDenier(1);
            } else if (bat.getNom().compareTo("Hotel") == 0) {
                bat.getProprio().setNbDenier(2);
            }
        }
        //Fin de phase
        System.out.println("Fin de la phase 1 !");
        phaseActive = 0;
    }

    public void phasePlacementDesOuvriers() {
        plateau.setPhaseJeu("Placement des ouvriers");
        phaseActive = 2;

        //Mise à jour du panneau d'action
//        PanelChoixCase action = new PanelChoixCase();
//        plateau.setActionJoueur(action);

        int tour = 0;
        //Tant qu'y a des joueurs en jeu, on continue la phase
        joueursEnJeu = new ArrayList<>(jeu.getJoueurs());
        while (!joueursEnJeu.isEmpty()) {
            //Mise à jour du panel d'information du joueur actif
            plateau.setInterfaceJoueur(getJoueurEnJeu());

            System.out.println("\t * Tour : " + tour);
            System.out.println("Joueur actif : " + getJoueurEnJeu());

            //On attend le clic, c'est lui qui déclenche l'affichage de l'ouvrier
            //ou la finDePose pour le joueur
            this.attendreChoixCase();

            //Vérifie qu'il pourra encore jouer :
            //  - pas assez de sous
            //  - plus d'ouvriers
            if (getJoueurEnJeu().getNbDenier() < jeu.getPrixPose()
                    || getJoueurEnJeu().getNbOuvrierDispo() == 0) {
                finDePose();
            } else {
                //Met à jour le joueur actif
                //Dans le else, pck quand finDePose, le joueur est supprimé de la liste
                //Donc le premier est bien le suivant
                this.majJoueursEnJeu();
            }
            tour++;
        }

        //On supprime le panneau d'action
//        plateau.rmActionJoueur(action);

        //Fin de phase
        System.out.println("Fin de la phase 2 !");
        phaseActive = 0;
    }

    public void phaseActivationBatimentSpeciaux() {
        plateau.setPhaseJeu("Activation des batiments spéciaux");
        phaseActive = 3;

        //Mise à jour du panneau d'action
//        PanelChoixCase action = new PanelChoixCase();
//        plateau.setActionJoueur(action);

        //Pour chaque batiment spéciaux
        int nbCase = 0;
        for (BatimentSpeciaux bat : jeu.getBatimentsSpeciaux()) {
            //Sélectionne la case en cours
            plateau.getCaseBatimentsSpeciaux().get(nbCase).selected();

            //Vérifie qu'il y a un ouvrier dessus
            if (bat.getOuvrier() != null) {
                System.out.println("Batiment : " + bat);

                //Affiche le batiment a activé dans le panel de droite
                PanelChoixCase.setBatiment(bat.getNom());

                //On ajoute le joueur de l'ouvrier dans la liste de joueur en cours de jeu
                joueursEnJeu.add(bat.getOuvrier().getPatron());

                //On libère l'ouvrier
                bat.getOuvrier().setDispo(true);

                //On active le batiment
                bat.activerBatiment();
            }

            //Desélectionne la case en cours
            plateau.getCaseBatimentsSpeciaux().get(nbCase).deSelected();
            nbCase++;
        }

        //On supprime le panneau d'action
//        plateau.rmActionJoueur(action);

        //Fin de phase
        System.out.println("Fin de la phase 3 !");
        phaseActive = 0;
    }

    public void phaseDeplacementDuPrevot() {
        plateau.setPhaseJeu("Déplacement du prévot");
        phaseActive = 4;

        //Pour chaque joueur
        joueursEnJeu = jeu.getJoueurs();
        for (Joueur j : jeu.getJoueurs()) {
            //Mise à jour du panel d'information du joueur actif
            plateau.setInterfaceJoueur(getJoueurEnJeu());

            deplacerPrevot();
        }

        //Fin de phase
        System.out.println("Fin de la phase 4 !");
        phaseActive = 0;
    }

    public void phaseConstructionDuChateau() {
        plateau.setPhaseJeu("Construction du chateau");
        phaseActive = 6;

        PanelCreationLot creeLot;
        //Boucle sur les joueurs du chateau
        joueursEnJeu = jeu.getJoueursAuChateau();

        getJoueurEnJeu().addNbRessource("Tissu", 1);
        getJoueurEnJeu().addNbRessource("Or", 1);
        getJoueurEnJeu().addNbRessource("Pierre", 1);
        getJoueurEnJeu().addNbRessource("Bois", 1);

        //Initialise le nombre de lot de chaque joueur
        Joueur gagneFaveur = null;
        int max = 0;
        boolean aConstruit, fin = false;
        for (Joueur j : joueursEnJeu) {

            //Tant que le joueur veut et peut créer des lots
            int nbLot = 0;
//            while (!fin && peutConstruire()) {
            //On récupère le lot et met à jour le joueur
            creeLot = new PanelCreationLot(getJoueurEnJeu());
            aConstruit = this.traitementLot(creeLot.getLot());
            creeLot.dispose();

            if (aConstruit) {
                nbLot++;
            } else {
                fin = true;
            }
//            }

            if (nbLot >= max) {
                gagneFaveur = getJoueurEnJeu();
            }
        }

        //Le joueur qui a le plus construit gagne une faveur
        this.gagneFaveur(gagneFaveur);

        //Fin de phase
        System.out.println("Fin de la phase 4 !");
        phaseActive = 0;
    }

    public void phaseFinDuTour() {
        plateau.setPhaseJeu("Fin du tour");
        phaseActive = 7;

        //déplacement du bailli
        deplacerBailli();

        //On vérifie si un décompte est à faire
        //Si on a dépassé le prochain décompte
        if (jeu.getPositionBailli() >= Jeu.CASE_DECOMPTE[jeu.getProchainDecompte()]
                || jeu.getChateau().faireDecompte()) {
            jeu.getChateau().decompte();
        }

        //On efface la file de fin de pose
        jeu.getListeFinDePose().clear();
        plateau.rmCaseMarqueur();

        //Et celle du chateau
        jeu.getJoueursAuChateau().clear();

        //Fin de phase
        System.out.println("Fin de la phase 7 !");
        phaseActive = 0;
    }

    public void placerOuvrier() {
        if (caseSelected != null) {
            //On récupère le batiment correspondant
            Batiment batiment = jeu.getBatiment(caseSelected.getPosition());
            System.out.println("Pose sur : " + batiment.getNom());

            //Vérifie qu'il peut payer pour se placer sur la case
            int prix = this.getPrixPose(batiment);
            System.out.println("Prix : " + prix);

            if (prix <= getJoueurEnJeu().getNbDenier()) {
                //Paye pour placer
                getJoueurEnJeu().setNbDenier(-prix);

                //Ajout des points de prestige
                if (!batiment.estProprio(getJoueurEnJeu()) && batiment.getProprio() != null) {
                    batiment.getProprio().addPrestige(1);
                }

                //On place l'ouvrier sur le batiment
                Ouvrier ouvrier = getJoueurEnJeu().getOuvrierDispo();
                ouvrier.setDispo(false);
                batiment.setOuvrier(ouvrier);

                //On le met sur la case
                caseSelected.setOuvrier(getJoueurEnJeu().getCouleur());
                
                System.out.println("Controleur - Ouvrier placé !");
            } else {
                plateau.showMessage("Vous n'avez pas assez de deniers.\nDeniers nécessaires : " + prix, "Erreur...", JOptionPane.WARNING_MESSAGE);
            }

            //On déselectionne la case du batiment
            caseSelected.deSelected();
            caseSelected = null;
            PanelChoixCase.setValidationPossible(false);

        }
    }

    public void finDePose() {
        System.out.print("Fin de tour pour " + getJoueurEnJeu().getNom());

        //on déselectionne la case
        if (caseSelected != null) {
            caseSelected.deSelected();
            caseSelected = null;
            PanelChoixCase.setValidationPossible(false);
        }

        //Place sur file fin de pose dans la vue et les données
        int pos = jeu.getPlaceLibreFinDePose();
        plateau.addFileFinDePose(getJoueurEnJeu().getCouleur(), pos);
        jeu.getListeFinDePose().add(getJoueurEnJeu());

        if (pos == 0) {
            this.getJoueurEnJeu().setNbDenier(1);
        }
    }

    public int getPrixPose(Batiment batiment) {
        int prix;
        if (batiment.estProprio(this.getJoueurEnJeu())) {
            prix = 1;
        } else {
            //plus petit numéro non occupé de la ligne de fin de pose
            prix = jeu.getPrixPose();
        }
        return prix;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public Jeu getJeu() {
        return jeu;
    }

    public Case getSelected() {
        return caseSelected;
    }

    public void selectedCase(Case selected) {
        //Case sélectionnable ?
        int pos = selected.getPosition();
        if (jeu.isSelectable(pos)) {
            if (caseSelected != null) {
                //On déselectionne la case d'avant
                caseSelected.deSelected();
            }
            caseSelected = selected;
            caseSelected.selected();

            //Active le bouton de validation
            PanelChoixCase.setValidationPossible(true);
        }
    }

    public void setJoueurs(List<Joueur> joueurs) {
        jeu.setJoueurs(joueurs);
    }

    public List<Joueur> getJoueurs() {
        return jeu.getJoueurs();
    }

    public void addBatiment(Batiment batiment) {
        int pos;
        if (batiment instanceof BatimentNormal) {
            //On met à jour les données et la vue
            jeu.addBatimentNormal((BatimentNormal) batiment);
            pos = jeu.getBatimentsNormaux().indexOf(batiment);
            plateau.addBatimentNormaux(pos, (BatimentNormal) batiment);
        } else {
            //On met à jour les données et la vue
            jeu.addBatimentSpeciaux((BatimentSpeciaux) batiment);
            pos = jeu.getBatimentsSpeciaux().indexOf(batiment);
            plateau.addBatimentSpeciaux(pos, (BatimentSpeciaux) batiment);
        }
    }

    public void activerBatiment() {
        Batiment bat = jeu.getBatimentsSpeciaux().get(2);
        if (bat.getNom() != null) {
            bat.getOuvrier().setDispo(true);
            // A voir si on le fait. 
        }
        bat = jeu.getBatimentsSpeciaux().get(3);
        if (bat.getOuvrier() != null) {
            bat.getOuvrier().getPatron().setNbDenier(3);
            bat.getOuvrier().setDispo(true);
        }
        bat = jeu.getBatimentsSpeciaux().get(4);
        if (bat.getOuvrier() != null) {
            bat.getOuvrier().getPatron().setNbDenier(3);
            bat.getOuvrier().setDispo(true);
        }
        bat = jeu.getBatimentsSpeciaux().get(5);
        if (bat.getOuvrier() != null) {
            String reponse;
            String message = "De combien de cases voulez vous bouger le prévôt?";
            reponse = JOptionPane.showInputDialog(null, message);
            System.out.println("reponse : " + Integer.parseInt(reponse));
            bat.getOuvrier().setDispo(true);
        }
    }

    public synchronized void attendreChoixCase() {
        try {
            System.out.println("Attendre click sur case");
            this.wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public synchronized void click() {
        this.notify();
        System.out.println("click");
    }

    public Joueur getJoueurEnJeu() {
        return joueursEnJeu.get(0);
    }

    private void majJoueursEnJeu() {
        //Récupère le joueur en jeu
        Joueur prec = getJoueurEnJeu();
        //Décale tous les joueurs
        int i;
        for (i = 0; i < joueursEnJeu.size() - 1; i++) {
            joueursEnJeu.set(i, joueursEnJeu.get(i + 1));
        }
        //Supprime le dernier
        joueursEnJeu.remove(i);
        //Si joueur courant n'a pas fini, on l'ajoute à la fin
        if (!jeu.getListeFinDePose().contains(prec)) {
            joueursEnJeu.add(prec);
        }
    }

    public int getPhase() {
        return phaseActive;
    }

    public void deplacerBailli() {
        int nbCase = 1;
        if (jeu.getPositionPrevot() > jeu.getPositionBailli()) {
            nbCase = 2;
        }

        //Supprime l'ancien
        plateau.rmBailli(jeu.getPositionBailli());
        //déplace dans les données
        jeu.deplacerBailli(nbCase);
        //déplace dans la vue
        plateau.setBailli(jeu.getPositionBailli());

        //Le prévot rejoind le bailli
        plateau.rmPrevot(jeu.getPositionPrevot());
        jeu.setPrevot(nbCase);
        plateau.setPrevot(jeu.getPositionBailli());

        //Rafraichi le plateau
        plateau.repaint();
    }

    public void deplacerPrevot() {
        //Récupère la position du prévot
        int pos = Controleur.getInstance().getJeu().getPositionPrevot();
        //Récupère les cases possibles
        int min = pos - 3;
        //Le minimum doit être 1, vu que les cases commencent à 1        
        if (min < 1) {
            min = 1;
        }

        int max = pos + 3;
        //29 = dernière case
        if (max > 29) {
            max = 29;
        }

        String message = "De combien de cases voulez-vous déplacer le prévôt?";

        //Si phase 4, on adapte le message
        if (phaseActive == 4) {
            message += "\nPrix :\n\t- 1 denier par case.";
            //On vérifie qu'il a assez de sous
            if (getJoueurEnJeu().getNbDenier() < 3) {
                min = pos - getJoueurEnJeu().getNbDenier();
                max = pos + getJoueurEnJeu().getNbDenier();
            }
        }

        //On inclut la borne supérieure
        Integer[] choixPossible = new Integer[max - min + 1];

        for (int i = 0; i <= max - min; i++) {
            choixPossible[i] = min - pos + i;
        }

        Integer choix = (Integer) JOptionPane.showInputDialog(
                Controleur.getInstance().getPlateau(),
                message,
                "Déplacement du prévot",
                JOptionPane.QUESTION_MESSAGE,
                null,
                choixPossible, choixPossible[0]);

        if (choix == null) {
            choix = 0;
        }

        //Si phase 4, on enlève les deniers
        if (phaseActive == 4) {
            int prix = choix;
            if (prix > 0) {
                prix = -prix;
            }
            getJoueurEnJeu().setNbDenier(prix);
        }

        //Supprime l'ancien
        plateau.rmPrevot(jeu.getPositionPrevot());

        //Déplace dans les données
        jeu.deplacerPrevot(choix);
        //Dans la vue
        plateau.setPrevot(jeu.getPositionPrevot());

        //Rafraichi le plateau
        plateau.repaint();
    }

    public boolean isFin() {
        boolean res = false;
        if (jeu.getProchainDecompte() == 5 || !jeu.getChateau().estConstruisable()) {
            res = true;
        }
        return res;
    }

    private boolean traitementLot(Lot lot) {
        boolean res = false;
        if (lot != null) {
            //On enlève les ressources au joueur
            for (Ressource r : lot.getRessources()) {
                getJoueurEnJeu().addNbRessource(r.getNom(), r.getQuantite());
            }

            jeu.getChateau().activerBatiment();
            res = true;
        }
        return res;
    }

    private boolean peutConstruire() {
        boolean res = false;
        //Doit avoir 1 de tissu
        if (getJoueurEnJeu().getNbRessource("Tissu") > 0) {
            int nbRes = 0;
            for (Iterator<Ressource> iRes = getJoueurEnJeu().getRessources().values().iterator(); iRes.hasNext();) {
                if (iRes.next().getQuantite() > 0) {
                    nbRes++;
                }
            }
            //S'il a 4 ressources différentes > 0 (tissu inclu) 
            if (nbRes >= 4) {
                res = true;
            }
        }
        return res;
    }

    private void gagneFaveur(Joueur gagneFaveur) {
        //Faveur = 3 points de prestige
        gagneFaveur.addPrestige(3);
    }
}
