/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Modele.Batiments.Batiment;
import Modele.Batiments.BatimentNormal;
import Modele.Coordonnee;
import Modele.Joueur;
import Vue.Configuration.CaseCoordonnee;
import Vue.Outils.ImagePanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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

        Case tmp;
        casePlacementChateau = new ArrayList<>();
        for (Coordonnee coord : CaseCoordonnee.getCoordChateau()) {
            tmp = new Case(0, coord);
            interfacePlateau.add(tmp);
            casePlacementChateau.add(tmp);
        }

        //Case pour l'ordre du gestionTourDeJeu, on crée les cases au fur et à mesure
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

        //Case pour la fin de pose, on crée les cases au fur et à mesure
        caseFinDePose = new ArrayList<>();


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
        caseBatimentsSpeciaux.get(i).setBatiment(batiment);
    }

    public void initBailliPrevot() {
        caseBatimentsNormaux.get(5).addPrevot();
        caseBatimentsNormaux.get(5).addBailli();
    }

    public List<Case> getCaseBatimentsNormaux() {
        return caseBatimentsNormaux;
    }

    public void setPhaseJeu(String phase) {
        interfaceJoueur.setPhase(phase);
    }

    public void setInterfaceJoueur(Joueur joueur) {
        interfaceJoueur.majInformations(joueur);
    }

    public void setActionJoueur(JPanel action) {
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

    public List<Case> getCaseBatimentsSpeciaux() {
        return caseBatimentsSpeciaux;
    }

    public List<Case> getCaseOrdreTour() {
        return caseOrdreTour;
    }

    public List<Case> getCasePlacementChateau() {
        return casePlacementChateau;
    }

    public InterfaceJoueur getInterfaceJoueur() {
        return interfaceJoueur;
    }

    public ImagePanel getInterfacePlateau() {
        return interfacePlateau;
    }    

    public void addFileFinDePose(String couleur, int pos) {
        System.out.println(couleur);
        Case tmp = new Case(0, CaseCoordonnee.getCoordFinDePose(pos));
        interfacePlateau.add(tmp);
        caseFinDePose.add(tmp);
        tmp.setImage("/Image/Marqueur/" + couleur + ".jpg");
    }

    public void showMessage(String message, String titre, int type) {
        JOptionPane.showMessageDialog(this, message, titre, type);
    }
}
