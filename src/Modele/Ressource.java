package Modele;

public class Ressource {

    private String nom;
    private int quantite;

    public Ressource(String nom) {
        this.nom = nom;
    }
    
    public Ressource(String nom, int quantite) {
        this.nom = nom;
        this.quantite = quantite;
    }
    
    public String getNom() {
        return nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
    public void addQuantite(int n) {
        this.quantite += n;
    }

    @Override
    public String toString() {
        return quantite + " " + nom;
    }
    
}
