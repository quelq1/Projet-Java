/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modele.Bailli;
import Modele.Batiment;
import Modele.Jeu;
import Modele.Joueur;
import Vue.Case;
import Vue.InterfaceJoueur;
import Vue.Plateau;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Carlito De La Vega
 */
public class Controleur {

    private Plateau plateau;
    private Jeu jeu;

    public Controleur(List<Joueur> joueurs) {
        //On mélange les joueurs
        Collections.shuffle(joueurs);

        //On initialise le modèle et la vue
        this.jeu = new Jeu(joueurs);
        this.plateau = new Plateau(joueurs);
    }

    public void gestionInitialisation() {
    }

    public void tour(List<Joueur> joueurs, List<Case> normaux, List<Case> speciaux, InterfaceJoueur interfaceJoueur) {
        boolean fin = false;
        //while (!fin){
        // méthode qui gère la phase de collecte des revenus
        getRevenu(joueurs, normaux, interfaceJoueur);
        // méthode qui gère la phase du placement des ouvriers
        //placerOuvrier(joueurs,normaux,speciaux,interfaceJoueur);
        // méthode qui gère l'activation des bâtiments spéciaux
        // méthode qui gère le déplacement du prévot
        // méthode qui gère l'activation des batiments
        // méthode qui gère la construction du château
        // méthode qui gère la fin du tour, si elle renvoie true le jeu est fini.
        //}
    }

    public void getRevenu(List<Joueur> joueurs, List<Case> normaux, InterfaceJoueur interfaceJoueur) {
        Batiment bat = null;
        for (Joueur j : joueurs) {
            j.setNbDenier(2);
            for (int i = 7; i <= jeu.getPositionBailli(); i++) {
                bat = normaux.get(i).getBatiment();
                if (bat != null) {
                    if (bat.getNom() == "Residence" && j == bat.getProprio());
                    j.setNbDenier(1);
                    if (bat.getNom() == "Bibliotheque" && j == bat.getProprio());
                    j.setNbDenier(1);
                    if (bat.getNom() == "Hotel" && j == bat.getProprio());
                    j.setNbDenier(2);
                }
            }
        }
        interfaceJoueur.setDeniers(joueurs.get(0).getNbDenier());
    }

    public List<Joueur> getJoueurs() {
        return jeu.getJoueurs();
    }
}