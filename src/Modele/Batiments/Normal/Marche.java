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
public class Marche extends BatimentNormal {

    public Marche() {
        super(null, 0, "Marche", "/Image/BatimentNeutre/marche.png");
    }
    
    @Override
    public void activerBatiment() {
        String[] choix = {"Tissu", "Nourriture", "Pierre", "Bois"};
        int reponse2 = JOptionPane.showOptionDialog(Controleur.getInstance().getPlateau(),
                "Quelle ressource voulez vous échanger?",
                "Ressources",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                choix,
                choix[0]);
        getOuvrier().getPatron().setNbDenier(4);
        switch (reponse2) {
            case 0:
                getOuvrier().getPatron().addNbRessource("Tissu", -1);
                break;
            case 1:
                getOuvrier().getPatron().addNbRessource("Nourriture", -1);
                break;
            case 2:
                getOuvrier().getPatron().addNbRessource("Pierre", -1);
                break;
            case 3:
                getOuvrier().getPatron().addNbRessource("Bois", -1);
                break;
            default:
                getOuvrier().getPatron().addNbRessource("Tissu", -1);
                break;
        }
        
    }
    
}
