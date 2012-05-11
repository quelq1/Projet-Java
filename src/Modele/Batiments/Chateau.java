/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Batiments;

import Controleur.Controleur;
import Modele.Batiment;
import Modele.Joueur;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Carlito De La Vega
 */
public class Chateau extends Batiment{

    //decompte du château
    private int decompte;
    //Joueurs qui ont construits le château
    private ArrayList<ArrayList<Joueur>> construire;
    //Boolean pour savoir si il y a encore de la place pour construire
    private boolean place;

    public Chateau(int decompte, String nom, String nomIcone) {
        super(nom, nomIcone);
        this.decompte = decompte;
        this.construire = new ArrayList<>();
        this.construire.add(1, new ArrayList<Joueur>());
        this.construire.add(2, new ArrayList<Joueur>());
        this.construire.add(3, new ArrayList<Joueur>());
    }
    
    
    @Override
    public void activerBatiment() {
        //remettre la méthode de la classe jeu permettant de récupèrer la liste des joueurs placés sur le château
        if (place) {
            List<Joueur> joueurs = Controleur.getInstance().getJeu().getJoueurs();
            for (Joueur j : joueurs) {
                construire.get(decompte).add(j);
                j.setNbPrestige(3);
                switch (decompte) {
                    case 1:
                        if (construire.get(decompte).size() == 6) {
                            decompte++;
                        }
                    case 2:
                        if (construire.get(decompte).size() == 10) {
                            decompte++;
                        }
                    case 3:
                        if (construire.get(decompte).size() == 14) {
                            place = false;
                            break;
                        }
                }
            }
        }
    }
    
    public void setJoueur(Joueur j){
        Joueur [] joueurs;
        

        
        
    }
    
    
}
