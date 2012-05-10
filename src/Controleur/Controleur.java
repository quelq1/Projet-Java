/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modele.Batiment;
import Modele.Batiments.BatimentNormal;
import Modele.Jeu;
import Modele.Joueur;
import Modele.Ouvrier;
import Vue.ActionsPossibles.PanelPlacementOuvriers;
import Vue.Case;
import Vue.Configuration.TuileBatiment;
import Vue.Plateau;
import java.util.Collections;
import java.util.List;
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
    private Joueur joueurActif;
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
        this.joueurActif = null;
        this.phaseActive = 0;
    }

    public void initialisation() {
        //Création des batiments neutres de manière aléatoire
        Collections.shuffle(TuileBatiment.getBatimentsNeutres());
        for (int i = 0; i < 6; i++) {
            this.addBatiment(TuileBatiment.getBatimentsNeutres().get(i));
        }

        //Création
        plateau.initBailliPrevot();

        Collections.shuffle(jeu.getJoueurs());
        plateau.initJoueurs(jeu.getJoueurs());
        plateau.initInterfaceJoueur(jeu.getJoueurs().get(0));
    }

    @Override
    public void run() {

        //Lance le jeu
        Controleur.getInstance().gestionTourDeJeu();
    }

    public void gestionTourDeJeu() {
        boolean fin = false;
        //while (!fin){
        // méthode qui gère la phase de collecte des revenus
        phaseCollecteDesRevenus();
        // méthode qui gère la phase du placement des ouvriers
        lancementPhasePlacementDesOuvriers();
        // méthode qui gère l'activation des bâtiments spéciaux
        // méthode qui gère le déplacement du prévot
        // méthode qui gère l'activation des batiments
        // méthode qui gère la construction du château
        // méthode qui gère la fin du gestionTourDeJeu, si elle renvoie true le jeu est fini.
        //}
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
    }

    public void lancementPhasePlacementDesOuvriers() {
        plateau.setPhaseJeu("Placement des ouvriers");
        phaseActive = 2;

        //Mise à jour du panel d'information du joueur actif
        plateau.setInterfaceJoueur(jeu.getJoueurs().get(0));

        //Mise à jour du panneau d'action
        plateau.setActionJoueur(new PanelPlacementOuvriers());

        //Tant qu'y a des joueurs en jeu, on continue la phase
        joueurActif = jeu.getJoueurs().get(0);
    }

    public void traitementPlacementDesOuvriers() {
        if (caseSelected != null) {
            //On récupère le batiment correspondant
            Batiment batiment = jeu.getBatiment(caseSelected.getPosition());
            
            //Paye pour placer
            joueurActif.setNbDenier(this.getPrixPose(batiment));

            //Ajout des points de prestige
            if (!batiment.estProprio(joueurActif) && batiment.getProprio() != null) {
                batiment.getProprio().setNbPrestige(1);
            }

            //On place l'ouvrier sur le batiment
            Ouvrier ouvrier = joueurActif.getOuvrierDispo();
            ouvrier.setDispo(false);
            batiment.setOuvrier(ouvrier);
            
            //On le met sur la case
            caseSelected.setOuvrier(joueurActif.getCouleur());            
        }
    }

    public int getPrixPose(Batiment batiment) {
        int prix;
        if (batiment.estProprio(joueurActif)) {
            prix = -1;
        } else {
            //plus petit numéro non occupé de la ligne de fin de pose
            prix = plateau.getPlaceLibreFinDePose();
        }
        return prix;
    }

//    public List<Batiment> getBatimentNormauxAActiver() {
//        List<Batiment> aActiver = new ArrayList<>();
//        Batiment b;
//        for (Case c : plateau.getCaseBatimentsNormaux().subList(0, jeu.getPositionBailli())) {
//            b = c.getBatiment();
//            if (c != null) {
//                aActiver.add(b);
//            }
//        }
//        return aActiver;
//    }
    public Plateau getPlateau() {
        return plateau;
    }

    public Case getSelected() {
        return caseSelected;
    }

    public void setCaseSelected(Case selected) {
        //Batiment sur la case ?
        int pos = selected.getPosition();
        if (jeu.getBatiment(pos) != null) {
            System.out.println("Ici");
            if (caseSelected != null) {
                //On déselectionne la case d'avant
                caseSelected.deSelected();
            }
            System.out.println("Là");
            caseSelected = selected;
            caseSelected.selected();
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
            throw new UnsupportedOperationException("Not yet implemented");
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

    public void passerSonTour() {
        System.out.print("Passe son tour : ");
        //Place sur file fin de pose
        int pos = plateau.getPlaceLibreFinDePose();
        plateau.addFileFinDePose(joueurActif.getCouleur(), pos);
        
        if (pos == 0) {
            joueurActif.setNbDenier(1);
        }
    }
}
