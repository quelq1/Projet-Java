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
public class Foret extends BatimentNormal {

    public Foret() {
        super(null, 0, "Foret", "/Image/BatimentNeutre/foret.png");
    }
    
    @Override
    public void activerBatiment() {
        String[] choix = {"Bois", "Nourriture"};
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
                getOuvrier().getPatron().addNbRessource("Bois", 1);
                break;
            case 1:
                getOuvrier().getPatron().addNbRessource("Nourriture", 1);
                break;
            default:
                getOuvrier().getPatron().addNbRessource("Bois", 1);
                break;
        }
    }
    
}
