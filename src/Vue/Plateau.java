/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Controleur.Controleur;
import Modele.Batiment;
import Modele.Batiments.BatimentNormal;
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

    public Plateau() {
        initComponents();
    }

    private void initComponents() {
        this.setLayout(new BorderLayout());

        this.initPlateau();

        this.addMouseListener(this);
    }

    private void initPlateau() {
        //Panel du plateau du jeu
        interfacePlateau = new ImagePanel("/Image/plateau.jpg");
        this.add(interfacePlateau, BorderLayout.WEST);

        /*
         * TODO Ajouter case pour les murailles, tours et donjon, mettre les
         * cases dans 3 panels avec un FlowLayout ou remplacer toutes les cases,
         * par 3 labels avec le nombre d'éléments construit ou restant (plus
         * simple)
         */
        Case tmp;
        casePlacementChateau = new ArrayList<>();
        for (Coordonnee coord : CaseCoordonnee.getCoordChateau()) {
            tmp = new Case(0, coord);

            interfacePlateau.add(tmp);
            casePlacementChateau.add(tmp);
        }

        //Case pour l'ordre du gestionTourDeJeu
        caseOrdreTour = new ArrayList<>();
        for (Coordonnee coord : CaseCoordonnee.getCoordOrdreTour()) {
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
            tmp = new Case(position++, coord);
            interfacePlateau.add(tmp);
            caseBatimentsNormaux.add(tmp);
        }
    }

    public void initInterfaceJoueur(Joueur joueur) {
        //Panel à droite du planteau
        JPanel panel = new JPanel();
        panel.setBackground(new Color(254, 246, 199));
        this.add(panel, BorderLayout.EAST);

        //Panel d'affichage des infos sur le gestionTourDeJeu
        interfaceJoueur = new InterfaceJoueur(joueur);
        panel.add(interfaceJoueur);

        //TODO Panel d'affichage pour les actions possibles
    }

    public void initJoueurs(List<Joueur> joueurs) {
        joueurs.get(0).setNbDenier(5);
        this.caseOrdreTour.get(0).setImage("/Image/Marqueur/" + joueurs.get(0).getCouleur() + ".jpg");

        joueurs.get(1).setNbDenier(6);
        this.caseOrdreTour.get(1).setImage("/Image/Marqueur/" + joueurs.get(1).getCouleur() + ".jpg");

        if (joueurs.size() > 2) {
            joueurs.get(2).setNbDenier(6);
            this.caseOrdreTour.get(2).setImage("/Image/Marqueur/" + joueurs.get(2).getCouleur() + ".jpg");

            if (joueurs.size() > 3) {
                joueurs.get(3).setNbDenier(7);
                this.caseOrdreTour.get(3).setImage("/Image/Marqueur/" + joueurs.get(3).getCouleur() + ".jpg");

                if (joueurs.size() > 4) {
                    joueurs.get(4).setNbDenier(7);
                    this.caseOrdreTour.get(4).setImage("/Image/Marqueur/" + joueurs.get(4).getCouleur() + ".jpg");
                }
            }
        }
    }

    public void addBatimentNormaux(int i, BatimentNormal batiment) {
        caseBatimentsNormaux.get(i).setBatiment(batiment);
    }

    public void addBatimentSpeciaux(int i, Batiment batiment) {
        caseBatimentsNormaux.get(i).setBatiment(batiment);
    }

    public void initBailliPrevot() {
        caseBatimentsNormaux.get(5).addPrevot();
        caseBatimentsNormaux.get(5).addBailli();
    }

    public List<Case> getCaseBatimentsNormaux() {
        return caseBatimentsNormaux;
    }

    public List<Case> getCaseFinDePose() {
        return caseFinDePose;
    }

    public void majInterfaceJoueur(Joueur joueur) {
        interfaceJoueur.majInformations(joueur);
    }

    public void majActionJoueur(JPanel action) {
        interfaceJoueur.setPanelAction(action);
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
