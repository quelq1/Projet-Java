package Modele;

import java.util.ArrayList;
import java.util.List;

public class Joueur {

    private String nom;
    private int nbDeniers;
    private int nbPrestige;
    private List<Ressource> ressources;
    private List<Ouvrier> ouvriers;

    public Joueur(String nom) {
        this.nom = nom;
        this.nbDeniers = 0;
        this.nbPrestige = 0;

        this.ressources = new ArrayList<>();
        ressources.add(new Ressource("Bois", 1));
        ressources.add(new Ressource("Nourriture", 2));

        this.ouvriers = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            this.ouvriers.add(new Ouvrier(this));
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbDenier() {
        return nbDeniers;
    }

    public void setNbDenier(int nbDenier) {
        this.nbDeniers += nbDenier;
    }

    public int getNbPrestige() {
        return nbPrestige;
    }

    public void setNbPrestige(int nbPrestige) {
        this.nbPrestige += nbPrestige;
    }
}
