/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Batiments;

import Controleur.Controleur;
import Modele.Jeu;
import Modele.Joueur;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlito De La Vega
 */
public class Chateau extends Batiment {

    //decompte du château
    private int decompte;
    private List<Joueur> fileChateau;
    //Joueurs qui ont construits le château
    private ArrayList<ArrayList<Joueur>> constructeursSection;
    //Boolean pour savoir si il y a encore de la place pour construire
    private boolean estConstruisable;
    private boolean faireDecompte;

    public Chateau() {
        super("Chateau", "/Image/vide.png");
        this.decompte = 0;
        this.fileChateau = new ArrayList<>();
        this.constructeursSection = new ArrayList<>();
        this.constructeursSection.add(new ArrayList<Joueur>());
        this.constructeursSection.add(new ArrayList<Joueur>());
        this.constructeursSection.add(new ArrayList<Joueur>());
        
        this.estConstruisable = true;
        this.faireDecompte = false;
    }

    @Override
    public void activerBatiment() {
        //Ajoute le joueur à la liste des constructeurs
        constructeursSection.get(decompte).add(Controleur.getInstance().getJoueurEnJeu());
        //Construit la bonne section du chateau
        //0 : Muraille
        //1 : Tour
        //2 : Donjon
        switch (decompte) {
            case 0:
                if (constructeursSection.get(decompte).size() == Jeu.NB_MURAILLE) {
                    decompte++;
                }
            case 1:
                if (constructeursSection.get(decompte).size() == Jeu.NB_TOUR) {
                    decompte++;
                }
            case 2:
                if (constructeursSection.get(decompte).size() == Jeu.NB_DONJON) {
                    estConstruisable = false;
                    break;
                }
        }
    }

    public int getDecompte() {
        return decompte;
    }

    public List<Joueur> getFileChateau() {
        return fileChateau;
    }

    public boolean estConstruisable() {
        return estConstruisable;
    }

    public boolean faireDecompte() {
        return faireDecompte;
    }

    public void decompte() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
