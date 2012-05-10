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
public class ChampDeJoute extends BatimentSpeciaux{

    public ChampDeJoute() {
        super("Champ De Joute", "/Image/BatimentSpecial/champdejoute.png");
    }

    @Override
    public void activerBatiment() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}