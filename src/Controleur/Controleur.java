/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modele.Batiments.Batiment;
import Modele.Batiments.BatimentNormal;
import Modele.Batiments.BatimentSpeciaux;
import Modele.Batiments.Speciaux.*;
import Modele.Jeu;
import Modele.Joueur;
import Modele.Ouvrier;
import Vue.ActionsPossibles.PanelPlacementOuvriers;
import Vue.Case;
import Vue.Configuration.TuileBatiment;
import Vue.Plateau;
import java.util.ArrayList;
import java.util.Collections;
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
        for (BatimentNormal bat : TuileBatiment.getBatimentsNeutres()){
            this.addBatiment(bat);
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
        phasePlacementDesOuvriers();
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

    public void phasePlacementDesOuvriers() {
        plateau.setPhaseJeu("Placement des ouvriers");
        phaseActive = 2;

        //Mise à jour du panneau d'action
        plateau.setActionJoueur(new PanelPlacementOuvriers());

        int tour = 0;
        //Tant qu'y a des joueurs en jeu, on continue la phase
        joueursEnJeu = new ArrayList<>(jeu.getJoueurs());
        while (!joueursEnJeu.isEmpty()) {
            //Mise à jour du panel d'information du joueur actif
            plateau.setInterfaceJoueur(getJoueurEnJeu());

            System.out.println("\t * Tour : " + tour);
            System.out.println("Joueur actif : " + getJoueurEnJeu());
            
            //On attend le clic, c'est lui qui déclenche l'affichage de l'ouvrier
            //ou la finDeTour pour le joueur
            this.attendreClick();

            //Vérifie qu'il pourra encore jouer
            if (getJoueurEnJeu().getNbDenier() < 1) {
                finDeTour();
            } else {
                //Met à jour le joueur actif
                //Dans le else, pck quand finDeTour, le joueur est supprimé de la liste
                //Donc le premier est bien le suivant
                this.majJoueursEnJeu();
            }
            tour++;
        }

        //Phase suivante
        System.out.println("Fin de la phase !");
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
                    batiment.getProprio().setNbPrestige(1);
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
            
        }
    }

    public void finDeTour() {
        //on déselectionne la case
        if (caseSelected != null) {
            caseSelected.deSelected();
            caseSelected = null;
        }
        System.out.print("Fin de tour pour " + getJoueurEnJeu().getNom());

        //Place sur file fin de pose dans la vue et les données
        int pos = plateau.getPlaceLibreFinDePose();
        plateau.addFileFinDePose(getJoueurEnJeu().getCouleur(), pos);
        jeu.getListeFinDePose().add(getJoueurEnJeu());

        if (pos == 0) {
            this.getJoueurEnJeu().setNbDenier(1);
        }
    }

    public int getPrixPose(Batiment batiment) {
        int prix;
        if (batiment.estProprio(this.getJoueurEnJeu())) {
            prix = -1;
        } else {
            //plus petit numéro non occupé de la ligne de fin de pose
            prix = plateau.getPlaceLibreFinDePose();
        }
        return prix;
    }

    public Plateau getPlateau() {
        return plateau;
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
            PanelPlacementOuvriers.validationPossible();
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

    public void activerBatimentSpeciaux(Batiment bat) {
        // Joueur j = null;
        if (bat instanceof Porte) {
            bat.getOuvrier().setDispo(true);
        } else {
            if (bat instanceof Comptoir) {
                bat.getOuvrier().getPatron().setNbDenier(3);
                bat.getOuvrier().setDispo(true);
            } else {
                if (bat instanceof Guilde) {
                    String reponse;
                    String message = "De combien de cases voulez vous bouger le prévôt?";
                    reponse = JOptionPane.showInputDialog(null, message);
                    System.out.println("reponse : " + Integer.parseInt(reponse));
                    bat.getOuvrier().setDispo(true);
                    // voir pour mettre l'image du prevot a jour 
                } else {
                    if (bat instanceof ChampDeJoute) {
                        int reponse = JOptionPane.showConfirmDialog(plateau, "Voulez-vous acheter une faveur",
                                "Champs de Joute",
                                JOptionPane.YES_NO_OPTION);
                        if (reponse == JOptionPane.YES_OPTION) {
                            bat.getOuvrier().getPatron().setNbDenier(-1);
                            bat.getOuvrier().getPatron().addNbRessource("Tissu", -1);
                            bat.getOuvrier().getPatron().setNbPrestige(3);
                        }
                        bat.getOuvrier().setDispo(true);
                    } else {
                        if (bat instanceof Etables) {
                            jeu.setJoueurs(ecurie(jeu.getJoueurs(), (Etables) bat));
                            List<Joueur> joueurs = jeu.getJoueurs();
                            List<Case> caseOrdreTour = plateau.getCaseOrdreTour();
                            joueurs.get(0).setNbDenier(5);
                            caseOrdreTour.get(0).setImage("/Image/Marqueur/" + joueurs.get(0).getCouleur() + ".jpg");

                            joueurs.get(1).setNbDenier(6);
                            caseOrdreTour.get(1).setImage("/Image/Marqueur/" + joueurs.get(1).getCouleur() + ".jpg");

                            if (joueurs.size() > 2) {
                                joueurs.get(2).setNbDenier(6);
                                caseOrdreTour.get(2).setImage("/Image/Marqueur/" + joueurs.get(2).getCouleur() + ".jpg");

                                if (joueurs.size() > 3) {
                                    joueurs.get(3).setNbDenier(7);
                                    caseOrdreTour.get(3).setImage("/Image/Marqueur/" + joueurs.get(3).getCouleur() + ".jpg");

                                    if (joueurs.size() > 4) {
                                        joueurs.get(4).setNbDenier(7);
                                        caseOrdreTour.get(4).setImage("/Image/Marqueur/" + joueurs.get(4).getCouleur() + ".jpg");
                                    }
                                }
                            }
                            bat.getOuvrier().setDispo(true);
                        } else {
                            if (bat instanceof Auberge) {
                                if (bat.getOuvrier().getPatron() == joueursEnJeu) {
                                    int reponse = JOptionPane.showConfirmDialog(plateau, "Voulez-vous récupérer votre ouvrier",
                                            "Auberge",
                                            JOptionPane.YES_NO_OPTION);
                                    if (reponse == JOptionPane.YES_OPTION) {
                                        bat.getOuvrier().setDispo(true);
                                        bat.getOuvrier().getPatron().setCout(0);
                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(plateau, "Le bâtiment n'est pas un batiment special",
                                        "erreur",
                                        JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }
                }
            }
        }
    }

    public List<Joueur> ecurie(List<Joueur> list, Etables e) {
        List<Joueur> joueur = new ArrayList<>();
        if (e.getPlace1() != null) {
            joueur.add(e.getPlace1());
        } else {
            if (e.getPlace2() != null) {
                joueur.add(e.getPlace2());
            } else {
                if (e.getPlace3() != null) {
                    joueur.add(e.getPlace3());
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (!joueur.contains(list.get(i))) {
                joueur.add(list.get(i));
            }
        }
        return joueur;
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

    public synchronized void attendreClick() {
        try {
            System.out.println("Attendre click");
            this.wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public synchronized void click() {
        this.notify();
        System.out.println("click");
    }
    
    private Joueur getJoueurEnJeu() {
        return joueursEnJeu.get(0);
    }

    private void majJoueursEnJeu() {
        System.out.println("Avant : " + joueursEnJeu);
        //Récupère le joueur en jeu
        Joueur prec = getJoueurEnJeu(); 
        //Décale tous les joueurs
        int i;
        for (i = 0; i < joueursEnJeu.size()-1; i++) {
            joueursEnJeu.set(i, joueursEnJeu.get(i+1));
        }
        //L'ancien premier devient le dernier
        joueursEnJeu.set(i, prec);
        System.out.println("Après : " + joueursEnJeu);
    }
}
