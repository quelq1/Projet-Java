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
public class Comptoir extends BatimentSpeciaux{

    public Comptoir() {
        super("Comptoir", "/Image/BatimentSpecial/comptoir.png");
        
    }

    @Override
    public void activerBatiment() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
