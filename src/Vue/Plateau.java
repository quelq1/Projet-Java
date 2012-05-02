/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Modele.Coordonnee;
import Vue.Configuration.CoordonneCase;
import Vue.Outils.ImagePanel;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Loïc Cimon
 */
public class Plateau extends ImagePanel implements MouseListener {

    private List<Case> batimentsSpeciaux;
    private List<Case> batimentsNormaux;
    
    public Plateau() {
        super("/Image/plateau.jpg");
        
        initCases();
        initComponents();
    }

    private void initComponents() {

        this.addMouseListener(this);
    }

    private void initCases() {
        //TODO Ajouter case pour le chateau
        
        batimentsSpeciaux = new ArrayList<>();
        Case tmp;
        for (Coordonnee c : CoordonneCase.getCoordBatimentSpeciaux()) {
            tmp = new Case(c);
            this.add(tmp);
            batimentsSpeciaux.add(tmp);
        }
        
        batimentsNormaux = new ArrayList<>();
        for (Coordonnee c : CoordonneCase.getCoordBatiment()) {
            tmp = new Case(c);
            this.add(tmp);
            batimentsNormaux.add(tmp);
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("X : "+ me.getX() +"| Y : " + me.getY());
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
}
