/*
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Modele.Coordonnee;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Loïc Cimon
 */
public class Case extends JPanel {
    
    private Coordonnee coord;

    public Case(Coordonnee coord) {
        this.coord = coord;
        
        initComponents();
    }

    private void initComponents() {
        this.setBounds(coord.getX(), coord.getY(), 52, 48);
        this.setBackground(Color.red);
    }
    
}
