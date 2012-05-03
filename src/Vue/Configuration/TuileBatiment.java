/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue.Configuration;

import Modele.Batiment;
import Modele.Batiments.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Loïc Cimon
 */
public class TuileBatiment {
    
    private static List<Batiment> batimentsNeutres;
    
    private static void creerBatimentsNeutres() {
        batimentsNeutres = new ArrayList<>();
        batimentsNeutres.add(new Ferme());
        batimentsNeutres.add(new Foret());
        batimentsNeutres.add(new Scierie());
        batimentsNeutres.add(new Carriere());
        batimentsNeutres.add(new Marche());
        batimentsNeutres.add(new Charpentier());
    }
    
    public static List<Batiment> getBatimentsNeutres() {
        if (batimentsNeutres == null) {
            creerBatimentsNeutres();
        }
        return batimentsNeutres;
    }
}
