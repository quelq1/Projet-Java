/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Modele.*;
import Vue.Configuration.CaseCoordonnee;
import Vue.Configuration.TuileBatiment;
import Vue.Outils.ImagePanel;
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
        this.joueurs = joueurs;
        this.prevot = new Prevot();
        this.bailli = new Bailli();
        initComponents();
    }

    private void initComponents() {
        initPlateau();
        initBatimentNeutre();
        initBailliPrevot();
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
    
    public void initBatimentNeutre() {
        List<Batiment> batNeutre = new ArrayList<>(TuileBatiment.getBatimentsNeutres());
        Collections.shuffle(batNeutre);
        for (int i = 0 ; i < 6 ; i++) {
            batimentsNormaux.get(i).setBatiment(batNeutre.get(i));
        }
    }
    
    public void initBailliPrevot() {
        batimentsNormaux.get(5).addBailli();
        batimentsNormaux.get(5).addPrevot();
        
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("X : "+ me.getX() +"| Y : " + me.getY());
        System.out.println("Case 6 X : "+ batimentsNormaux.get(5).getX() +"| Case Y : " + batimentsNormaux.get(5).getY());
        System.out.println("Bailli X : "+ batimentsNormaux.get(5).getBailli().getX() +"| Bailli Y : " + batimentsNormaux.get(5).getBailli().getY());
        
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
