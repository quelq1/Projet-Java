/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modele.Batiment;
import Modele.Jeu;
import Modele.Joueur;
import Vue.ActionsPossibles.PanelPlacementOuvriers;
import Vue.Case;
import Vue.Configuration.TuileBatiment;
import Vue.Plateau;
import java.util.Collections;
import java.util.List;

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
            jeu.addBatimentNeutre(TuileBatiment.getBatimentsNeutres().get(i));
        }

        //Création
        plateau.initBailliPrevot();

        plateau.initJoueurs(jeu.getJoueurs());
        plateau.initInterfaceJoueur(jeu.getJoueurs().get(0));

        //Lance le jeu
//        this.gestionTourDeJeu();
    }

    private void gestionTourDeJeu() {
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
        //On ajoute 2 deniers à tous les joueurs
        for (Joueur j : jeu.getJoueurs()) {
            j.setNbDenier(2);
        }

        //On ajoute :
        //  - 1 denier aux proprios de résidence et bibliothèque
        //  - 2 deniers aux proprios de l'hotel
        Batiment bat;
        for (Case c : plateau.getCaseBatimentsNormaux()) {
            bat = c.getBatiment();
            if (bat != null) {
                if (bat.getNom().compareTo("Résidence") == 0
                        || bat.getNom().compareTo("Bibliothèque") == 0) {
                    bat.getProprio().setNbDenier(1);
                } else if (bat.getNom().compareTo("Hotel") == 0) {
                    bat.getProprio().setNbDenier(2);
                }
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
        if (caseSelected != null) {
            //Paye pour placer
            joueurActif.setNbDenier(this.getPrixPose());

            //Ajout des points de prestige
            if (caseSelected.getProprietaire() != null && !caseSelected.estProprietaire(joueurActif)) {
                caseSelected.getProprietaire().setNbPrestige(1);
            }

            //On place l'ouvrier sur la case
            caseSelected.setOuvrier(joueurActif);
        }
    }

    public int getPrixPose() {
        int prix;
        if (caseSelected.estProprietaire(joueurActif)) {
            prix = -1;
        } else {
            //plus petit numéro non occupé de la ligne de fin de pose
            prix = plateau.getCaseFinDePose().size() + 1;
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
    
    public void addBatimentNeutre(int i, Batiment batiment) {
        plateau.addBatimentNeutre(i, batiment);
    }
}