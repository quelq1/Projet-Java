/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Batiments.Speciaux;

import Modele.Batiments.BatimentSpeciaux;
import Modele.Joueur;

/**
 *
 * @author Carlito De La Vega
 */
public class Auberge extends BatimentSpeciaux{
    private Joueur place1;
    private Joueur place2;
    
    public Auberge() {
        super("Auberge", "/Image/BatimentSpecial/auberge.png");
        this.place1 = null;
        this.place2 = null;
    }

    public Joueur getPlace1() {
        return place1;
    }

    public Joueur getPlace2() {
        return place2;
    }

    public void setPlace1(Joueur place1) {
        this.place1 = place1;
    }

    public void setPlace2(Joueur place2) {
        this.place2 = place2;
    }

    @Override
    public void activerBatiment() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
