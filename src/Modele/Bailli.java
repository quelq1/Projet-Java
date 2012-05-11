/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author Loïc Cimon
 */
public class Bailli {

    private int position;

    public Bailli(int p) {
        this.position = p;
    }

    public void deplacer(int nb) {
        position += nb;
    }

    public int getPosition() {
        return position;
    }
}
