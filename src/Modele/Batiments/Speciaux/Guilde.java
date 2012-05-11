/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Batiments.Speciaux;

import Controleur.Controleur;
import Modele.Batiments.BatimentSpeciaux;
import Vue.Fenetre;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlito De La Vega
 */
public class Guilde extends BatimentSpeciaux{

    public Guilde() {
        super("Guilde", "/Image/BatimentSpecial/guilde.png");
    }

    @Override
    public void activerBatiment() {
        //Récupère la position du prévot
        int pos = Controleur.getInstance().getJeu().getPositionPrevot();
        //Récupère les cases possibles
        int min = pos-3;
        if (min < 1) {
            //Les cases commencent à 1
            min = 1;
        }
        int max = pos+3;
        //29 = dernière case
        if (max > 29) {
            max = 29;
        }
        System.out.println("Pos : " + pos);
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
        //On inclut la borne supérieure
        Integer[] choixPossible = new Integer[max-min+1];
        
        for (int i = 0; i <= max-min; i++) {
            choixPossible[i] = min-pos+i;
        }
        
        Integer choix = (Integer)JOptionPane.showInputDialog(
                    Controleur.getInstance().getPlateau(),
                    "De combien de cases voulez vous bouger le prévôt?",
                    "Déplacement du prévot",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    choixPossible, choixPossible[0]);
        
        System.out.println("Choix : " + choix.intValue());
        Controleur.getInstance().deplacerPrevot(choix.intValue());
    }
}