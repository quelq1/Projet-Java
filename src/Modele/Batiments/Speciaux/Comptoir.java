/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Batiments.Speciaux;

import Controleur.Controleur;
import Modele.Batiments.BatimentSpeciaux;

/**
 *
 * @author Carlito De La Vega
 */
public class Comptoir extends BatimentSpeciaux{

    private final int GAIN = 3;
    
    public Comptoir() {
        super("Comptoir", "/Image/BatimentSpecial/comptoir.png");
        
    }

    /**
     * Le joueur gagne 3 deniers
     */
    @Override
    public void activerBatiment() {
        //TODO Montrer au joueur qu'il gagne 3 deniers
        this.getOuvrier().getPatron().setNbDenier(GAIN);
    }
    
}
