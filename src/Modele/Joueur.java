package Modele;

import java.util.*;

public class Joueur {

    private String nom;
    private String couleur;
    private int nbDeniers;
    private int nbPrestige;
    private Map<String, Ressource> ressources;
    private Map<String, Integer> batimentConstruit;
    private List<Ouvrier> ouvriers;
    //permet de savoir si le joueur paye a plein tarif(auberge)
    private int cout;
    //Indique si le joueur joue encore pour la phase en cours
    private boolean enJeu;

    public Joueur(String nom, String couleur) {
        this.nom = nom;
        this.couleur = couleur;
        this.nbDeniers = 0;
        this.nbPrestige = 0;
        this.cout = 0;
        this.enJeu = false;

        this.ressources = new HashMap<>();
        this.ressources.put("Bois", new Ressource("Bois", 1));
        this.ressources.put("Nourriture", new Ressource("Nourriture", 2));

        this.batimentConstruit = new HashMap<>();
        this.batimentConstruit.put("Bois", 0);
        this.batimentConstruit.put("Pierre", 0);
        this.batimentConstruit.put("Prestige", 0);
        this.batimentConstruit.put("Residentiel", 0);

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

    public String getCouleur() {
        return couleur;
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

    public int getNbRessource(String nom) {
        Ressource res = ressources.get(nom);
        int q = 0;
        if (res != null) {
            q = res.getQuantite();
        }
        return q;
    }

    public void addNbRessource(String nom, int qte) {
        Ressource res = ressources.get(nom);
        if (res != null) {
            res.addQuantite(qte);
        }
    }

    public void incrBatimentConstruit(String type) {
        int prec = this.getBatimentConstruit(type);
        this.batimentConstruit.put(type, ++prec);
    }

    public int getBatimentConstruit(String type) {
        return this.batimentConstruit.get(type);
    }

    public Ouvrier getOuvrierDispo() {
        boolean trouve = false;
        Iterator<Ouvrier> iOuvriers = ouvriers.iterator();
        Ouvrier res = null;
        while (iOuvriers.hasNext() && !trouve) {
            res = iOuvriers.next();
            if (!res.isDispo()) {
                res = null;
            } else {
                trouve = true;
            }
        }
        return res;
    }

    public void setCout(int i) {
        this.cout = i;
    }

    public boolean isEnJeu() {
        return enJeu;
    }

    public void setEnJeu(boolean enJeu) {
        this.enJeu = enJeu;
    }
}
