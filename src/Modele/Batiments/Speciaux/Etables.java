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


public class Etables extends BatimentSpeciaux{

    private Joueur place1;
    private Joueur place2;
    private Joueur place3;
    
    public Etables() {
        super("Etables", "/Image/BatimentSpecial/etables.png");
        this.place1 = null;
        this.place2 = null;
        this.place3 = null;
        
    }

    public Joueur getPlace1() {
        return place1;
    }

    public Joueur getPlace2() {
        return place2;
    }

    public Joueur getPlace3() {
        return place3;
    }

    @Override
    public void activerBatiment() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
