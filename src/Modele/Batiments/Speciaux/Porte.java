/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Batiments.Speciaux;

import Controleur.Controleur;
import Modele.Batiments.BatimentSpeciaux;
import Vue.ActionsPossibles.PanelChoixCase;

/**
 *
 * @author Carlito De La Vega
 */
public class Porte extends BatimentSpeciaux{

    public Porte() {
        super("Porte", "/Image/BatimentSpecial/porte.png");
    }

    /**
     * Activation de la porte :
     * Replace gratuitement l'ouvrier
     */
    @Override
    public void activerBatiment() {
        //Le panel d'action est le bon, toujours après la phase de placement ouvrier
        PanelChoixCase.setValidationPossible(false);
        
        //Le clic sur la case, lancement le placement de l'ouvrier
        Controleur.getInstance().attendreChoixCase();
        
        PanelChoixCase.setValidationPossible(false);
    }
    
}
