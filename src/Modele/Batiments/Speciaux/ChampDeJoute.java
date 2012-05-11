/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Batiments.Speciaux;

import Controleur.Controleur;
import Modele.Batiments.BatimentSpeciaux;
import Modele.Ressource;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlito De La Vega
 */
public class ChampDeJoute extends BatimentSpeciaux {

    private final Ressource cout = new Ressource("Tissu", 1);
    private final int prix = 1;

    public ChampDeJoute() {
        super("Champ De Joute", "/Image/BatimentSpecial/champdejoute.png");
    }

    /**
     * Permet d'acheter une faveur contre 1 dessus
     */
    @Override
    public void activerBatiment() {
        //Tant que le joueur a assez de ressource et de denier
        //et veux acheter des faveurs
        this.getOuvrier().getPatron().addNbRessource(cout.getNom(), 1);
        boolean fin = false;
        int choix;

        while (this.getOuvrier().getPatron().getNbRessource(cout.getNom()) >= cout.getQuantite()
                && this.getOuvrier().getPatron().getNbDenier() >= prix
                && !fin) {
            //Demande à l'utilisateur
            choix = JOptionPane.showConfirmDialog(Controleur.getInstance().getPlateau(), "Voulez-vous acheter une faveur ?\nPrix :\n\t- " + prix + " denier.\n\t- " + cout, "Champs de Joute", JOptionPane.YES_NO_OPTION);
            if (choix == JOptionPane.YES_OPTION) {

                this.getOuvrier().getPatron().setNbDenier(-1);
                this.getOuvrier().getPatron().addNbRessource("Tissu", -1);
                this.getOuvrier().getPatron().setNbPrestige(3);

                //Met à jour l'affichage des infos du joueur
                Controleur.getInstance().getPlateau().setInterfaceJoueur(this.getOuvrier().getPatron());

            } else {
                fin = true;
            }
        }
    }
}