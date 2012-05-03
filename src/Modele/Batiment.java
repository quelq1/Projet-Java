package Modele;

public abstract class Batiment {

    private String nomIcone;
    private String nom;
    private Joueur proprio;
    private Joueur present;

    public Batiment(String nom, String nomIcone) {
        this.nom = nom;
        this.proprio = null;
        this.present = null;
        this.nomIcone = nomIcone;
    }

    public String getNom() {
        return nom;
    }

    public Joueur getPresent() {
        return present;
    }

    public void setPresent(Joueur present) {
        this.present = present;
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
    
    public String getNomIcone() {
        return nomIcone;
    }
    
    public abstract void activerBatiment();
}
