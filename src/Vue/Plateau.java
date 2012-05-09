/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Controleur.Controleur;
import Modele.Batiment;
import Modele.Coordonnee;
import Modele.Joueur;
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
    private List<Case> caseFinDePose;
    private List<Case> casePlacementChateau;
    private List<Case> caseBatimentsSpeciaux;
    private List<Case> caseBatimentsNormaux;
    private List<Case> caseBatimentsPont;
    private List<Joueur> joueurs;
    private Case position;
    private int tour;

    public Plateau(List<Joueur> joueurs) {

        this.joueurs = joueurs;
        tour = 0;
        position = new Case();
        initComponents();
        Controleur controleur = new Controleur();
        controleur.tour(joueurs, caseBatimentsNormaux,caseBatimentsSpeciaux, interfaceJoueur, interfacePlateau);
    }

    private void initComponents() {
        this.setLayout(new BorderLayout());

        this.initPlateau();
        this.initJoueurs();
        this.initInterfaceJoueur();

        this.addMouseListener(this);
    }

    private void initPlateau() {
        //Panel du plateau du jeu
        interfacePlateau = new ImagePanel("/Image/plateau.jpg");
        this.add(interfacePlateau, BorderLayout.WEST);

        /*TODO Ajouter case pour les murailles, tours et donjon, 
         * mettre les cases dans 3 panels avec un FlowLayout
         * ou
         * remplacer toutes les cases, par 3 labels avec le nombre d'éléments construit ou restant (plus simple)
         */
        Case tmp;
        casePlacementChateau = new ArrayList<>();
        for (Coordonnee coord :CaseCoordonnee.getCoordChateau()) {
            tmp = new Case(0, coord);
            interfacePlateau.add(tmp);
            casePlacementChateau.add(tmp);
        }

        //Case pour l'ordre du tour
        caseOrdreTour = new ArrayList<>();
        for (Coordonnee coord :CaseCoordonnee.getCoordOrdreTour()) {
            tmp = new Case(0, coord);
            interfacePlateau.add(tmp);
            caseOrdreTour.add(tmp);
        }
        
        //Case des batiments spéciaux
        caseBatimentsSpeciaux = new ArrayList<>();
        int position = 1;
        for (Coordonnee coord : CaseCoordonnee.getCoordBatimentSpeciaux()) {
            tmp = new Case(position++, coord);
            interfacePlateau.add(tmp);
            caseBatimentsSpeciaux.add(tmp);
        }
        
        //
        caseBatimentsPont = new ArrayList<>();
        for (Coordonnee coord :CaseCoordonnee.getCoordChateau()) {
            tmp = new Case(0, coord);
            interfacePlateau.add(tmp);
            casePlacementChateau.add(tmp);
        }
        //Case pour la fin de pose
        caseFinDePose = new ArrayList<>();
        for (Coordonnee coord : CaseCoordonnee.getCoordFinDePose()) {
            tmp = new Case(0, coord);
            interfacePlateau.add(tmp);
            caseFinDePose.add(tmp);
        }
        
        //Case pour les batiment normaux
        caseBatimentsNormaux = new ArrayList<>();
        for (Coordonnee coord : CaseCoordonnee.getCoordBatiment()) {
            System.out.println("position" + position);
            tmp = new Case(position++, coord);
            interfacePlateau.add(tmp);
            caseBatimentsNormaux.add(tmp);
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
            caseBatimentsNormaux.get(i).setBatiment(batNeutre.get(i));
        }
    }

    private void initBailliPrevot() {
        caseBatimentsNormaux.get(5).addPrevot();
        caseBatimentsNormaux.get(5).addBailli();
    }
    
    // a peut être changer de class

    
    public List<Joueur> getJoueur() {
        return joueurs;
    }
    
    public void placementOuvrier(){
        int fin = 0;
        while (fin != joueurs.size()){
            
        }
    }

      public Case retournePosition(int x, int y,List<Case> caseBatimentsSpeciaux, List<Case> caseBatimentsNormaux, List<Case> caseBatimentsChateau, List<Case> caseFinDePose){
        Case cc = new Case();
          for(int i =0; i<6; i++){
            if((x <= caseBatimentsSpeciaux.get(i).getCoord().getX()+52) && (x >= caseBatimentsSpeciaux.get(i).getCoord().getX()) && (y<=caseBatimentsSpeciaux.get(i).getCoord().getY()+48) && (y >= caseBatimentsSpeciaux.get(i).getCoord().getY())){
                System.out.println(i +" == "+caseBatimentsSpeciaux.get(i).getPosition());
                cc =  caseBatimentsSpeciaux.get(i);
                
            }
        }
        for(int j =0; j<28; j++){
            if((x <= caseBatimentsNormaux.get(j).getCoord().getX()+52) && (x >= caseBatimentsNormaux.get(j).getCoord().getX()) && (y<=caseBatimentsNormaux.get(j).getCoord().getY()+48) && (y >= caseBatimentsNormaux.get(j).getCoord().getY())){
                System.out.println(j +" == "+caseBatimentsNormaux.get(j).getPosition());
                cc = caseBatimentsNormaux.get(j);
            }  
        }
        if((x <= 220) && (x >= 0) && (y<=175) && (y >= 0)){
            cc = caseBatimentsChateau.get(0);
        }   
        if((x <= 365) && (x >= 190) && (y<=305) && (y >= 238)){
            cc = caseFinDePose.get(0);
        }else{
            cc = null;
        }  
        return cc;
    }
    
    

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("X : " + me.getX() + "| Y : " + me.getY());
        System.out.println("Height : " + this.getTopLevelAncestor().getSize().getHeight());
        System.out.println("Width : " + this.getTopLevelAncestor().getSize().getWidth());
        position = retournePosition(me.getX(), me.getY(), caseBatimentsSpeciaux,caseBatimentsNormaux,casePlacementChateau,caseFinDePose);
        
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
