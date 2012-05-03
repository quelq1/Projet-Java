/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import javax.swing.JFrame;

/**
 *
 * @author Loïc Cimon
 */
public class Fenetre extends JFrame {

    public Fenetre() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Caylus");
        this.setContentPane(new choixJoueurPanel());
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
    }

    public void affichePlateau() {
        this.setContentPane(new Plateau());
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        //TODO Supprimer redimensionnement
        this.setResizable(true);
    }

    public static void main(String[] args) {
        new Fenetre();
    }
}
