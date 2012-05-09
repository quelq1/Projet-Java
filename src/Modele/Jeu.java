/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import Controleur.Controleur;
import Vue.Case;
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
    private List<Batiment> batimentsNormaux;

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

    public void addBatimentNeutre(Batiment batiment) {
        batimentsNormaux.add(batiment);
        //Lorsqu'un batiment est crée, on dit au controleur de mettre à jour la vue
        Controleur.getInstance().addBatimentNeutre(batimentsNormaux.indexOf(batiment), batiment);
    }
}
