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
    
    private Coordonnee coord;
    private Batiment batiment;

    public Case(Coordonnee coord) {
        super("/Image/vide.png");
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
//        System.out.println("Batiment : " + batiment.getNomIcone() + " - " + this);
    }
    
    private void initComponents() {
        this.setBounds(coord.getX(), coord.getY(), 52, 48);
    }
    
}
