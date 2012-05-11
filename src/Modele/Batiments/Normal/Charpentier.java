/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Batiments.Normal;

import Controleur.ChoixEtiquettes;
import Controleur.Controleur;
import Modele.Batiments.BatimentNormal;
import Vue.Fenetre;

/**
 *
 * @author Loïc Cimon
 */
public class Charpentier extends BatimentNormal {

    public Charpentier() {
        super(null, 0, "Charpentier", "/Image/BatimentNeutre/charpentier.png");
    }
    
    @Override
    public void activerBatiment() {
        ChoixEtiquettes choix = new ChoixEtiquettes((Fenetre) Controleur.getInstance().getPlateau().getTopLevelAncestor(), true, Controleur.getInstance().getJoueurEnJeu());
        System.out.println("putainnnnnnnnnnnnnnnnnn");
    }

}
