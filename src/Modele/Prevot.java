/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import Vue.Case;

/**
 *
 * @author Loïc Cimon
 */
public class Prevot {
    private Case caseCourante;
    private final String nomIcone = "/Image/prevot.jpg";

    public Prevot(Case caseCourante) {
        this.caseCourante = caseCourante;
    }

    public int getPosition() {
        return caseCourante.getPosition();
    }

    public void deplacer(Case c) {
        this.caseCourante = c;
    }
    
    public String getNomIcone() {
        return nomIcone;
    }
}
