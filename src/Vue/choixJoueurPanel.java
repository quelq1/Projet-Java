/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Modele.Joueur;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Loïc Cimon
 */
public class choixJoueurPanel extends javax.swing.JPanel {

    /**
     * Creates new form choixJoueurPanel
     */
    public choixJoueurPanel() {
        initComponents();
    }

    /**
     * Vérifie que les couleurs choisies
     *
     * @return vrai, si les couleurs sont toutes différentes.
     */
    private boolean verifChoixCouleur(ArrayList<String> couleurs) {
        boolean res = true;
        Set set = new HashSet(couleurs);
        if (couleurs.size() != set.size()) {
            JOptionPane.showMessageDialog(this, "Les couleurs des joueurs doivent être différentes.", "Attention...", JOptionPane.ERROR_MESSAGE);
            res = false;
        }
        return res;
    }

    /**
     * Récupère les couleurs choisies pour les joueurs
     *
     * @return liste des couleurs choisies pour les joueurs
     */
    private ArrayList<String> getCouleurSelectionne() {
        ArrayList<String> couleurSelect = new ArrayList<>();
        if (jCheckBox_j1.isSelected()) {
            couleurSelect.add(couleur_j1.getSelectedItem().toString());
        }
        if (jCheckBox_j2.isSelected()) {
            couleurSelect.add(couleur_j2.getSelectedItem().toString());
        }
        if (jCheckBox_j3.isSelected()) {
            couleurSelect.add(couleur_j3.getSelectedItem().toString());
        }
        if (jCheckBox_j4.isSelected()) {
            couleurSelect.add(couleur_j4.getSelectedItem().toString());
        }
        if (jCheckBox_j5.isSelected()) {
            couleurSelect.add(couleur_j5.getSelectedItem().toString());
        }
        return couleurSelect;
    }

