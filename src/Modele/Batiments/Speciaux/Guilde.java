/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Batiments.Speciaux;

import Modele.Batiments.BatimentSpeciaux;

/**
 *
 * @author Carlito De La Vega
 */
public class Guilde extends BatimentSpeciaux{

    public Guilde() {
        super("Guilde", "/Image/BatimentSpecial/guilde.png");
    }

    @Override
    public void activerBatiment() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}