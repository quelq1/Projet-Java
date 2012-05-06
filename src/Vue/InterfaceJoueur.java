/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Modele.Joueur;

/**
 *
 * @author Carlito De La Vega
 */
public class InterfaceJoueur extends javax.swing.JPanel {

    /**
     * Creates new form InterfaceJoueur
     */
    private Joueur joueur;
    public InterfaceJoueur(Joueur j) {
        this.joueur = j;
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

        denier = new javax.swing.JLabel();
        prestige = new javax.swing.JLabel();
        labelPhaseJeu = new javax.swing.JLabel();
        phaseJeu = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pierre = new javax.swing.JLabel();
        nourriture = new javax.swing.JLabel();
        deniers = new javax.swing.JLabel();
        tissu = new javax.swing.JLabel();
        prestige1 = new javax.swing.JLabel();
        ressources = new javax.swing.JLabel();
        labelDenierPrestige = new javax.swing.JLabel();
        or = new javax.swing.JLabel();
        bois = new javax.swing.JLabel();
        labelNomJoueur = new javax.swing.JLabel();
        nomJoueur = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        setBackground(new java.awt.Color(254, 246, 199));

        labelPhaseJeu.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        labelPhaseJeu.setText("Phase de jeu :");

        phaseJeu.setFont(new java.awt.Font("Vivaldi", 0, 24)); // NOI18N
        phaseJeu.setText("phase");

        jPanel1.setBackground(new java.awt.Color(254, 246, 199));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        pierre.setFont(new java.awt.Font("Vivaldi", 0, 14)); // NOI18N
        pierre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pierre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ressources/pierre.jpg"))); // NOI18N
        pierre.setText(String.valueOf(joueur.getNbRessource("Pierre")));
        pierre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pierre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        nourriture.setFont(new java.awt.Font("Vivaldi", 0, 14)); // NOI18N
        nourriture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nourriture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ressources/nourriture.jpg"))); // NOI18N
        nourriture.setText(String.valueOf(joueur.getNbRessource("Nourriture")));
        nourriture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nourriture.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        deniers.setFont(new java.awt.Font("Vivaldi", 0, 14)); // NOI18N
        deniers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deniers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/denier.jpg"))); // NOI18N
        deniers.setText(String.valueOf(joueur.getNbDenier()));
        deniers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deniers.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        tissu.setFont(new java.awt.Font("Vivaldi", 0, 14)); // NOI18N
        tissu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tissu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ressources/tissu.jpg"))); // NOI18N
        tissu.setText(String.valueOf(joueur.getNbRessource("Tissu")));
        tissu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tissu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        prestige1.setFont(new java.awt.Font("Vivaldi", 0, 14)); // NOI18N
        prestige1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prestige1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/prestige.jpg"))); // NOI18N
        prestige1.setText(String.valueOf(joueur.getNbPrestige()));
        prestige1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        prestige1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        ressources.setFont(new java.awt.Font("Vivaldi", 0, 18)); // NOI18N
        ressources.setText("Ressources :");

        labelDenierPrestige.setFont(new java.awt.Font("Vivaldi", 0, 18)); // NOI18N
        labelDenierPrestige.setText("Deniers et prestiges :");

        or.setFont(new java.awt.Font("Vivaldi", 0, 14)); // NOI18N
        or.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        or.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ressources/or.jpg"))); // NOI18N
        or.setText(String.valueOf(joueur.getNbRessource("Or")));
        or.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        or.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        bois.setFont(new java.awt.Font("Vivaldi", 0, 14)); // NOI18N
        bois.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bois.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ressources/bois.jpg"))); // NOI18N
        bois.setText(String.valueOf(joueur.getNbRessource("Bois")));
        bois.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bois.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        labelNomJoueur.setFont(new java.awt.Font("Vivaldi", 1, 20)); // NOI18N
        labelNomJoueur.setText("Au tour de :");

        nomJoueur.setFont(new java.awt.Font("Vivaldi", 0, 20)); // NOI18N
        nomJoueur.setText(joueur.getNom());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Marqueur/"+joueur.getCouleur()+".jpg")));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(deniers, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prestige1))
                    .addComponent(labelDenierPrestige)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nourriture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bois)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pierre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tissu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(or))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelNomJoueur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomJoueur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addComponent(ressources))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNomJoueur)
                        .addComponent(nomJoueur))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ressources)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nourriture, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bois, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pierre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tissu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(or, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDenierPrestige)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prestige1)
                    .addComponent(deniers, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPhaseJeu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phaseJeu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPhaseJeu)
                    .addComponent(phaseJeu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bois;
    private javax.swing.JLabel denier;
    private javax.swing.JLabel deniers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDenierPrestige;
    private javax.swing.JLabel labelNomJoueur;
    private javax.swing.JLabel labelPhaseJeu;
    private javax.swing.JLabel nomJoueur;
    private javax.swing.JLabel nourriture;
    private javax.swing.JLabel or;
    private javax.swing.JLabel phaseJeu;
    private javax.swing.JLabel pierre;
    private javax.swing.JLabel prestige;
    private javax.swing.JLabel prestige1;
    private javax.swing.JLabel ressources;
    private javax.swing.JLabel tissu;
    // End of variables declaration//GEN-END:variables
}