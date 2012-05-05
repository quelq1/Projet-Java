/*
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Modele.Batiment;
import Modele.Coordonnee;
import Vue.Outils.ImagePanel;

/**
 *
 * @author Loïc Cimon
 */
public class Case extends ImagePanel {
    
    private int position;
    private Coordonnee coord;
    private Batiment batiment;

    public Case(int position, Coordonnee coord) {
        super("/Image/vide.png");
        this.position = position;
        this.coord = coord;
        batiment = null;
        
        initComponents();
    }
    
    public Case(Coordonnee coord, Batiment batiment) {
        super(batiment.getNomIcone());
        this.coord = coord;
        this.batiment = batiment;
        
        initComponents();
    }
    
    public void setBatiment(Batiment batiment) {
        this.batiment = batiment;
        this.setImage(batiment.getNomIcone());
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
    private void initComponents() {
        this.setBounds(coord.getX(), coord.getY(), 52, 48);
    }
    
}
