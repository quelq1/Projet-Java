/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Loïc Cimon
 */
public class Lot {
    private List<Ressource> ressources;
    
    public Lot(String r1, String r2, String r3) {
        ressources = new ArrayList<>(4);
        ressources.add(new Ressource("Tissu", 1));
        ressources.add(new Ressource(r1, 1));
        ressources.add(new Ressource(r2, 1));
        ressources.add(new Ressource(r3, 1));
    }
    
    public List<Ressource> getRessources() {
        return ressources;
    }
}
