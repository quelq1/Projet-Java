/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modele.Batiment;
import Vue.Outils.ImagePanel;
import Modele.Joueur;
import Modele.Bailli;
import Vue.Case;
import Vue.InterfaceJoueur;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

/**
 *
 * @author Carlito De La Vega
 */
public class Controleur{

    private Bailli bailli;
    private boolean attendre;
    
    public Controleur() {
        this.bailli = new Bailli();
    }
    
    

    public void tour(List<Joueur> joueurs, List<Case> normaux,List<Case> speciaux, InterfaceJoueur interfaceJoueur){
        boolean fin = false;
        //while (!fin){
            // méthode qui gère la phase de collecte des revenus
               getRevenu(joueurs, normaux,interfaceJoueur);
            // méthode qui gère la phase du placement des ouvriers
               //placerOuvrier(joueurs,normaux,speciaux,interfaceJoueur);
            // méthode qui gère l'activation des bâtiments spéciaux
            // méthode qui gère le déplacement du prévot
            // méthode qui gère l'activation des batiments
            // méthode qui gère la construction du château
            // méthode qui gère la fin du tour, si elle renvoie true le jeu est fini.
        //}
    }
    
    public void getRevenu(List<Joueur> joueurs, List<Case> normaux, InterfaceJoueur interfaceJoueur){
        Batiment bat = null;
        for(int i = 0;i<joueurs.size();i++){
                joueurs.get(i).setNbDenier(2);
                for(int k = 7; k <= bailli.getPosition();k++){
                        bat = normaux.get(k).getBatiment();
                            if(bat != null){
                                    if(bat.getNom() == "Residence" && joueurs.get(i) == bat.getProprio());
                                            joueurs.get(i).setNbDenier(1);
                                    if(bat.getNom() == "Bibliotheque" && joueurs.get(i) == bat.getProprio());
                                            joueurs.get(i).setNbDenier(1);
                                    if(bat.getNom() == "Hotel" && joueurs.get(i) == bat.getProprio());
                                            joueurs.get(i).setNbDenier(2);	
                            }
                }
        }
        interfaceJoueur.setDeniers(joueurs.get(0).getNbDenier());
    }
    
   

}