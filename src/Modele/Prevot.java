/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author Loïc Cimon
 */
public class Prevot {
    private int position;
    private final String nomIcone = "/Image/prevot.jpg";

    public Prevot() {
        this.position = 12;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void deplacer(int position) {
        this.position += position;
    }
    
    public String getNomIcone() {
        return nomIcone;
    }
}
