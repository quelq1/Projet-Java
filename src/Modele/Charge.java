/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import Vue.Fenetre;
import java.io.*;

/**
 *
 * @author Carlito De La Vega
 */
public class Charge {
    private Fenetre fenetre;
        public Charge(Fenetre fenetre , String chemin)
    {
        this.fenetre = fenetre;
        sauvegarderPartie(chemin);
    }

 public boolean sauvegarderPartie(String pCheminCroupier )
 {
         File fichier = new File(pCheminCroupier);
        
         try {
         
         ObjectInputStream stockefenetre = new ObjectInputStream(new FileInputStream(fichier));
         // partie stockage des elements necessaires à la récuperation du Mr Coupier !!

         
         fenetre = (Fenetre) stockefenetre.readObject();
/*         stockefenetre.writeObject(fenetre.get_joueurCourant()           );
         stockefenetre.writeObject(fenetre.getJoueurs()                  );
         stockefenetre.writeObject(fenetre.get_chateau()                 );
         stockefenetre.writeObject(fenetre.get_phaseDuJeu()              );
         stockefenetre.writeObject(fenetre.get_phaseConstructionChateau());
         stockefenetre.writeObject(fenetre.get_leBailli()                );
         stockefenetre.writeObject(fenetre.get_lePrevot()                );
*/
         System.out.println("================ first step ========================");
         
         //stockefenetre.flush();
         stockefenetre.close();

         return true;
       }

       catch (NotSerializableException e)
       {
           System.out.println(" erreur :" + e.toString());
           return false;
       }

       catch (IOException e)
       {
         System.out.println(" erreur :" + e.toString());
         return false;
       }

       catch (Exception e)
       {
         System.out.println(" erreur :" + e.toString());
         return false;
       }
    }

    public Fenetre getFenetre() {
        return fenetre;
    }
 
}
