/*
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Controleur.Controleur;
import Modele.Batiments.Batiment;
import Modele.Coordonnee;
import Vue.Outils.ImagePanel;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.border.LineBorder;

/**
 *
 * @author Loïc Cimon
 */
public class Case extends ImagePanel implements MouseListener {

    private int position;
    private Coordonnee coord;
    private ImagePanel ouvrier;
    private ImagePanel bailli;
    private ImagePanel prevot;

    public Case(int position, Coordonnee coord) {
        super();
        this.position = position;
        this.coord = coord;
        this.ouvrier = null;
        this.bailli = null;
        this.prevot = null;

        this.initComponents();

        this.addMouseListener(this);
    }

    public Case() {
        super();
    }

    private void initComponents() {
        this.setBounds(coord.getX(), coord.getY(), 52, 48);
    }

    public Coordonnee getCoord() {
        return coord;
    }

    public void setBatiment(Batiment batiment) {
        this.setImage(batiment.getNomIcone());
    }

    public int getPosition() {
        return position;
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
        //Suppression de l'ancien s'il existe
        if (prevot != null) {
            this.remove(prevot);
            prevot = null;
        }
    }

    public void setOuvrier(String couleur) {
        ouvrier = new ImagePanel("/Image/Ouvrier/" + couleur + ".jpg");
        ouvrier.setBounds(10, 5, 29, 47);
        this.add(ouvrier);
        this.repaint();
    }

    public void rmOuvrier() {
        this.remove(ouvrier);
        ouvrier = null;
    }

    public void selected() {
        this.setBorder(new LineBorder(Color.red));
        this.repaint();
    }

    public void deSelected() {
        this.setBorder(null);
        this.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(this)) {
            Controleur.getInstance().selectedCase(this);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
