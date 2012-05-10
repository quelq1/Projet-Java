/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Batiments;

/**
 *
 * @author Carlito De La Vega
 */
public abstract class BatimentSpeciaux extends Batiment{

    public BatimentSpeciaux(String nom, String nomIcone) {
        super(nom, nomIcone);
    }
    
    @Override
    public abstract void activerBatiment();
    
}
