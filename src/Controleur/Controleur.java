/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modele.Batiment;
import Modele.Jeu;
import Modele.Joueur;
import Vue.Case;
import Vue.Plateau;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Carlito De La Vega
 */
public class Controleur {

    private Plateau plateau;
    private Jeu jeu;

    public Controleur(List<Joueur> joueurs) {
        //On mélange les joueurs
        Collections.shuffle(joueurs);

        //On initialise le modèle et la vue
        this.jeu = new Jeu(joueurs);
        this.plateau = new Plateau(joueurs, this);
        
        this.gestionTourDeJeu();
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
                }
                else if (bat.getNom().compareTo("Hotel") == 0) {
                    bat.getProprio().setNbDenier(2);
                }
            }
        }

        //Mise à jour du panel d'information du joueur actif
        plateau.majInterfaceJoueur(jeu.getJoueurs().get(0));
    }
    
    public void phasePlacementDesOuvriers() {
        
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

    public List<Joueur> getJoueurs() {
        return jeu.getJoueurs();
    }

    public Plateau getPlateau() {
        return plateau;
    }
}