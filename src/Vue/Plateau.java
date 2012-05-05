/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Modele.*;
import Vue.Configuration.CaseCoordonnee;
import Vue.Configuration.TuileBatiment;
import Vue.Outils.ImagePanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Loïc Cimon
 */
public class Plateau extends ImagePanel implements MouseListener {

    private List<Case> batimentsSpeciaux;
    private List<Case> batimentsNormaux;
    private List<Joueur> joueurs;
    private Prevot prevot;
    private Bailli bailli;
    
    public Plateau(List<Joueur> joueurs) {
        super("/Image/plateau.jpg");
        initComponents();
    }

    private void initComponents() {
        initPlateau();
        initBatimentNeutre();
        initPrevotBailli();
        this.addMouseListener(this);
    }

    private void initPlateau() {
        //TODO Ajouter case pour le chateau
        //TODO Ajouter case pour le pont
        
        //Case des batiments spéciaux
        batimentsSpeciaux = new ArrayList<>();
        Case tmp;
        int position = 1;
        for (Coordonnee c : CaseCoordonnee.getCoordBatimentSpeciaux()) {
            tmp = new Case(position++, c);
            this.add(tmp);
            batimentsSpeciaux.add(tmp);
        }
        
        //Batiment normaux
        batimentsNormaux = new ArrayList<>();
        for (Coordonnee c : CaseCoordonnee.getCoordBatiment()) {
            tmp = new Case(position++, c);
            this.add(tmp);
            batimentsNormaux.add(tmp);
        }
    }
    
    public void initInterfaceJoueur(){
        setPreferredSize(new Dimension(this.getWidth()+500, this.getHeight()));
        this.setBackground(new Color(254, 246, 199));
        InterfaceJoueur ij = new InterfaceJoueur(joueurs.get(0));
        ij.setBounds(510, 0, 489, 265);
        this.add(ij);
        this.setLayout(null);
    }
    public void initBatimentNeutre() {
        List<Batiment> batNeutre = new ArrayList<>(TuileBatiment.getBatimentsNeutres());
        Collections.shuffle(batNeutre);
        for (int i = 0 ; i < 6 ; i++) {
            batimentsNormaux.get(i).setBatiment(batNeutre.get(i));
        }
    }
    
    public void initPrevotBailli() {
        prevot = new Prevot(batimentsNormaux.get(6));
        bailli = new Bailli();
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

    public List<Joueur> getJoueur() {
        return joueurs;
    }
}
