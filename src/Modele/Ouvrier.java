package Modele;

public class Ouvrier {

    private boolean dispo;
    private Joueur patron;
    
    public Ouvrier(Joueur patron) {
        dispo = true;
        this.patron = patron;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public Joueur getPatron() {
        return patron;
    }
}
