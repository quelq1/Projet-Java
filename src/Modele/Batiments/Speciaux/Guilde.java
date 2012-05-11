/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Batiments.Speciaux;

import Controleur.Controleur;
import Modele.Batiments.BatimentSpeciaux;
import Vue.Fenetre;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlito De La Vega
 */
public class Guilde extends BatimentSpeciaux {

    public Guilde() {
        super("Guilde", "/Image/BatimentSpecial/guilde.png");
    }

    @Override
    public void activerBatiment() {

        Controleur.getInstance().deplacerPrevot();
    }
}