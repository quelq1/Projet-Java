/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import Modele.Batiments.BatimentNormal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Loïc Cimon
 */
public class Jeu {

    private Bailli bailli;
    private Prevot prevot;
    private List<Joueur> joueurs;
    private List<Joueur> listeFinDePose;
    private List<Batiment> chateau;
    private List<Batiment> batimentsSpeciaux;
    private List<BatimentNormal> batimentsNormaux;

    public Jeu() {
        this.bailli = new Bailli();
        this.prevot = new Prevot();

        this.listeFinDePose = new ArrayList<>();
        this.chateau = new ArrayList<>();
        this.batimentsSpeciaux = new ArrayList<>();
        this.batimentsNormaux = new ArrayList<>();
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
    
    public void addBatimentSpeciaux(Batiment batiment) {
        batimentsSpeciaux.add(batiment);
    }

    public List<Batiment> getBatimentsSpeciaux() {
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
            batiment =  batimentsNormaux.get(i-6);
        }
        
        return batiment;
    }
    
    public boolean isSelectable(int posCase) {
        boolean res = false;
        //Si batiment != null
        //et placeDispo
        Batiment bat = getBatiment(posCase);
        if (bat != null && bat.getOuvrier() == null) {
            res = true;
        }
        return res;
    }

    public List<Joueur> getListeFinDePose() {
        return listeFinDePose;
    }
}
