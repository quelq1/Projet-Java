/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Modele.Batiment;
import Modele.Batiments.*;
import Modele.Coordonnee;
import Vue.Configuration.CaseCoordonnee;
import Vue.Configuration.TuileBatiment;
import Vue.Outils.ImagePanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.AbstractList;
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
    
    public Plateau() {
        super("/Image/plateau.jpg");
        
        initComponents();
    }

    private void initComponents() {
        initCases();
        initBatimentNeutre();
        this.addMouseListener(this);
    }

    private void initCases() {
        //TODO Ajouter case pour le chateau
        //TODO Ajouter case pour le pont
        
        //Case des batiments spéciaux
        batimentsSpeciaux = new ArrayList<>();
        Case tmp;
        for (Coordonnee c : CaseCoordonnee.getCoordBatimentSpeciaux()) {
            tmp = new Case(c);
            this.add(tmp);
            batimentsSpeciaux.add(tmp);
        }
        
        //Batiment normaux
        batimentsNormaux = new ArrayList<>();
//        tmp = new Case(CaseCoordonnee.getCoordBatiment().get(0), new Ferme());
//        this.add(tmp);
//        batimentsNormaux.add(tmp);
//        tmp = new Case(CaseCoordonnee.getCoordBatiment().get(1), new Carriere());
//        this.add(tmp);
//        batimentsNormaux.add(tmp);
//        tmp = new Case(CaseCoordonnee.getCoordBatiment().get(2), new Charpentier());
//        this.add(tmp);
//        batimentsNormaux.add(tmp);
//        tmp = new Case(CaseCoordonnee.getCoordBatiment().get(3), new Foret());
//        this.add(tmp);
//        batimentsNormaux.add(tmp);
//        tmp = new Case(CaseCoordonnee.getCoordBatiment().get(4), new Marche());
//        this.add(tmp);
//        batimentsNormaux.add(tmp);
//        tmp = new Case(CaseCoordonnee.getCoordBatiment().get(5), new Scierie());
//        this.add(tmp);
//        batimentsNormaux.add(tmp);
            
        for (Coordonnee c : CaseCoordonnee.getCoordBatiment()) {
            tmp = new Case(c);
            this.add(tmp);
            batimentsNormaux.add(tmp);
        }
    }
    
    public void initBatimentNeutre() {
        List<Batiment> batNeutre = new ArrayList<>(TuileBatiment.getBatimentsNeutres());
        Collections.shuffle(batNeutre);
        for (int i = 0 ; i < 6 ; i++) {
            batimentsNormaux.get(i).setBatiment(batNeutre.get(i));
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