    /**
     * Vérifie les noms choisis
     *
     * @return vrai, si les noms sont corrects.
     */
    private boolean verifNom(ArrayList<String> noms) {
        //Pour chaque nom
        for (String n : noms) {
            //Nom non vide
            if (n.compareTo("") == 0) {
                JOptionPane.showMessageDialog(this, "Les noms ne peuvent être vides.", "Attention...", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            //Nom par défaut changé
            if (n.compareTo("Entrez le nom du joueur...") == 0) {
                JOptionPane.showMessageDialog(this, "Veuillez saisir un nom pour tous les joueurs.", "Attention...", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            //Nom unique
            if (noms.indexOf(n) != noms.lastIndexOf(n)) {
                JOptionPane.showMessageDialog(this, "Les noms doivent être tous différents.", "Attention...", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    /**
     * Récupère les noms des joueurs
     *
     * @return liste des noms des joueurs
     */
    private ArrayList<String> getNomSelectionne() {
        ArrayList<String> nomSaisie = new ArrayList<>();
        if (jCheckBox_j1.isSelected()) {
            nomSaisie.add(nom_j1.getText());
        }
        if (jCheckBox_j2.isSelected()) {
            nomSaisie.add(nom_j2.getText());
        }
        if (jCheckBox_j3.isSelected()) {
            nomSaisie.add(nom_j3.getText());
        }
        if (jCheckBox_j4.isSelected()) {
            nomSaisie.add(nom_j4.getText());
        }
        if (jCheckBox_j5.isSelected()) {
            nomSaisie.add(nom_j5.getText());
        }
        return nomSaisie;
    }

    private List<Joueur> creationJoueur() {
        List<Joueur> joueurs = new ArrayList<>();
        joueurs.add(new Joueur(nom_j1.getText(), (String)couleur_j1.getSelectedItem()));
        joueurs.add(new Joueur(nom_j2.getText(), (String)couleur_j2.getSelectedItem()));

        if (jCheckBox_j3.isSelected()) {
            joueurs.add(new Joueur(nom_j3.getText(), (String)couleur_j3.getSelectedItem()));
        }
        if (jCheckBox_j4.isSelected()) {
            joueurs.add(new Joueur(nom_j4.getText(), (String)couleur_j4.getSelectedItem()));
        }
        if (jCheckBox_j5.isSelected()) {
            joueurs.add(new Joueur(nom_j5.getText(), (String)couleur_j5.getSelectedItem()));
        }

        return joueurs;
    }
    
    private Color getColor(JComboBox couleur_j1) {
        String couleur = (String) couleur_j1.getSelectedItem();
        if (couleur.compareTo("Noir") == 0) {
            return Color.black;
        }
        else if (couleur.compareTo("Bleu") == 0) {
            return Color.blue;
        }
        else if (couleur.compareTo("Vert") == 0) {
            return Color.green;
        }
        else if (couleur.compareTo("Rouge") == 0) {
            return Color.red;
        }
        else {
            return Color.orange;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jCheckBox_j1 = new javax.swing.JCheckBox();
        nom_j1 = new javax.swing.JTextField();
        couleur_j1 = new javax.swing.JComboBox();
        nom_j2 = new javax.swing.JTextField();
        couleur_j2 = new javax.swing.JComboBox();
        jCheckBox_j2 = new javax.swing.JCheckBox();
        nom_j3 = new javax.swing.JTextField();
        couleur_j3 = new javax.swing.JComboBox();
        jCheckBox_j3 = new javax.swing.JCheckBox();
        nom_j4 = new javax.swing.JTextField();
        couleur_j4 = new javax.swing.JComboBox();
        jCheckBox_j4 = new javax.swing.JCheckBox();
        nom_j5 = new javax.swing.JTextField();
        couleur_j5 = new javax.swing.JComboBox();
        jCheckBox_j5 = new javax.swing.JCheckBox();
        jouer = new javax.swing.JButton();

        setBackground(new java.awt.Color(254, 246, 199));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/titre.jpg"))); // NOI18N

        jCheckBox_j1.setBackground(new java.awt.Color(254, 246, 199));
        jCheckBox_j1.setSelected(true);
        jCheckBox_j1.setText("Joueur 1");
        jCheckBox_j1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox_j1ItemStateChanged(evt);
            }
        });

        nom_j1.setText("Entrez le nom du joueur...");
        nom_j1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nom_j1FocusGained(evt);
            }
        });

        couleur_j1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Noir", "Bleu", "Vert", "Rouge", "Orange" }));

        nom_j2.setText("Entrez le nom du joueur...");
        nom_j2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nom_j2FocusGained(evt);
            }
        });

        couleur_j2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bleu", "Vert", "Rouge", "Orange", "Noir" }));

        jCheckBox_j2.setBackground(new java.awt.Color(254, 246, 199));
        jCheckBox_j2.setSelected(true);
        jCheckBox_j2.setText("Joueur 2");
        jCheckBox_j2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox_j2ItemStateChanged(evt);
            }
        });

        nom_j3.setText("Entrez le nom du joueur...");
        nom_j3.setEnabled(false);
        nom_j3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nom_j3FocusGained(evt);
            }
        });

        couleur_j3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vert", "Rouge", "Orange", "Noir", "Bleu" }));
        couleur_j3.setEnabled(false);

        jCheckBox_j3.setBackground(new java.awt.Color(254, 246, 199));
        jCheckBox_j3.setText("Joueur 3");
        jCheckBox_j3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox_j3ItemStateChanged(evt);
            }
        });

        nom_j4.setText("Entrez le nom du joueur...");
        nom_j4.setEnabled(false);
        nom_j4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nom_j4FocusGained(evt);
            }
        });

        couleur_j4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rouge", "Orange", "Noir", "Bleu", "Vert" }));
        couleur_j4.setEnabled(false);

        jCheckBox_j4.setBackground(new java.awt.Color(254, 246, 199));
        jCheckBox_j4.setText("Joueur 4");
        jCheckBox_j4.setEnabled(false);
        jCheckBox_j4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox_j4ItemStateChanged(evt);
            }
        });

        nom_j5.setText("Entrez le nom du joueur...");
        nom_j5.setEnabled(false);
        nom_j5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nom_j5FocusGained(evt);
            }
        });

        couleur_j5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Orange", "Noir", "Bleu", "Vert", "Rouge" }));
        couleur_j5.setEnabled(false);

        jCheckBox_j5.setBackground(new java.awt.Color(254, 246, 199));
        jCheckBox_j5.setText("Joueur 5");
        jCheckBox_j5.setEnabled(false);
        jCheckBox_j5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox_j5ItemStateChanged(evt);
            }
        });

        jouer.setText("Jouez !");
        jouer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jouerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox_j5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox_j4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox_j3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox_j2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox_j1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(nom_j5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(couleur_j5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(nom_j4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(couleur_j4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(nom_j3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(couleur_j3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nom_j1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(couleur_j1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(nom_j2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(couleur_j2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jouer)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_j1)
                    .addComponent(nom_j1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(couleur_j1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_j2)
                    .addComponent(nom_j2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(couleur_j2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_j3)
                    .addComponent(nom_j3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(couleur_j3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_j4)
                    .addComponent(nom_j4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(couleur_j4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_j5)
                    .addComponent(nom_j5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(couleur_j5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jouer)
                .addGap(0, 9, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox_j1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox_j1ItemStateChanged
        boolean etat = false;
        if (((JCheckBox) evt.getSource()).isSelected()) {
            etat = true;
        }
        nom_j1.setEnabled(etat);
        couleur_j1.setEnabled(etat);
        jCheckBox_j2.setEnabled(etat);
    }//GEN-LAST:event_jCheckBox_j1ItemStateChanged

    private void jCheckBox_j2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox_j2ItemStateChanged
        boolean etat = false;
        if (((JCheckBox) evt.getSource()).isSelected()) {
            etat = true;
        }
        nom_j2.setEnabled(etat);
        couleur_j2.setEnabled(etat);
        jCheckBox_j3.setEnabled(etat);
    }//GEN-LAST:event_jCheckBox_j2ItemStateChanged

    private void jCheckBox_j3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox_j3ItemStateChanged
        boolean etat = false;
        if (((JCheckBox) evt.getSource()).isSelected()) {
            etat = true;
        }
        nom_j3.setEnabled(etat);
        couleur_j3.setEnabled(etat);
        jCheckBox_j4.setEnabled(etat);
    }//GEN-LAST:event_jCheckBox_j3ItemStateChanged

    private void jCheckBox_j4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox_j4ItemStateChanged
        boolean etat = false;
        if (((JCheckBox) evt.getSource()).isSelected()) {
            etat = true;
        }
        nom_j4.setEnabled(etat);
        couleur_j4.setEnabled(etat);
        jCheckBox_j5.setEnabled(etat);
    }//GEN-LAST:event_jCheckBox_j4ItemStateChanged

    private void jCheckBox_j5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox_j5ItemStateChanged
        boolean etat = false;
        if (((JCheckBox) evt.getSource()).isSelected()) {
            etat = true;
        }
        nom_j5.setEnabled(etat);
        couleur_j5.setEnabled(etat);
    }//GEN-LAST:event_jCheckBox_j5ItemStateChanged

    private void jouerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jouerActionPerformed
        //Vérifie le nombre de joueur
        if (jCheckBox_j1.isSelected() && jCheckBox_j2.isSelected()) {

            //Vérifie le nom des joueurs et le choix des couleurs
            if (this.verifNom(this.getNomSelectionne())
                    && this.verifChoixCouleur(this.getCouleurSelectionne())) {

                //Tout est ok, on crée les joueurs
                List<Joueur> joueurs = creationJoueur();

                //On affiche le plateau
                ((Fenetre) this.getTopLevelAncestor()).affichePlateau(joueurs);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner au moins deux joueurs", "Attention...", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jouerActionPerformed

    private void nom_j1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nom_j1FocusGained
        nom_j1.setText("");
    }//GEN-LAST:event_nom_j1FocusGained

    private void nom_j2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nom_j2FocusGained
        nom_j2.setText("");
    }//GEN-LAST:event_nom_j2FocusGained

    private void nom_j3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nom_j3FocusGained
        nom_j3.setText("");
    }//GEN-LAST:event_nom_j3FocusGained

    private void nom_j4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nom_j4FocusGained
        nom_j4.setText("");
    }//GEN-LAST:event_nom_j4FocusGained

    private void nom_j5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nom_j5FocusGained
        nom_j5.setText("");
    }//GEN-LAST:event_nom_j5FocusGained
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox couleur_j1;
    private javax.swing.JComboBox couleur_j2;
    private javax.swing.JComboBox couleur_j3;
    private javax.swing.JComboBox couleur_j4;
    private javax.swing.JComboBox couleur_j5;
    private javax.swing.JCheckBox jCheckBox_j1;
    private javax.swing.JCheckBox jCheckBox_j2;
    private javax.swing.JCheckBox jCheckBox_j3;
    private javax.swing.JCheckBox jCheckBox_j4;
    private javax.swing.JCheckBox jCheckBox_j5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jouer;
    private javax.swing.JTextField nom_j1;
    private javax.swing.JTextField nom_j2;
    private javax.swing.JTextField nom_j3;
    private javax.swing.JTextField nom_j4;
    private javax.swing.JTextField nom_j5;
    // End of variables declaration//GEN-END:variables
}
