/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Batiments.Speciaux;

import Modele.Batiments.BatimentSpeciaux;
import Modele.Jeu;
import Modele.Joueur;
import Vue.Case;
import Vue.Plateau;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlito De La Vega
 */


public class Ecuries extends BatimentSpeciaux{

    private Joueur place1;
    private Joueur place2;
    private Joueur place3;
    
    public Ecuries(Joueur j1,Joueur j2,Joueur j3 ) {
        super("Ecuries", "/Image/BatimentNeutre/vide.png");
        this.place1 = j1;
        this.place2 = j2;
        this.place3 = j3;
        
    }
    public void activerBatiment(Plateau plateau, Jeu jeu) {
        jeu.setJoueurs(ecurie(jeu.getJoueurs(), this));
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
        getOuvrier().setDispo(true);
    }

    public List<Joueur> ecurie(List<Joueur> list, Ecuries e) {
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
    public Joueur getPlace1() {
        return place1;
    }

    public Joueur getPlace2() {
        return place2;
    }

    public Joueur getPlace3() {
        return place3;
    }
    
    
}
