/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modele.Batiments.Speciaux.Ecuries;
import Modele.Batiments.Speciaux.Auberge;
import Modele.Batiments.Speciaux.Porte;
import Modele.Batiments.Speciaux.Guilde;
import Modele.Batiments.Speciaux.Comptoir;
import Modele.Batiments.Speciaux.Champs;
import Modele.Batiment;

import Modele.Batiments.*;

import Modele.Jeu;


import Modele.Joueur;
import Vue.ActionsPossibles.PanelPlacementOuvriers;
import Vue.Case;

import Vue.Configuration.TuileBatiment;
import java.util.Collections;

import Vue.InterfaceJoueur;
import Vue.Plateau;
import java.util.ArrayList;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlito De La Vega
 */
public class Controleur {

    private static Controleur controleur;
    private Plateau plateau;
    private Jeu jeu;
    private Case caseSelected;
    private Joueur joueurActif;

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
    }

    public void initialisation() {
        //Création des batiments neutres de manière aléatoire
        Collections.shuffle(TuileBatiment.getBatimentsNeutres());
        for (int i = 0; i < 6; i++) {
            this.addBatiment(TuileBatiment.getBatimentsNeutres().get(i));
        }

        //Création
        plateau.initBailliPrevot();

        plateau.initJoueurs(jeu.getJoueurs());
        plateau.initInterfaceJoueur(jeu.getJoueurs().get(0));

        //Lance le jeu
        this.gestionTourDeJeu();
    }

    private void gestionTourDeJeu() {
        boolean fin = false;
        //while (!fin){
        // méthode qui gère la phase de collecte des revenus
        phaseCollecteDesRevenus();
        // méthode qui gère la phase du placement des ouvriers
//        phasePlacementDesOuvriers();
        // méthode qui gère l'activation des bâtiments spéciaux
        // méthode qui gère le déplacement du prévot
        // méthode qui gère l'activation des batiments
        // méthode qui gère la construction du château
        // méthode qui gère la fin du gestionTourDeJeu, si elle renvoie true le jeu est fini.
        //}
    }

    public void phaseCollecteDesRevenus() {
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

        //Mise à jour du panel d'information du joueur actif
        plateau.majInterfaceJoueur(jeu.getJoueurs().get(0));
    }

    public void phasePlacementDesOuvriers() {
        //Mise à jour du panneau d'action
        plateau.majActionJoueur(new PanelPlacementOuvriers());

        joueurActif = jeu.getJoueurs().get(0);

    }

    public void traitementPlacementDesOuvriers() {
//        if (caseSelected != null) {
//            //On récupère le batiment correspondant
//            Batiment batiment = jeu.getBatimentsNormaux().get(caseSelected.getPosition());
//            //Paye pour placer
//            joueurActif.setNbDenier(this.getPrixPose());
//
//            //Ajout des points de prestige
//            if (caseSelected.getProprietaire() != null && !caseSelected.estProprietaire(joueurActif)) {
//                caseSelected.getProprietaire().setNbPrestige(1);
//            }
//
//            //On place l'ouvrier sur la case
//            caseSelected.setOuvrier(joueurActif);
//        }
    }

//    public int getPrixPose() {
//        int prix;
//        if (caseSelected.estProprietaire(joueurActif)) {
//            prix = -1;
//        } else {
//            //plus petit numéro non occupé de la ligne de fin de pose
//            prix = plateau.getCaseFinDePose().size() + 1;
//        }
//        return prix;
//    }
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
        if (this.caseSelected != null) {
            //On déselectionne la case d'avant
            this.caseSelected.deSelected();
        }
        this.caseSelected = selected;
        this.caseSelected.selected();
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
        }
    }

    
    public void activerBatiment(Batiment bat) {
        if(bat instanceof BatimentSpeciaux ){
            activerBatimentSpeciaux(bat);
        }else{
            if(bat instanceof BatimentNormal){
                activerBatimentNormal(bat);
            }else{
                // faire prestige et residentiel
            }
        }
    }

    public void activerBatimentSpeciaux(Batiment bat) {
       // Joueur j = null;
        if (bat instanceof Porte) {
            bat.getOccupe().setDispo(true);
        } else {
            if (bat instanceof Comptoir) {
                bat.getOccupe().getPatron().setNbDenier(3);
                bat.getOccupe().setDispo(true);
            } else {
                if (bat instanceof Guilde) {
                    String reponse;
                    String message = "De combien de cases voulez vous bouger le prévôt?";
                    reponse = JOptionPane.showInputDialog(null, message);
                    System.out.println("reponse : " + Integer.parseInt(reponse));
                    bat.getOccupe().setDispo(true);
                    // voir pour mettre l'image du prevot a jour 
                } else {
                    if (bat instanceof Champs) {
                        int reponse = JOptionPane.showConfirmDialog(plateau,"Voulez-vous acheter une faveur",
                                "Champs de Joute",
                                JOptionPane.YES_NO_OPTION);
                        if (reponse == JOptionPane.YES_OPTION) {
                            bat.getOccupe().getPatron().setNbDenier(-1);
                            bat.getOccupe().getPatron().addNbRessource("Tissu", -1);
                            bat.getOccupe().getPatron().setNbPrestige(3);
                        } 
                        bat.getOccupe().setDispo(true);
                    } else {
                        if (bat instanceof Ecuries) {
                            jeu.setJoueurs(ecurie(jeu.getJoueurs(),(Ecuries)bat));
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
                            bat.getOccupe().setDispo(true);
                        } else {
                            if (bat instanceof Auberge) {
                                if(bat.getOccupe().getPatron() == joueurActif){
                                    int reponse = JOptionPane.showConfirmDialog(plateau, "Voulez-vous récupérer votre ouvrier",
                                        "Auberge",
                                        JOptionPane.YES_NO_OPTION);
                                    if (reponse == JOptionPane.YES_OPTION) {
                                        bat.getOccupe().setDispo(true);
                                        bat.getOccupe().getPatron().setCout(0);
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
    public List<Joueur> ecurie(List<Joueur> list, Ecuries e){
        List<Joueur> joueur = new ArrayList<>();
        if(e.getPlace1() != null){
            joueur.add(e.getPlace1());
        }else{
            if(e.getPlace2() != null){
                joueur.add(e.getPlace2());
            }else{
                if(e.getPlace3() != null){
                    joueur.add(e.getPlace3());
                }
            }
        }
        for(int i = 0; i<list.size();i++){
            if(!joueur.contains(list.get(i))){
                joueur.add(list.get(i));
            }
        }
        return joueur;
    }

    private void activerBatimentNormal(Batiment bat) {
        
    }
    
}
