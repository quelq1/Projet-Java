/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue.Configuration;

import Modele.Coordonnee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Loïc Cimon
 */
public class CaseCoordonnee {

    private static List<Coordonnee> coordChateau;
    private static List<Coordonnee> coordBatimentSpeciaux;
    private static List<Coordonnee> coordBatiment;
    private static List<Coordonnee> coordOrdreTour;
    private static List<Coordonnee> coordFinDePose;

    private static void creerCoordChateau() {
        coordChateau = new ArrayList<>();
        coordChateau.add(new Coordonnee(81, 153));
        coordChateau.add(new Coordonnee(101, 153));
        coordChateau.add(new Coordonnee(121, 153));
        coordChateau.add(new Coordonnee(141, 153));
        coordChateau.add(new Coordonnee(161, 153));
    }

    private static void creerCoordBatimentSpeciaux() {
        coordBatimentSpeciaux = new ArrayList<>();
        coordBatimentSpeciaux.add(new Coordonnee(254, 167));
        coordBatimentSpeciaux.add(new Coordonnee(312, 169));
        coordBatimentSpeciaux.add(new Coordonnee(369, 170));
        coordBatimentSpeciaux.add(new Coordonnee(427, 170));
        coordBatimentSpeciaux.add(new Coordonnee(431, 223));
        coordBatimentSpeciaux.add(new Coordonnee(373, 226));
    }

    private static void creerCoordBatiment() {
        coordBatiment = new ArrayList<>();
        //1
        coordBatiment.add(new Coordonnee(118, 238));
        coordBatiment.add(new Coordonnee(52, 262));
        coordBatiment.add(new Coordonnee(38, 324));
        coordBatiment.add(new Coordonnee(103, 338));
        coordBatiment.add(new Coordonnee(167, 341));
        //5
        coordBatiment.add(new Coordonnee(230, 344));
        coordBatiment.add(new Coordonnee(293, 348));
        coordBatiment.add(new Coordonnee(357, 354));
        coordBatiment.add(new Coordonnee(419, 356));
        coordBatiment.add(new Coordonnee(416, 415));
        //10
        coordBatiment.add(new Coordonnee(353, 420));
        coordBatiment.add(new Coordonnee(293, 423));
        coordBatiment.add(new Coordonnee(230, 424));
        coordBatiment.add(new Coordonnee(168, 426));      
        coordBatiment.add(new Coordonnee(106, 428));
        //15
        coordBatiment.add(new Coordonnee(44, 436));
        coordBatiment.add(new Coordonnee(52, 494));
        coordBatiment.add(new Coordonnee(115, 504));
        coordBatiment.add(new Coordonnee(177, 511));
        coordBatiment.add(new Coordonnee(241, 517));
        //20
        coordBatiment.add(new Coordonnee(304, 523));
        coordBatiment.add(new Coordonnee(367, 527));
        coordBatiment.add(new Coordonnee(429, 559));
        coordBatiment.add(new Coordonnee(363, 596));       
        coordBatiment.add(new Coordonnee(296, 597));
        //25
        coordBatiment.add(new Coordonnee(231, 599));
        coordBatiment.add(new Coordonnee(165, 599));
        coordBatiment.add(new Coordonnee(98, 598));
    }
    
    private static void creerCoordOrdreTour() {
        coordOrdreTour = new ArrayList<>();
        coordOrdreTour.add(new Coordonnee(252, 28));
        coordOrdreTour.add(new Coordonnee(252, 55));
        coordOrdreTour.add(new Coordonnee(252, 83));
        coordOrdreTour.add(new Coordonnee(252, 112));
        coordOrdreTour.add(new Coordonnee(252, 139));
    }
    
    private static void creerCoordFinDePose() {
        coordFinDePose = new ArrayList<>();
        coordFinDePose.add(new Coordonnee(334, 288));
        coordFinDePose.add(new Coordonnee(304, 288));
        coordFinDePose.add(new Coordonnee(273, 288));
        coordFinDePose.add(new Coordonnee(243, 288));
        coordFinDePose.add(new Coordonnee(216, 288));
    }

    public static List<Coordonnee> getCoordChateau() {
        if (coordChateau == null) {
            creerCoordChateau();
        }
        return coordChateau;
    }

    public static List<Coordonnee> getCoordBatimentSpeciaux() {
        if (coordBatimentSpeciaux == null) {
            creerCoordBatimentSpeciaux();
        }
        return coordBatimentSpeciaux;
    }

    public static List<Coordonnee> getCoordBatiment() {
        if (coordBatiment == null) {
            creerCoordBatiment();
        }
        return coordBatiment;
    }
    
    public static List<Coordonnee> getCoordOrdreTour() {
        if (coordOrdreTour == null) {
            creerCoordOrdreTour();
        }
        return coordOrdreTour;
    }
    
    public static Coordonnee getCoordFinDePose(int i) {
        if (coordFinDePose == null) {
            creerCoordFinDePose();
        }
        return coordFinDePose.get(i);
    }
}
