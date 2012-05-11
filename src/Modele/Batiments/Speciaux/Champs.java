/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Batiments.Speciaux;

import Modele.Batiments.BatimentSpeciaux;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlito De La Vega
 */
public class Champs extends BatimentSpeciaux{

    public Champs() {
        super("Champs", "/Image/BatimentNeutre/vide.png");
    }
    
    public void activerBatiment() {
        int reponse = JOptionPane.showConfirmDialog(null, "Voulez-vous acheter une faveur",
                "Champs de Joute",
                JOptionPane.YES_NO_OPTION);
        if (reponse == JOptionPane.YES_OPTION) {
            getOuvrier().getPatron().setNbDenier(-1);
            getOuvrier().getPatron().addNbRessource("Tissu", -1);
            getOuvrier().getPatron().setNbPrestige(3);
        }
        getOuvrier().setDispo(true);
    }
}