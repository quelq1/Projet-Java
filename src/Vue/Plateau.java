/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Modele.*;
import Vue.Configuration.CaseCoordonnee;
import Vue.Configuration.TuileBatiment;
import Vue.Outils.ImagePanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Loïc Cimon
 */
public class Plateau extends JPanel implements MouseListener {

    private ImagePanel interfacePlateau;
    private InterfaceJoueur interfaceJoueur;
    private List<Case> caseOrdreTour;
    private List<Case> batimentsSpeciaux;
    private List<Case> caseFinDePose;
    private List<Case> batimentsNormaux;
    private List<Joueur> joueurs;

    public Plateau(List<Joueur> joueurs) {

        this.joueurs = joueurs;

        initComponents();
    }

    private void initComponents() {
        this.setLayout(new BorderLayout());

        this.initPlateau();
        this.initInterfaceJoueur();
        this.initJoueurs();

        this.addMouseListener(this);
    }

    private void initPlateau() {
        //Panel du plateau du jeu
        interfacePlateau = new ImagePanel("/Image/plateau.jpg");
        this.add(interfacePlateau, BorderLayout.CENTER);

        //TODO Ajouter case pour le chateau

        //Case pour l'ordre du tour
        Case tmp;
        caseOrdreTour = new ArrayList<>();
        for (Coordonnee coord :CaseCoordonnee.getCoordOrdreTour()) {
            tmp = new Case(0, coord);
            interfacePlateau.add(tmp);
            caseOrdreTour.add(tmp);
        }
        
        //Case des batiments spéciaux
        batimentsSpeciaux = new ArrayList<>();
        int position = 1;
        for (Coordonnee coord : CaseCoordonnee.getCoordBatimentSpeciaux()) {
            tmp = new Case(position++, coord);
            interfacePlateau.add(tmp);
            batimentsSpeciaux.add(tmp);
        }
        
        //Case pour la fin de pose
        caseFinDePose = new ArrayList<>();
        for (Coordonnee coord : CaseCoordonnee.getCoordFinDePose()) {
            tmp = new Case(0, coord);
            interfacePlateau.add(tmp);
            caseFinDePose.add(tmp);
        }
        
        //Case pour les batiment normaux
        batimentsNormaux = new ArrayList<>();
        for (Coordonnee coord : CaseCoordonnee.getCoordBatiment()) {
            tmp = new Case(position++, coord);
            interfacePlateau.add(tmp);
            batimentsNormaux.add(tmp);
        }

        initBatimentNeutre();
        initBailliPrevot();
    }

    private void initInterfaceJoueur() {
        //Panel à droite du planteau
        JPanel panel = new JPanel();
        panel.setBackground(new Color(254, 246, 199));
        this.add(panel, BorderLayout.EAST);

        //Panel d'affichage des infos sur le tour
        interfaceJoueur = new InterfaceJoueur(joueurs.get(0));
        panel.add(interfaceJoueur);

        //TODO Panel d'affichage pour les actions possibles
    }

    private void initJoueurs() {
        Collections.shuffle(joueurs);

        joueurs.get(0).setNbDenier(5);
        this.caseOrdreTour.get(0).setImage("/Image/Marqueur/"+joueurs.get(0).getCouleur()+".jpg");
        
        joueurs.get(1).setNbDenier(6);
        this.caseOrdreTour.get(1).setImage("/Image/Marqueur/"+joueurs.get(1).getCouleur()+".jpg");
        
        if (joueurs.size() > 2) {
            joueurs.get(2).setNbDenier(6);
            this.caseOrdreTour.get(2).setImage("/Image/Marqueur/"+joueurs.get(2).getCouleur()+".jpg");
            
            if (joueurs.size() > 3) {
                joueurs.get(3).setNbDenier(7);
                this.caseOrdreTour.get(3).setImage("/Image/Marqueur/"+joueurs.get(3).getCouleur()+".jpg");
                
                if (joueurs.size() > 4) {
                    joueurs.get(4).setNbDenier(7);
                    this.caseOrdreTour.get(4).setImage("/Image/Marqueur/"+joueurs.get(4).getCouleur()+".jpg");
                }
            }
        }
    }

    private void initBatimentNeutre() {
        List<Batiment> batNeutre = new ArrayList<>(TuileBatiment.getBatimentsNeutres());
        Collections.shuffle(batNeutre);
        for (int i = 0; i < 6; i++) {
            batimentsNormaux.get(i).setBatiment(batNeutre.get(i));
        }
    }

    private void initBailliPrevot() {
        batimentsNormaux.get(5).addPrevot();
        batimentsNormaux.get(5).addBailli();
    }

    public List<Joueur> getJoueur() {
        return joueurs;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("X : " + me.getX() + "| Y : " + me.getY());
        System.out.println("Height : " + this.getTopLevelAncestor().getSize().getHeight());
        System.out.println("Width : " + this.getTopLevelAncestor().getSize().getWidth());
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
