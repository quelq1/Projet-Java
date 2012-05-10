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
    private List<Batiment> listeFinDePose;
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
        i--;
        if (0 <= i && i < batimentsSpeciaux.size()) {
            System.out.println("Click sur un batiment Spécial");
            return batimentsSpeciaux.get(i);
        }
        
        if (6 <= i && i < batimentsNormaux.size() + 6) {
            System.out.println("Click sur un batiment normal" );
            return batimentsNormaux.get(i-6);
        }
        
        return null;
    }
}
