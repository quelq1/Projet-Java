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


public class Ecuries extends BatimentSpeciaux{

    private Joueur place1;
    private Joueur place2;
    private Joueur place3;
    
    public Ecuries(Joueur j1,Joueur j2,Joueur j3 ) {
        super("Ecuries", "/Image/BatimentNeutre/vide.png");
        this.place1 = j1;
        this.place2 = j2;
        this.place3 = j3;
        
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
    
    
}
