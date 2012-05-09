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
    private ImagePanel bailli;
    private ImagePanel prevot;

    public Case(int position, Coordonnee coord) {
        super();
        this.position = position;
        this.coord = coord;
        batiment = null;
        
        initComponents();
    }
    
       public Case(int position, Coordonnee coord, Batiment bat) {
        super();
        this.position = position;
        this.coord = coord;
        batiment = bat;
        
        initComponents();
    }
    
    public Case(){
        super();
    }

    public Coordonnee getCoord() {
        return coord;
    }
    
    

    public Batiment getBatiment() {
        return batiment;
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
        //Création du bailli
        bailli = new ImagePanel("/Image/bailli.png");
        bailli.setBounds(1, 27, 15, 16);
        this.add(bailli);        
    }
    
    public void rmBailli() {
        this.remove(bailli);
        bailli = null;
    }
    
    public void addPrevot() {
        //Création du prévot
        prevot = new ImagePanel("/Image/prevot.png");
        prevot.setBounds(8, 37, 15, 10);
        this.add(prevot);
    }
    
    public void rmPrevot() {
        this.remove(prevot);
        prevot = null;
    }
    
    private void initComponents() {
        this.setBounds(coord.getX(), coord.getY(), 52, 48);
    }
    
}
