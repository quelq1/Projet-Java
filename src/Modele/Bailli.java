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
    private final String nomIcone = "/Image/bailli.jpg";

    public Bailli() {
        this.position = 12;
    }

    public void avancer(Prevot prevot) {
        if (prevot.getPosition() > position) {
            position++;
        } else {
            position += 2;
        }
    }

    public String getNomIcone() {
        return nomIcone;
    }

    public int getPosition() {
        return position;
    }
}
