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
public class Residence extends BatimentNormal {

    public Residence() {
        super(null, 0, "Residence", "/Image/BatimentNormal/Green.png");
    }
    
    @Override
    public void activerBatiment() {
        //TODO ecrire méthode
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
