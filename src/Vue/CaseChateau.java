/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Controleur.Controleur;
import Modele.Coordonnee;
import Vue.Outils.ImagePanel;

/**
 *
 * @author Loïc Cimon
 */
public class CaseChateau extends Case {

    public CaseChateau(int position, Coordonnee coord) {
        super(position, coord);
    }

    private void initComponents() {
        this.setBounds(coord.getX(), coord.getY(), 220, 130);
    }
    
    @Override
    public void setOuvrier(String couleur) {
        Controleur.getInstance().getPlateau().addPlacementChateau(couleur);
    }
}
