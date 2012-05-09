/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modele.Batiment;
import Vue.Outils.ImagePanel;
import Vue.Fenetre;
import Modele.Joueur;
import Modele.Bailli;
import Vue.Case;
import Vue.InterfaceJoueur;
import Vue.Plateau;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlito De La Vega
 */
public class Controleur{

    private Bailli bailli;
    private boolean attendre;
    private int[] position;
    private List<Case> normaux;
    private List<Case> speciaux;
    
    public Controleur() {
        this.bailli = new Bailli();
        attendre = false;
    }
    
    

    public void tour(List<Joueur> joueurs, List<Case> batimenNormaux,List<Case> batimentSpeciaux, InterfaceJoueur interfaceJoueur, ImagePanel interfacePlateau){
        boolean fin = false;
        normaux = batimenNormaux;
        speciaux=batimentSpeciaux;
        //while (!fin){
            // méthode qui gère la phase de collecte des revenus
               //getRevenu(joueurs, normaux,interfaceJoueur, interfacePlateau);
            // méthode qui gère la phase du placement des ouvriers
               //placerOuvrier(joueurs,normaux,speciaux,interfaceJoueur,interfacePlateau);
            // méthode qui gère l'activation des bâtiments spéciaux
            activerBatiment(joueurs,normaux,speciaux,interfaceJoueur,interfacePlateau);
            // méthode qui gère le déplacement du prévot
            // méthode qui gère l'activation des batiments
            // méthode qui gère la construction du château
            // méthode qui gère la fin du tour, si elle renvoie true le jeu est fini.
        //ChoixEtiquettes ce = new ChoixEtiquettes(Fenetre.fenetre, true, joueurs.get(0));
        //}
    }
    
    public void getRevenu(List<Joueur> joueurs, List<Case> normaux, InterfaceJoueur interfaceJoueur,ImagePanel interfacePlateau){
        Batiment bat = null;
        for(int i = 0;i<joueurs.size();i++){
                joueurs.get(i).setNbDenier(2);
                for(int k = 7; k <= bailli.getPosition();k++){
                        bat = normaux.get(k).getBatiment();
                            if(bat != null){
                                    if(bat.getNom().compareTo("Residence") == 0  && joueurs.get(i) == bat.getProprio());
                                            joueurs.get(i).setNbDenier(1);
                                    if(bat.getNom().compareTo("Bibliotheque") == 0  && joueurs.get(i) == bat.getProprio());
                                            joueurs.get(i).setNbDenier(1);
                                    if(bat.getNom().compareTo("Hotel") == 0 && joueurs.get(i) == bat.getProprio());
                                            joueurs.get(i).setNbDenier(2);	
                            }
                }
        }
        interfaceJoueur.setDeniers(joueurs.get(0).getNbDenier());
    }
    
/*  public void placerOuvrier(List<Joueur> joueurs, List<Case> normaux,List<Case> speciaux, InterfaceJoueur interfaceJoueur,ImagePanel interfacePlateau){
        attendre = true;
        int[] pos = new int[2];
        pos[0] = 0;
        pos[1] = 0;
        pos = position(interfacePlateau);
   
    }*/
    
     public void activerBatiment(List<Joueur> joueurs, List<Case> batimenNormaux,List<Case> batimentSpeciaux, InterfaceJoueur interfaceJoueur, ImagePanel interfacePlateau){
            Joueur j = null;
            Batiment bat = batimentSpeciaux.get(2).getBatiment();
             if(bat.getNom() != null){
                 bat.getOccupe().setDispo(true);
                 // A voir si on le fait. 
             }
             bat = batimentSpeciaux.get(3).getBatiment();
             if(bat.getOccupe() != null){
                 bat.getOccupe().getPatron().setNbDenier(3);
                 bat.getOccupe().setDispo(true);
             }
             bat = batimentSpeciaux.get(4).getBatiment();
             if(bat.getOccupe() != null){
                 bat.getOccupe().getPatron().setNbDenier(3);
                 bat.getOccupe().setDispo(true);
             }
             bat = batimentSpeciaux.get(5).getBatiment();
             if(bat.getOccupe() != null){
                String reponse;
                String message = "De combien de cases voulez vous bouger le prévôt?";
                reponse = JOptionPane.showInputDialog(interfacePlateau, message);
                 System.out.println("reponse : "+ Integer.parseInt(reponse));
                 bat.getOccupe().setDispo(true);
             }
     }
    

    public boolean isAttendre() {
        return attendre;
    }

    public Bailli getBailli() {
        return bailli;
    }

    public List<Case> getNormaux() {
        return normaux;
    }

    public int[] getPosition() {
        return position;
    }

    public List<Case> getSpeciaux() {
        return speciaux;
    }

    
  /*  public Joueur placerOuvrier(Batiment bat, Joueur j){	
	int fin = 0;
        //j = ordreTour.get(tour);
        if(bat.getNom() == "pont"){
            fileFinPose.add(j); 
            if(fileFinPose.size() == ordreTour.size()){
                    phase ++;
            }
            fin ++;
        }else{
                if(!bat.getOccupe()){
                        aDroit = true;
                        System.out.println("test555555");
                        tour++;
                        if(bat.getProprio() == j){
                                System.out.println("test6");
                                bat.setOccupe(true);
                                payer(j);
                                bat.setPresent(j);
                        }else{
                                if(bat.getProprio() != j && bat.getProprio() != null){
                                        System.out.println("test7");
                                        bat.setOccupe(true);
                                        j.setNbDenier(-1);
                                        payer(j);
                                        bat.setPresent(j);
                                        bat.getProprio().setNbPrestige(1);
                                }else{
                                        if(bat.getProprio() == null){
                                                System.out.println("test00000");
                                                bat.setOccupe(true);
                                                payer(j);
                                                bat.setPresent(j);
                                                //bat.getProprio().setNbPrestige(1);
                                        }else{
                                        if( bat instanceof Auberge){
                                                System.out.println("test8");
                                                ((Auberge) bat).next(j);
                                                payer(j);
                                        }else{
                                                if(bat instanceof Ecurie){
                                                        System.out.println("test9");
                                                        ((Ecurie) bat).next(j);
                                                        payer(j);
                                                }else{
                                                        if(bat instanceof Chateau){
                                                                System.out.println("test99");
                                                                if(!((Chateau) bat).getOrdreConst().contains(j)){
                                                                        ((Chateau) bat).getOrdreConst().add(j);
                                                                        payer(j);
                                                                }else{
                                                                        System.out.println("test999");
                                                                        bat.setOccupe(true);
                                                                        bat.setPresent(j);
                                                                        payer(j);
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
                        System.out.println("test3");
                        if(j.getOuvrier().getNombre() == 0){
                                //ordreTour.remove(j);
                                fileFinPose.add(j);
                                if(fileFinPose.size() == ordreTour.size()){
                                        phase = 3;
                                }
                        }
                        System.out.println(tour);
                        System.out.println(ordreTour.size());
                        System.out.println("test tour");
                        if(tour == ordreTour.size()){

                                tour = 0;
                        }
                }else{
                        aDroit = false;
                }
                }


        return j;
}*/
}