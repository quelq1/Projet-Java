/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Modele.Joueur;

/**
 *
 * @author Loïc Cimon
 */
public class PanelInfoJoueur extends javax.swing.JPanel {
//TODO Modifier nombre des batiments construits
    private Joueur joueur;
    /**
     * Creates new form PanelInfoJoueur
     */
    public PanelInfoJoueur(Joueur joueur) {
        this.joueur = joueur;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomJoueur = new javax.swing.JLabel();
        nourriture = new javax.swing.JLabel();
        bois = new javax.swing.JLabel();
        pierre = new javax.swing.JLabel();
        tissu = new javax.swing.JLabel();
        or = new javax.swing.JLabel();
        denier = new javax.swing.JLabel();
        prestige = new javax.swing.JLabel();
        batimentBois = new javax.swing.JLabel();
        batimentPierre = new javax.swing.JLabel();
        batimentPrestige = new javax.swing.JLabel();
        batimentResidentiel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 246, 199));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nomJoueur.setFont(new java.awt.Font("Vivaldi", 0, 24)); // NOI18N
        nomJoueur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomJoueur.setText(joueur.getNom());

        nourriture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nourriture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ressources/nourriture.jpg"))); // NOI18N
        nourriture.setText(String.valueOf(joueur.getNbRessource("Nourriture")));
        nourriture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nourriture.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        bois.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bois.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ressources/bois.jpg"))); // NOI18N
        bois.setText(String.valueOf(joueur.getNbRessource("Bois")));
        bois.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bois.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        pierre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pierre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ressources/pierre.jpg"))); // NOI18N
        pierre.setText(String.valueOf(joueur.getNbRessource("Pierre")));
        pierre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pierre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        tissu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tissu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ressources/tissu.jpg"))); // NOI18N
        tissu.setText(String.valueOf(joueur.getNbRessource("Tissu")));
        tissu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tissu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        or.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        or.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ressources/or.jpg"))); // NOI18N
        or.setText(String.valueOf(joueur.getNbRessource("Or")));
        or.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        or.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        denier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        denier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/denier.jpg"))); // NOI18N
        denier.setText(String.valueOf(joueur.getNbDenier()));
        denier.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        denier.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        prestige.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prestige.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/prestige.jpg"))); // NOI18N
        prestige.setText(String.valueOf(joueur.getNbPrestige()));
        prestige.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        prestige.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        batimentBois.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        batimentBois.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/batimentBois.jpg"))); // NOI18N
        batimentBois.setText(String.valueOf(joueur.getBatimentConstruit("Bois")));
        batimentBois.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        batimentBois.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        batimentPierre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        batimentPierre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/batimentPierre.jpg"))); // NOI18N
        batimentPierre.setText(String.valueOf(joueur.getBatimentConstruit("Pierre")));
        batimentPierre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        batimentPierre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        batimentPrestige.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        batimentPrestige.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/batimentPrestige.jpg"))); // NOI18N
        batimentPrestige.setText(String.valueOf(joueur.getBatimentConstruit("Prestige")));
        batimentPrestige.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        batimentPrestige.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        batimentResidentiel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        batimentResidentiel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/batimentResidenciel.jpg"))); // NOI18N
        batimentResidentiel.setText(String.valueOf(joueur.getBatimentConstruit("Residentiel")));
        batimentResidentiel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        batimentResidentiel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nomJoueur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nourriture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bois)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pierre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tissu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(or))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(denier, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prestige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(batimentBois, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(batimentPierre, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(batimentPrestige, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(batimentResidentiel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nomJoueur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nourriture, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bois, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pierre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tissu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(or, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(denier, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prestige))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(batimentBois, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batimentPierre, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(batimentPrestige, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batimentResidentiel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel batimentBois;
    private javax.swing.JLabel batimentPierre;
    private javax.swing.JLabel batimentPrestige;
    private javax.swing.JLabel batimentResidentiel;
    private javax.swing.JLabel bois;
    private javax.swing.JLabel denier;
    private javax.swing.JLabel nomJoueur;
    private javax.swing.JLabel nourriture;
    private javax.swing.JLabel or;
    private javax.swing.JLabel pierre;
    private javax.swing.JLabel prestige;
    private javax.swing.JLabel tissu;
    // End of variables declaration//GEN-END:variables
}
