/*
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Modele.Batiment;
import Modele.Coordonnee;
import Vue.Outils.ImagePanel;
import java.awt.Color;

/**
 *
 * @author Loïc Cimon
 */
public class Case extends ImagePanel {
    
    private int position;
    private Coordonnee coord;
    private Batiment batiment;
    private ImagePanel bailli;
    private ImagePanel prevot;

    public Case(int position, Coordonnee coord) {
        super();
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

    public ImagePanel getBailli() {
        return bailli;
    }    
    
    public void addBailli() {
        bailli.setVisible(true);
    }
    
    public void rmBailli() {
        bailli.setVisible(false);
    }
    
    public void addPrevot() {
        prevot.setVisible(true);
    }
    
    public void rmPrevot() {
        prevot.setVisible(false);
    }
    
    private void initComponents() {
        this.setBounds(coord.getX(), coord.getY(), 52, 48);
        
        //Création du prévot
        prevot = new ImagePanel("/Image/prevot.png");
        prevot.setBounds(8, 37, 15, 10);
        prevot.setVisible(false);
        this.add(prevot);
        
        //Création du bailli
        bailli = new ImagePanel("/Image/bailli.png");
        bailli.setBounds(1, 27, 15, 16);
        bailli.setVisible(false);
        this.add(bailli);
    }
    
}
