/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Batiments.Normal;

import Controleur.Controleur;
import Modele.Batiments.BatimentNormal;
import javax.swing.JOptionPane;

/**
 *
 * @author Loïc Cimon
 */
public class Ferme extends BatimentNormal {

    public Ferme() {
        super(null, 0, "Ferme", "/Image/BatimentNeutre/ferme.png");
    }
    
    @Override
    public void activerBatiment() {
        String[] choix = {"Nourriture", "Tissu"};
        int reponse2 = JOptionPane.showOptionDialog(Controleur.getInstance().getPlateau(),
                "Quelle ressource voulez vous ?",
                "Ressources",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                choix,
                choix[0]);
        switch (reponse2) {
            case 0:
                getOuvrier().getPatron().addNbRessource("Nourriture", 1);
                break;
            case 1:
                getOuvrier().getPatron().addNbRessource("Tissu", 1);
                break;
            default:
                getOuvrier().getPatron().addNbRessource("Nourriture", 1);
                break;
        }
    }

}
