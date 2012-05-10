/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Batiments;

import Modele.Ressource;
import java.util.List;

/**
 *
 * @author Loïc Cimon
 */
public abstract class BatimentNormal extends Batiment {

    private List<Ressource> cout;
    private int nbPrestige;

    public BatimentNormal(List<Ressource> cout, int nbPrestige, String nom, String nomIcone) {
        super(nom, nomIcone);
        this.cout = cout;
        this.nbPrestige = nbPrestige;
    }

    public List<Ressource> getCout() {
        return cout;
    }

    public int getNbPrestige() {
        return nbPrestige;
    }
    
    public abstract void activerBatiment();
}
