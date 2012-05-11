/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Controleur.Controleur;
import Modele.Coordonnee;
import Vue.Outils.ImagePanel;
import java.awt.Color;
import javax.swing.border.LineBorder;

/**
 *
 * @author Loïc Cimon
 */
public class CaseChateau extends Case {

    public CaseChateau(int position, Coordonnee coord) {
        super(position, coord);
    }

    @Override
    protected void initComponents() {
        this.setBounds(coord.getX(), coord.getY(), 220, 125);
    }
    
    @Override
    public void setOuvrier(String couleur) {
        Controleur.getInstance().getPlateau().addPlacementChateau(couleur);
        this.repaint();
    }
    
    @Override
    public void selected() {
        super.selected();
        this.repaint();
        this.validate();
        this.revalidate();
    }
    
}
