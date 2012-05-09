/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Batiments;
import Modele.Batiment;

/**
 *
 * @author Carlito De La Vega
 */
public class BatimentSpeciaux extends Batiment{

    public BatimentSpeciaux(String nom, String nomIcone) {
        super(nom, nomIcone);
    }

    
    @Override
    public void activerBatiment() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
