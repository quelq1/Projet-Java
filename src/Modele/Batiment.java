package Modele;

public abstract class Batiment {

    private String nomIcone;
    private String nom;
    private Joueur proprio;
    private boolean occupe;

    public Batiment(String nom, String nomIcone) {
        this.nom = nom;
        this.proprio = null;
        this.nomIcone = nomIcone;
        occupe = false;
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

    public boolean isOccupe() {
        return occupe;
    }

    public void setOccupe(boolean occupe) {
        this.occupe = occupe;
    }

    public String getNomIcone() {
        return nomIcone;
    }

    public abstract void activerBatiment();
}
