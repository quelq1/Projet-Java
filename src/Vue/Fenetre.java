/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Controleur.Controleur;
import Modele.Joueur;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Loïc Cimon
 */
public class Fenetre extends JFrame {

    public static Fenetre fenetre;

    public Fenetre() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Caylus");
        this.setContentPane(new choixJoueurPanel());

        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    public void affichePlateau(List<Joueur> joueurs) {
        Controleur controleur = new Controleur(joueurs);
        this.setContentPane(controleur.getPlateau());
        this.setPreferredSize(new Dimension(803, 741));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        //TODO Supprimer redimensionnement
        this.setResizable(true);

        //Active l'onglet infoJoueur
        jMenuItemInfo.setEnabled(true);
    }

    public static void main(String[] args) {
        fenetre = new Fenetre();
    }

    private void initComponents() {
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFichier = new javax.swing.JMenu();
        jMenuItemQuitter = new javax.swing.JMenuItem();
        jMenuOutils = new javax.swing.JMenu();
        jMenuItemInfo = new javax.swing.JMenuItem();
        jMenuAPropos = new javax.swing.JMenu();
        jMenuItemCaylus = new javax.swing.JMenuItem();
        jMenuFenetreDeJeuExclamationDeveloppeurs = new javax.swing.JMenuItem();

        jMenuFichier.setText("Fichier");

        jMenuItemQuitter.setText("Quitter");
        jMenuItemQuitter.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });
        jMenuFichier.add(jMenuItemQuitter);

        jMenuBar.add(jMenuFichier);

        jMenuOutils.setText("Outils");

        jMenuItemInfo.setText("Informations Joueurs");
        jMenuItemInfo.setEnabled(false);
        jMenuItemInfo.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new InfoJoueurs(fenetre, ((Plateau) fenetre.getContentPane()).getJoueurs());
            }
        });
        jMenuOutils.add(jMenuItemInfo);


        jMenuBar.add(jMenuOutils);

        jMenuAPropos.setText("?");

        jMenuItemCaylus.setText("A propos de Caylus");
        jMenuItemCaylus.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });
        jMenuAPropos.add(jMenuItemCaylus);

        jMenuFenetreDeJeuExclamationDeveloppeurs.setText("Développé par...");
        jMenuFenetreDeJeuExclamationDeveloppeurs.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });
        jMenuAPropos.add(jMenuFenetreDeJeuExclamationDeveloppeurs);

        jMenuBar.add(jMenuAPropos);

        setJMenuBar(jMenuBar);
    }
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuAPropos;
    private javax.swing.JMenuItem jMenuItemCaylus;
    private javax.swing.JMenuItem jMenuFenetreDeJeuExclamationDeveloppeurs;
    private javax.swing.JMenu jMenuFichier;
    private javax.swing.JMenuItem jMenuItemQuitter;
    private javax.swing.JMenu jMenuOutils;
    private javax.swing.JMenuItem jMenuItemInfo;
}
