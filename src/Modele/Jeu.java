/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import Modele.Batiments.Batiment;
import Modele.Batiments.BatimentNormal;
import Modele.Batiments.BatimentSpeciaux;
import Modele.Batiments.Normal.Residence;
import Vue.Configuration.GlobalSettings;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Loïc Cimon
 */
public class Jeu implements GlobalSettings {

    private Bailli bailli;
    private Prevot prevot;
    private List<Joueur> joueurs;
    private List<Joueur> fileFinDePose;
    private List<Joueur> fileChateau;
    private List<BatimentSpeciaux> batimentsSpeciaux;
    private List<BatimentNormal> batimentsNormaux;
    private int decompte;

    public Jeu() {
        this.bailli = new Bailli(CASE_INI_BAILLI_PREVOT);
        this.prevot = new Prevot(CASE_INI_BAILLI_PREVOT);

        this.fileFinDePose = new ArrayList<>();
        this.fileChateau = new ArrayList<>();
        this.batimentsSpeciaux = new ArrayList<>();
        this.batimentsNormaux = new ArrayList<>();
        this.decompte = 0;
    }

    public int getPositionBailli() {
        return bailli.getPosition();
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public void addBatimentNormal(BatimentNormal batiment) {
        batimentsNormaux.add(batiment);
    }

    public List<BatimentNormal> getBatimentsNormaux() {
        return batimentsNormaux;
    }

    public void addBatimentSpeciaux(BatimentSpeciaux batiment) {
        batimentsSpeciaux.add(batiment);
    }

    public List<BatimentSpeciaux> getBatimentsSpeciaux() {
        return batimentsSpeciaux;
    }

    public Batiment getBatiment(int i) {
        //On décrémente, les cases commencent à 1 sur le plateau
        i--;
        Batiment batiment = null;
        if (0 <= i && i < batimentsSpeciaux.size()) {
            batiment = batimentsSpeciaux.get(i);
        }

        if (6 <= i && i < batimentsNormaux.size() + 6) {
            batiment = batimentsNormaux.get(i - 6);
        }

        return batiment;
    }

    public int getPlaceLibreFinDePose() {
        return fileFinDePose.size();
    }

    public int getPrixPose() {
        // + 1 pck commence à 0
        return fileFinDePose.size() + 1;
    }

    public boolean isSelectable(int posCase) {
        boolean res = false;
        //Si batiment != null
        //et placeDispo
        Batiment bat = getBatiment(posCase);
        if (bat != null && bat.getOuvrier() == null) {
            // Interdit pour les Résidence
            //TODO bloquer les batiments de Prestiges également
            if (!(bat instanceof Residence)) {
                res = true;
            }
        }
        return res;
    }

    public List<Joueur> getListeFinDePose() {
        return fileFinDePose;
    }

    public void resetFileFinDePose() {
        this.fileFinDePose.clear();
    }
    

    public int getPositionPrevot() {
        return prevot.getPosition();
    }

    public void deplacerPrevot(int nb) {
        prevot.deplacer(nb);
    }
    
    public void setPrevot(int nb) {
        prevot.setPosition(nb);
    }
    
    public void deplacerBailli(int nb) {
        bailli.deplacer(nb);
    }

    public int getProchainDecompte() {
        return decompte;
    }
    
    public void addDecompte() {
        decompte++;
    }
    
}
