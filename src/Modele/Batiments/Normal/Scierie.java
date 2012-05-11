/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Batiments.Normal;

import Modele.Batiments.BatimentNormal;

/**
 *
 * @author Loïc Cimon
 */
public class Scierie extends BatimentNormal {

    public Scierie() {
        super(null, 0, "Scierie", "/Image/BatimentNeutre/scierie.png");
    }
    
    @Override
    public void activerBatiment() {
        getOuvrier().getPatron().addNbRessource("Bois", 1);
    }
}
