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
public class Porte extends BatimentSpeciaux{

    public Porte() {
        super("Porte", "/Image/BatimentSpecial/porte.png");
    }

    @Override
    public void activerBatiment() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
