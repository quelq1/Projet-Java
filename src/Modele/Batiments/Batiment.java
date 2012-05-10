package Modele.Batiments;

import Modele.Joueur;
import Modele.Ouvrier;

public abstract class Batiment {

    private final String nomIcone;
    private String nom;
    private Joueur proprio;
    private Ouvrier ouvrier;

    public Batiment(String nom, String nomIcone) {
        this.nom = nom;
        this.proprio = null;
        this.nomIcone = nomIcone;
        this.ouvrier = null;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Joueur getProprio() {
        return proprio;
    }

    public void setProprio(Joueur proprio) {
        this.proprio = proprio;
    }
    
    public boolean estProprio(Joueur j) {
        return j.equals(proprio);
    }

    public Ouvrier getOuvrier() {
        return ouvrier;
    }

    public void setOuvrier(Ouvrier occupe) {
        this.ouvrier = occupe;
    }

    public String getNomIcone() {
        return nomIcone;
    }

    public abstract void activerBatiment();
}
