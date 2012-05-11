/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modele;

import Vue.Fenetre;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

/**
 *
 * @author sridi mahdi
 */
public class Save {

    private Fenetre fenetre ;

    public Save(Fenetre fenetre , String chemin)
    {
        this.fenetre = fenetre;
        sauvegarderPartie(chemin);
    }

 public boolean sauvegarderPartie(String pCheminCroupier )
 {
         File fichier = new File(pCheminCroupier);
        
         try {
         
         ObjectOutputStream stockefenetre = new ObjectOutputStream(new FileOutputStream(fichier));
         // partie stockage des elements necessaires à la récuperation du Mr Coupier !!

         
         stockefenetre.writeObject(fenetre);
/*         stockefenetre.writeObject(fenetre.get_joueurCourant()           );
         stockefenetre.writeObject(fenetre.getJoueurs()                  );
         stockefenetre.writeObject(fenetre.get_chateau()                 );
         stockefenetre.writeObject(fenetre.get_phaseDuJeu()              );
         stockefenetre.writeObject(fenetre.get_phaseConstructionChateau());
         stockefenetre.writeObject(fenetre.get_leBailli()                );
         stockefenetre.writeObject(fenetre.get_lePrevot()                );
*/
         System.out.println("================ first step ========================");
         
         stockefenetre.flush();
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

}