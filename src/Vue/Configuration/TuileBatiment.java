/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue.Configuration;

import Modele.Batiments.Normal.Charpentier;
import Modele.Batiments.Normal.Marche;
import Modele.Batiments.Normal.Foret;
import Modele.Batiments.Normal.Ferme;
import Modele.Batiments.Normal.Scierie;
import Modele.Batiments.Normal.Carriere;
import Modele.Batiment;
import Modele.Batiments.*;
import Modele.Batiments.Normal.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Loïc Cimon
 */
public class TuileBatiment {
    
    private static List<BatimentNormal> batimentsNeutres;
    private static List<BatimentNormal> batimentsNormaux;
    
    private static void creerBatimentsNeutres() {
        batimentsNeutres = new ArrayList<>();
        batimentsNeutres.add(new Ferme());
        batimentsNeutres.add(new Foret());
        batimentsNeutres.add(new Scierie());
        batimentsNeutres.add(new Carriere());
        batimentsNeutres.add(new Marche());
        batimentsNeutres.add(new Charpentier());
    }
    
    private static void creerBatimentsNormaux(){
        batimentsNormaux = new ArrayList<>();
        batimentsNormaux.add(new Alchimiste());
        batimentsNormaux.add(new Banque());
        batimentsNormaux.add(new Bibliotheque());
        batimentsNormaux.add(new CarriereBois());
        batimentsNormaux.add(new CarrierePierre());
        batimentsNormaux.add(new CharpentierBois());
        batimentsNormaux.add(new CharpentierPierre());
        batimentsNormaux.add(new ColporteurBois());
        batimentsNormaux.add(new Eglise());
        batimentsNormaux.add(new Ferme());
        batimentsNormaux.add(new FermeBois());
        batimentsNormaux.add(new FermePierre());
        batimentsNormaux.add(new ForetBois());
        batimentsNormaux.add(new ForetPierre());
        batimentsNormaux.add(new Hotel());
        batimentsNormaux.add(new MarcheBois());
        batimentsNormaux.add(new MarchePierre());
        batimentsNormaux.add(new PrestigePierre());
        batimentsNormaux.add(new Residence());
        batimentsNormaux.add(new ResidenceBois());
        batimentsNormaux.add(new Scierie());
        batimentsNormaux.add(new Tailleur());
        batimentsNormaux.add(new TissuBois());
        batimentsNormaux.add(new TissuPierre());
    }
    
    public static List<BatimentNormal> getBatimentsNeutres() {
        if (batimentsNeutres == null) {
            creerBatimentsNeutres();
        }
        return batimentsNeutres;
    }
}
