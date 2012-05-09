/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Loïc Cimon
 */
public class Jeu {
    private List<Joueur> joueurs;
    private Bailli bailli;
    private Prevot prevot;

    public Jeu(List<Joueur> joueurs) {
        this.joueurs = joueurs;
        this.bailli = new Bailli();
        this.prevot = new Prevot();
    }

    public int getPositionBailli() {
        return bailli.getPosition();
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }
}
