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

    public Bailli() {
        this.position = 6;
    }

    public void avancer(Prevot prevot) {
        if (prevot.getPosition() > position) {
            position++;
        } else {
            position += 2;
        }
    }

    public int getPosition() {
        return position;
    }
}
