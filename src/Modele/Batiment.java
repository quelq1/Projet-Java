package Modele;

public abstract class Batiment {

    private final String nomIcone;
    private String nom;
    private Joueur proprio;
    private Ouvrier occupe;

    public Batiment(String nom, String nomIcone) {
        this.nom = nom;
        this.proprio = null;
        this.nomIcone = nomIcone;
        occupe = null;
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

    public Ouvrier getOccupe() {
        return occupe;
    }

    public void setOccupe(Ouvrier occupe) {
        this.occupe = occupe;
    }

    public String getNomIcone() {
        return nomIcone;
    }

    public abstract void activerBatiment();
}
