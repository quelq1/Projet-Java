/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ChoixEtiquettes.java
 *
 * Created on 21 juin 2009, 13:31:54
 */

package Controleur;

import Modele.Joueur;
import Vue.Outils.ImagePanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author Mouna
 */
public class ChoixEtiquettes extends javax.swing.JDialog {
    private ArrayList<JPanel> jPanelSelectionnables;
    Border blackline;
    private JFrame _papa ;
    private Joueur _joueur;
    /** Creates new form ChoixEtiquettes */
    public ChoixEtiquettes(java.awt.Frame parent, boolean modal, Joueur pJoueur) {
        super (parent, true);
        _papa = (Frame) parent ;
        _joueur = pJoueur;
        blackline = BorderFactory.createLineBorder(Color.black);
        initComponents();
        initArraylist();
        centrerFenetre();
        jLabelNomJoueur.setText(_joueur.getNom());
        jLabelDroitOK.setVisible(false);
        jLabelpasLeDroit1.setVisible(false);
        jLabelPasLeDroit2.setVisible(false);
        repaint();
    }

      private void centrerFenetre()
    {
        // on place notre fenêtre au milieu
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screen.width - getSize().width)/2,(screen.height - getSize().height)/2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanelEtiquettesOranges = new javax.swing.JPanel();
        jPanelEtiquetteBrown7 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\brown7.png");
        jPanelEtiquetteBrown8 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\brown8.png");
        jPanelEtiquetteBrownn11 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\brown11.png");
        jPanelEtiquetteBrown10 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\brown10.png");
        jPanelEtiquetteBrown9 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\brown9.png");
        jPanelEtiquetteBrown13 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\brown13.png");
        jPanelEtiquetteBrown14 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\brown14.png");
        jPanelEtiquetteBrownn12 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\brown12.png");
        jPanelEtiquettesBleues = new javax.swing.JPanel();
        jPanelEtiquetteBlue32 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\blue32.png");
        jPanelEtiquetteBlue33 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\blue33.png");
        jPanelEtiquetteBlue34 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\blue34.png");
        jPanelEtiquetteBlue35 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\blue35.png");
        jPanelEtiquetteBlue36 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\blue36.png");
        jPanelEtiquetteBlue37 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\blue37.png");
        jPanelEtiquetteBlue38 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\blue38.png");
        jPanelEtiquetteBlue39 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\blue39.png");
        jPanelEtiquetteBlue40 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\blue40.png");
        jPanel4 = new javax.swing.JPanel();
        jPanelEtiquetteGray15 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\gray15.png");
        jPanelEtiquetteGray16 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\Gray16.png");
        jPanelEtiquetteGray17 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\Gray17.png");
        jPanelEtiquetteGray18 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\gray18.png");
        jPanelEtiquetteGray19 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\gray19.png");
        jPanelEtiquetteGray20 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\gray20.png");
        jPanelEtiquetteGray21 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\gray21.png");
        jPanelEtiquetteGray22 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\gray22.png");
        jPanelEtiquetteGray23 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\gray23.png");
        jPanelEtiquettesVertes = new javax.swing.JPanel();
        jPanelEtiquetteGreen24 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\green.png");
        jPanelEtiquetteGreen25 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\green.png");
        jPanelEtiquetteGreen26 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\green.png");
        jPanelEtiquetteGreen31 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\green.png");
        jPanelEtiquetteGreen30 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\green.png");
        jPanelEtiquetteGreen27 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\green.png");
        jPanelEtiquetteGreen28 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\green.png");
        jPanelEtiquetteGreen29 = new DessinerDansCase(0,"src\\Images\\etiquettes\\resteDesEtiquettes\\green.png");
        jPanelInfoEtiquette = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNomEtiquette = new javax.swing.JLabel();
        jLabelPrixEtiquette = new javax.swing.JLabel();
        jLabelPrixUn = new javax.swing.JLabel();
        jLabelPrixDeux = new javax.swing.JLabel();
        jLabelChoixEtiquetteCancel = new javax.swing.JLabel();
        jLabelChoixEtiquetteOK = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelDroitOK = new javax.swing.JLabel();
        jLabelpasLeDroit1 = new javax.swing.JLabel();
        jLabelPasLeDroit2 = new javax.swing.JLabel();
        jLabelNomJoueur = new javax.swing.JLabel();

        setTitle("Liste des etiquettes");
        setName("Liste des étiquettes"); // NOI18N
        setResizable(false);

        jPanelEtiquetteBrown7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteBrown7.setInheritsPopupMenu(true);
        jPanelEtiquetteBrown7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteBrown7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteBrown7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteBrown7Layout = new javax.swing.GroupLayout(jPanelEtiquetteBrown7);
        jPanelEtiquetteBrown7.setLayout(jPanelEtiquetteBrown7Layout);
        jPanelEtiquetteBrown7Layout.setHorizontalGroup(
            jPanelEtiquetteBrown7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteBrown7Layout.setVerticalGroup(
            jPanelEtiquetteBrown7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteBrown8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteBrown8.setInheritsPopupMenu(true);
        jPanelEtiquetteBrown8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteBrown8MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteBrown8Layout = new javax.swing.GroupLayout(jPanelEtiquetteBrown8);
        jPanelEtiquetteBrown8.setLayout(jPanelEtiquetteBrown8Layout);
        jPanelEtiquetteBrown8Layout.setHorizontalGroup(
            jPanelEtiquetteBrown8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteBrown8Layout.setVerticalGroup(
            jPanelEtiquetteBrown8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteBrownn11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteBrownn11.setInheritsPopupMenu(true);
        jPanelEtiquetteBrownn11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteBrownn11MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteBrownn11Layout = new javax.swing.GroupLayout(jPanelEtiquetteBrownn11);
        jPanelEtiquetteBrownn11.setLayout(jPanelEtiquetteBrownn11Layout);
        jPanelEtiquetteBrownn11Layout.setHorizontalGroup(
            jPanelEtiquetteBrownn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteBrownn11Layout.setVerticalGroup(
            jPanelEtiquetteBrownn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteBrown10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteBrown10.setInheritsPopupMenu(true);
        jPanelEtiquetteBrown10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteBrown10MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteBrown10Layout = new javax.swing.GroupLayout(jPanelEtiquetteBrown10);
        jPanelEtiquetteBrown10.setLayout(jPanelEtiquetteBrown10Layout);
        jPanelEtiquetteBrown10Layout.setHorizontalGroup(
            jPanelEtiquetteBrown10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteBrown10Layout.setVerticalGroup(
            jPanelEtiquetteBrown10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteBrown9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteBrown9.setInheritsPopupMenu(true);
        jPanelEtiquetteBrown9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteBrown9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteBrown9Layout = new javax.swing.GroupLayout(jPanelEtiquetteBrown9);
        jPanelEtiquetteBrown9.setLayout(jPanelEtiquetteBrown9Layout);
        jPanelEtiquetteBrown9Layout.setHorizontalGroup(
            jPanelEtiquetteBrown9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteBrown9Layout.setVerticalGroup(
            jPanelEtiquetteBrown9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteBrown13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteBrown13.setInheritsPopupMenu(true);
        jPanelEtiquetteBrown13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteBrown13MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteBrown13Layout = new javax.swing.GroupLayout(jPanelEtiquetteBrown13);
        jPanelEtiquetteBrown13.setLayout(jPanelEtiquetteBrown13Layout);
        jPanelEtiquetteBrown13Layout.setHorizontalGroup(
            jPanelEtiquetteBrown13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteBrown13Layout.setVerticalGroup(
            jPanelEtiquetteBrown13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteBrown14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteBrown14.setInheritsPopupMenu(true);
        jPanelEtiquetteBrown14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteBrown14MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteBrown14Layout = new javax.swing.GroupLayout(jPanelEtiquetteBrown14);
        jPanelEtiquetteBrown14.setLayout(jPanelEtiquetteBrown14Layout);
        jPanelEtiquetteBrown14Layout.setHorizontalGroup(
            jPanelEtiquetteBrown14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteBrown14Layout.setVerticalGroup(
            jPanelEtiquetteBrown14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteBrownn12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteBrownn12.setInheritsPopupMenu(true);
        jPanelEtiquetteBrownn12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteBrownn12MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteBrownn12Layout = new javax.swing.GroupLayout(jPanelEtiquetteBrownn12);
        jPanelEtiquetteBrownn12.setLayout(jPanelEtiquetteBrownn12Layout);
        jPanelEtiquetteBrownn12Layout.setHorizontalGroup(
            jPanelEtiquetteBrownn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteBrownn12Layout.setVerticalGroup(
            jPanelEtiquetteBrownn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelEtiquettesOrangesLayout = new javax.swing.GroupLayout(jPanelEtiquettesOranges);
        jPanelEtiquettesOranges.setLayout(jPanelEtiquettesOrangesLayout);
        jPanelEtiquettesOrangesLayout.setHorizontalGroup(
            jPanelEtiquettesOrangesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEtiquettesOrangesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelEtiquettesOrangesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEtiquettesOrangesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEtiquettesOrangesLayout.createSequentialGroup()
                            .addComponent(jPanelEtiquetteBrown7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanelEtiquetteBrown8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(jPanelEtiquetteBrown9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelEtiquettesOrangesLayout.createSequentialGroup()
                            .addComponent(jPanelEtiquetteBrown10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanelEtiquetteBrownn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanelEtiquetteBrownn12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelEtiquettesOrangesLayout.createSequentialGroup()
                        .addComponent(jPanelEtiquetteBrown13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelEtiquetteBrown14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanelEtiquettesOrangesLayout.setVerticalGroup(
            jPanelEtiquettesOrangesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEtiquettesOrangesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEtiquettesOrangesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEtiquetteBrown7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteBrown8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteBrown9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEtiquettesOrangesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEtiquetteBrownn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteBrownn12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteBrown10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanelEtiquettesOrangesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEtiquetteBrown13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteBrown14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanelEtiquettesOranges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanelEtiquettesOranges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Bâtiments en bois", jPanel3);

        jPanelEtiquetteBlue32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteBlue32.setInheritsPopupMenu(true);
        jPanelEtiquetteBlue32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteBlue32MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteBlue32Layout = new javax.swing.GroupLayout(jPanelEtiquetteBlue32);
        jPanelEtiquetteBlue32.setLayout(jPanelEtiquetteBlue32Layout);
        jPanelEtiquetteBlue32Layout.setHorizontalGroup(
            jPanelEtiquetteBlue32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteBlue32Layout.setVerticalGroup(
            jPanelEtiquetteBlue32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteBlue33.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteBlue33.setInheritsPopupMenu(true);
        jPanelEtiquetteBlue33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteBlue33MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteBlue33Layout = new javax.swing.GroupLayout(jPanelEtiquetteBlue33);
        jPanelEtiquetteBlue33.setLayout(jPanelEtiquetteBlue33Layout);
        jPanelEtiquetteBlue33Layout.setHorizontalGroup(
            jPanelEtiquetteBlue33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteBlue33Layout.setVerticalGroup(
            jPanelEtiquetteBlue33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteBlue34.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteBlue34.setInheritsPopupMenu(true);
        jPanelEtiquetteBlue34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteBlue34MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteBlue34Layout = new javax.swing.GroupLayout(jPanelEtiquetteBlue34);
        jPanelEtiquetteBlue34.setLayout(jPanelEtiquetteBlue34Layout);
        jPanelEtiquetteBlue34Layout.setHorizontalGroup(
            jPanelEtiquetteBlue34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteBlue34Layout.setVerticalGroup(
            jPanelEtiquetteBlue34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteBlue35.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteBlue35.setInheritsPopupMenu(true);
        jPanelEtiquetteBlue35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteBlue35MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteBlue35Layout = new javax.swing.GroupLayout(jPanelEtiquetteBlue35);
        jPanelEtiquetteBlue35.setLayout(jPanelEtiquetteBlue35Layout);
        jPanelEtiquetteBlue35Layout.setHorizontalGroup(
            jPanelEtiquetteBlue35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteBlue35Layout.setVerticalGroup(
            jPanelEtiquetteBlue35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteBlue36.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteBlue36.setInheritsPopupMenu(true);
        jPanelEtiquetteBlue36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteBlue36MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteBlue36Layout = new javax.swing.GroupLayout(jPanelEtiquetteBlue36);
        jPanelEtiquetteBlue36.setLayout(jPanelEtiquetteBlue36Layout);
        jPanelEtiquetteBlue36Layout.setHorizontalGroup(
            jPanelEtiquetteBlue36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteBlue36Layout.setVerticalGroup(
            jPanelEtiquetteBlue36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteBlue37.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteBlue37.setInheritsPopupMenu(true);
        jPanelEtiquetteBlue37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteBlue37MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteBlue37Layout = new javax.swing.GroupLayout(jPanelEtiquetteBlue37);
        jPanelEtiquetteBlue37.setLayout(jPanelEtiquetteBlue37Layout);
        jPanelEtiquetteBlue37Layout.setHorizontalGroup(
            jPanelEtiquetteBlue37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteBlue37Layout.setVerticalGroup(
            jPanelEtiquetteBlue37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteBlue38.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteBlue38.setInheritsPopupMenu(true);
        jPanelEtiquetteBlue38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteBlue38MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteBlue38Layout = new javax.swing.GroupLayout(jPanelEtiquetteBlue38);
        jPanelEtiquetteBlue38.setLayout(jPanelEtiquetteBlue38Layout);
        jPanelEtiquetteBlue38Layout.setHorizontalGroup(
            jPanelEtiquetteBlue38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteBlue38Layout.setVerticalGroup(
            jPanelEtiquetteBlue38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteBlue39.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteBlue39.setInheritsPopupMenu(true);
        jPanelEtiquetteBlue39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteBlue39MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteBlue39Layout = new javax.swing.GroupLayout(jPanelEtiquetteBlue39);
        jPanelEtiquetteBlue39.setLayout(jPanelEtiquetteBlue39Layout);
        jPanelEtiquetteBlue39Layout.setHorizontalGroup(
            jPanelEtiquetteBlue39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteBlue39Layout.setVerticalGroup(
            jPanelEtiquetteBlue39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteBlue40.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteBlue40.setInheritsPopupMenu(true);
        jPanelEtiquetteBlue40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteBlue40MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteBlue40Layout = new javax.swing.GroupLayout(jPanelEtiquetteBlue40);
        jPanelEtiquetteBlue40.setLayout(jPanelEtiquetteBlue40Layout);
        jPanelEtiquetteBlue40Layout.setHorizontalGroup(
            jPanelEtiquetteBlue40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteBlue40Layout.setVerticalGroup(
            jPanelEtiquetteBlue40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelEtiquettesBleuesLayout = new javax.swing.GroupLayout(jPanelEtiquettesBleues);
        jPanelEtiquettesBleues.setLayout(jPanelEtiquettesBleuesLayout);
        jPanelEtiquettesBleuesLayout.setHorizontalGroup(
            jPanelEtiquettesBleuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEtiquettesBleuesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelEtiquettesBleuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEtiquettesBleuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelEtiquettesBleuesLayout.createSequentialGroup()
                            .addComponent(jPanelEtiquetteBlue32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanelEtiquetteBlue33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEtiquettesBleuesLayout.createSequentialGroup()
                            .addComponent(jPanelEtiquetteBlue35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanelEtiquetteBlue36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEtiquettesBleuesLayout.createSequentialGroup()
                        .addComponent(jPanelEtiquetteBlue38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelEtiquetteBlue39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEtiquettesBleuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEtiquetteBlue40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteBlue37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteBlue34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanelEtiquettesBleuesLayout.setVerticalGroup(
            jPanelEtiquettesBleuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEtiquettesBleuesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEtiquettesBleuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEtiquetteBlue34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteBlue33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteBlue32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEtiquettesBleuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEtiquetteBlue37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteBlue36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteBlue35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEtiquettesBleuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEtiquetteBlue40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteBlue39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteBlue38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Bâtiments de prestige", jPanelEtiquettesBleues);

        jPanelEtiquetteGray15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteGray15.setInheritsPopupMenu(true);
        jPanelEtiquetteGray15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteGray15MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteGray15Layout = new javax.swing.GroupLayout(jPanelEtiquetteGray15);
        jPanelEtiquetteGray15.setLayout(jPanelEtiquetteGray15Layout);
        jPanelEtiquetteGray15Layout.setHorizontalGroup(
            jPanelEtiquetteGray15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteGray15Layout.setVerticalGroup(
            jPanelEtiquetteGray15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteGray16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteGray16.setInheritsPopupMenu(true);
        jPanelEtiquetteGray16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteGray16MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteGray16Layout = new javax.swing.GroupLayout(jPanelEtiquetteGray16);
        jPanelEtiquetteGray16.setLayout(jPanelEtiquetteGray16Layout);
        jPanelEtiquetteGray16Layout.setHorizontalGroup(
            jPanelEtiquetteGray16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteGray16Layout.setVerticalGroup(
            jPanelEtiquetteGray16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteGray17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteGray17.setInheritsPopupMenu(true);
        jPanelEtiquetteGray17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteGray17MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteGray17Layout = new javax.swing.GroupLayout(jPanelEtiquetteGray17);
        jPanelEtiquetteGray17.setLayout(jPanelEtiquetteGray17Layout);
        jPanelEtiquetteGray17Layout.setHorizontalGroup(
            jPanelEtiquetteGray17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteGray17Layout.setVerticalGroup(
            jPanelEtiquetteGray17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteGray18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteGray18.setInheritsPopupMenu(true);
        jPanelEtiquetteGray18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteGray18MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteGray18Layout = new javax.swing.GroupLayout(jPanelEtiquetteGray18);
        jPanelEtiquetteGray18.setLayout(jPanelEtiquetteGray18Layout);
        jPanelEtiquetteGray18Layout.setHorizontalGroup(
            jPanelEtiquetteGray18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteGray18Layout.setVerticalGroup(
            jPanelEtiquetteGray18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteGray19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteGray19.setInheritsPopupMenu(true);
        jPanelEtiquetteGray19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteGray19MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteGray19Layout = new javax.swing.GroupLayout(jPanelEtiquetteGray19);
        jPanelEtiquetteGray19.setLayout(jPanelEtiquetteGray19Layout);
        jPanelEtiquetteGray19Layout.setHorizontalGroup(
            jPanelEtiquetteGray19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteGray19Layout.setVerticalGroup(
            jPanelEtiquetteGray19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteGray20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteGray20.setInheritsPopupMenu(true);
        jPanelEtiquetteGray20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteGray20MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteGray20Layout = new javax.swing.GroupLayout(jPanelEtiquetteGray20);
        jPanelEtiquetteGray20.setLayout(jPanelEtiquetteGray20Layout);
        jPanelEtiquetteGray20Layout.setHorizontalGroup(
            jPanelEtiquetteGray20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteGray20Layout.setVerticalGroup(
            jPanelEtiquetteGray20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteGray21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteGray21.setInheritsPopupMenu(true);
        jPanelEtiquetteGray21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteGray21MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteGray21Layout = new javax.swing.GroupLayout(jPanelEtiquetteGray21);
        jPanelEtiquetteGray21.setLayout(jPanelEtiquetteGray21Layout);
        jPanelEtiquetteGray21Layout.setHorizontalGroup(
            jPanelEtiquetteGray21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteGray21Layout.setVerticalGroup(
            jPanelEtiquetteGray21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteGray22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteGray22.setInheritsPopupMenu(true);
        jPanelEtiquetteGray22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteGray22MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteGray22Layout = new javax.swing.GroupLayout(jPanelEtiquetteGray22);
        jPanelEtiquetteGray22.setLayout(jPanelEtiquetteGray22Layout);
        jPanelEtiquetteGray22Layout.setHorizontalGroup(
            jPanelEtiquetteGray22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteGray22Layout.setVerticalGroup(
            jPanelEtiquetteGray22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteGray23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteGray23.setInheritsPopupMenu(true);
        jPanelEtiquetteGray23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteGray23MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteGray23Layout = new javax.swing.GroupLayout(jPanelEtiquetteGray23);
        jPanelEtiquetteGray23.setLayout(jPanelEtiquetteGray23Layout);
        jPanelEtiquetteGray23Layout.setHorizontalGroup(
            jPanelEtiquetteGray23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteGray23Layout.setVerticalGroup(
            jPanelEtiquetteGray23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanelEtiquetteGray15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelEtiquetteGray16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelEtiquetteGray17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jPanelEtiquetteGray21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanelEtiquetteGray22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanelEtiquetteGray23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jPanelEtiquetteGray18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanelEtiquetteGray19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanelEtiquetteGray20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEtiquetteGray15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteGray16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteGray17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEtiquetteGray19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteGray18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteGray20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEtiquetteGray21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteGray22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteGray23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Bâtiements en pierre", jPanel4);

        jPanelEtiquetteGreen24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteGreen24.setInheritsPopupMenu(true);
        jPanelEtiquetteGreen24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteGreen24MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteGreen24Layout = new javax.swing.GroupLayout(jPanelEtiquetteGreen24);
        jPanelEtiquetteGreen24.setLayout(jPanelEtiquetteGreen24Layout);
        jPanelEtiquetteGreen24Layout.setHorizontalGroup(
            jPanelEtiquetteGreen24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteGreen24Layout.setVerticalGroup(
            jPanelEtiquetteGreen24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteGreen25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteGreen25.setInheritsPopupMenu(true);
        jPanelEtiquetteGreen25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteGreen25MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteGreen25Layout = new javax.swing.GroupLayout(jPanelEtiquetteGreen25);
        jPanelEtiquetteGreen25.setLayout(jPanelEtiquetteGreen25Layout);
        jPanelEtiquetteGreen25Layout.setHorizontalGroup(
            jPanelEtiquetteGreen25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteGreen25Layout.setVerticalGroup(
            jPanelEtiquetteGreen25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteGreen26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteGreen26.setInheritsPopupMenu(true);
        jPanelEtiquetteGreen26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteGreen26MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteGreen26Layout = new javax.swing.GroupLayout(jPanelEtiquetteGreen26);
        jPanelEtiquetteGreen26.setLayout(jPanelEtiquetteGreen26Layout);
        jPanelEtiquetteGreen26Layout.setHorizontalGroup(
            jPanelEtiquetteGreen26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteGreen26Layout.setVerticalGroup(
            jPanelEtiquetteGreen26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteGreen31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteGreen31.setInheritsPopupMenu(true);
        jPanelEtiquetteGreen31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteGreen31MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteGreen31Layout = new javax.swing.GroupLayout(jPanelEtiquetteGreen31);
        jPanelEtiquetteGreen31.setLayout(jPanelEtiquetteGreen31Layout);
        jPanelEtiquetteGreen31Layout.setHorizontalGroup(
            jPanelEtiquetteGreen31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteGreen31Layout.setVerticalGroup(
            jPanelEtiquetteGreen31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteGreen30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteGreen30.setInheritsPopupMenu(true);
        jPanelEtiquetteGreen30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteGreen30MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteGreen30Layout = new javax.swing.GroupLayout(jPanelEtiquetteGreen30);
        jPanelEtiquetteGreen30.setLayout(jPanelEtiquetteGreen30Layout);
        jPanelEtiquetteGreen30Layout.setHorizontalGroup(
            jPanelEtiquetteGreen30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteGreen30Layout.setVerticalGroup(
            jPanelEtiquetteGreen30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteGreen27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteGreen27.setInheritsPopupMenu(true);
        jPanelEtiquetteGreen27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteGreen27MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteGreen27Layout = new javax.swing.GroupLayout(jPanelEtiquetteGreen27);
        jPanelEtiquetteGreen27.setLayout(jPanelEtiquetteGreen27Layout);
        jPanelEtiquetteGreen27Layout.setHorizontalGroup(
            jPanelEtiquetteGreen27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteGreen27Layout.setVerticalGroup(
            jPanelEtiquetteGreen27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteGreen28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteGreen28.setInheritsPopupMenu(true);
        jPanelEtiquetteGreen28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteGreen28MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteGreen28Layout = new javax.swing.GroupLayout(jPanelEtiquetteGreen28);
        jPanelEtiquetteGreen28.setLayout(jPanelEtiquetteGreen28Layout);
        jPanelEtiquetteGreen28Layout.setHorizontalGroup(
            jPanelEtiquetteGreen28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteGreen28Layout.setVerticalGroup(
            jPanelEtiquetteGreen28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanelEtiquetteGreen29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEtiquetteGreen29.setInheritsPopupMenu(true);
        jPanelEtiquetteGreen29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelEtiquetteGreen29MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEtiquetteGreen29Layout = new javax.swing.GroupLayout(jPanelEtiquetteGreen29);
        jPanelEtiquetteGreen29.setLayout(jPanelEtiquetteGreen29Layout);
        jPanelEtiquetteGreen29Layout.setHorizontalGroup(
            jPanelEtiquetteGreen29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelEtiquetteGreen29Layout.setVerticalGroup(
            jPanelEtiquetteGreen29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelEtiquettesVertesLayout = new javax.swing.GroupLayout(jPanelEtiquettesVertes);
        jPanelEtiquettesVertes.setLayout(jPanelEtiquettesVertesLayout);
        jPanelEtiquettesVertesLayout.setHorizontalGroup(
            jPanelEtiquettesVertesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEtiquettesVertesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelEtiquettesVertesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEtiquettesVertesLayout.createSequentialGroup()
                        .addComponent(jPanelEtiquetteGreen24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelEtiquetteGreen25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelEtiquetteGreen26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEtiquettesVertesLayout.createSequentialGroup()
                        .addComponent(jPanelEtiquetteGreen27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelEtiquetteGreen28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelEtiquetteGreen29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEtiquettesVertesLayout.createSequentialGroup()
                        .addComponent(jPanelEtiquetteGreen30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelEtiquetteGreen31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanelEtiquettesVertesLayout.setVerticalGroup(
            jPanelEtiquettesVertesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEtiquettesVertesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEtiquettesVertesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEtiquetteGreen26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteGreen25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteGreen24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEtiquettesVertesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEtiquetteGreen27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteGreen28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteGreen29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEtiquettesVertesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEtiquetteGreen30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEtiquetteGreen31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Bâtiments résidentiels", jPanelEtiquettesVertes);

        jPanelInfoEtiquette.setBorder(javax.swing.BorderFactory.createTitledBorder("Etiquette"));

        jLabelNomEtiquette.setText("Nom: ???");

        jLabelPrixEtiquette.setText("Prix: ???");

        jLabelChoixEtiquetteCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/caylus_button_cancel.png"))); // NOI18N
        jLabelChoixEtiquetteCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelChoixEtiquetteCancelMouseClicked(evt);
            }
        });

        jLabelChoixEtiquetteOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/caylus_button_ok.png"))); // NOI18N
        jLabelChoixEtiquetteOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelChoixEtiquetteOKMouseClicked(evt);
            }
        });

        jLabel2.setText("Vous avez choisi de construire ce batiment:");

        jLabelDroitOK.setForeground(new java.awt.Color(51, 153, 0));
        jLabelDroitOK.setText("Vous pouvez construire ce batiment.");

        jLabelpasLeDroit1.setForeground(new java.awt.Color(204, 0, 0));
        jLabelpasLeDroit1.setText("Vous n'avez pas le droit de construire");

        jLabelPasLeDroit2.setForeground(new java.awt.Color(204, 0, 0));
        jLabelPasLeDroit2.setText(" ce batiment.");

        jLabelNomJoueur.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabelNomJoueur.setText("nom du Joueur");

        javax.swing.GroupLayout jPanelInfoEtiquetteLayout = new javax.swing.GroupLayout(jPanelInfoEtiquette);
        jPanelInfoEtiquette.setLayout(jPanelInfoEtiquetteLayout);
        jPanelInfoEtiquetteLayout.setHorizontalGroup(
            jPanelInfoEtiquetteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoEtiquetteLayout.createSequentialGroup()
                .addGroup(jPanelInfoEtiquetteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfoEtiquetteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanelInfoEtiquetteLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanelInfoEtiquetteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelInfoEtiquetteLayout.createSequentialGroup()
                                .addComponent(jLabelChoixEtiquetteCancel)
                                .addGap(27, 27, 27)
                                .addComponent(jLabelChoixEtiquetteOK, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelInfoEtiquetteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelpasLeDroit1)
                                .addComponent(jLabelDroitOK)
                                .addComponent(jLabelPasLeDroit2))))
                    .addGroup(jPanelInfoEtiquetteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelNomEtiquette, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInfoEtiquetteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelPrixEtiquette, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInfoEtiquetteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanelInfoEtiquetteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelNomJoueur)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelInfoEtiquetteLayout.setVerticalGroup(
            jPanelInfoEtiquetteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoEtiquetteLayout.createSequentialGroup()
                .addComponent(jLabelNomJoueur)
                .addGap(1, 1, 1)
                .addGroup(jPanelInfoEtiquetteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNomEtiquette, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPrixEtiquette, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabelDroitOK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelpasLeDroit1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPasLeDroit2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelInfoEtiquetteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelChoixEtiquetteCancel)
                    .addComponent(jLabelChoixEtiquetteOK)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelInfoEtiquette, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanelInfoEtiquette, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("Brown");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelEtiquetteBrown7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteBrown7MousePressed
        afficherUneBordureSurLaSelection(0);
        jLabelNomEtiquette.setText("Etiquette Brown 7");
        jLabelPrixEtiquette.setText("1 Bois et 1 choix");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(7);
    }//GEN-LAST:event_jPanelEtiquetteBrown7MousePressed

    private void jPanelEtiquetteBrown8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteBrown8MousePressed
        afficherUneBordureSurLaSelection(1);
        jLabelNomEtiquette.setText("Etiquette Brown 8");
        jLabelPrixEtiquette.setText("1 Bois et 1 Nourriture");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(8);
    }//GEN-LAST:event_jPanelEtiquetteBrown8MousePressed

    private void jPanelEtiquetteBrown9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteBrown9MousePressed
        afficherUneBordureSurLaSelection(2);
        jLabelNomEtiquette.setText("Etiquette Brown 9");
        jLabelPrixEtiquette.setText("1 Bois et 1 Tissu");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(9);
    }//GEN-LAST:event_jPanelEtiquetteBrown9MousePressed

    private void jPanelEtiquetteBrown10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteBrown10MousePressed
        afficherUneBordureSurLaSelection(3);
        jLabelNomEtiquette.setText("Etiquette Brown 10");
        jLabelPrixEtiquette.setText("1 Bois et 1 Nourriture");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(10);
    }//GEN-LAST:event_jPanelEtiquetteBrown10MousePressed

    private void jPanelEtiquetteBrownn11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteBrownn11MousePressed
        afficherUneBordureSurLaSelection(4);
        jLabelNomEtiquette.setText("Etiquette Brown 11");
        jLabelPrixEtiquette.setText("1 Bois et 1 Nourriture");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(11);
    }//GEN-LAST:event_jPanelEtiquetteBrownn11MousePressed

    private void jPanelEtiquetteBrownn12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteBrownn12MousePressed
        afficherUneBordureSurLaSelection(5);
        jLabelNomEtiquette.setText("Etiquette Brown 12");
        jLabelPrixEtiquette.setText("1 Bois et 1 au choix");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(12);
    }//GEN-LAST:event_jPanelEtiquetteBrownn12MousePressed

    private void jPanelEtiquetteBrown13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteBrown13MousePressed
        afficherUneBordureSurLaSelection(6);
        jLabelNomEtiquette.setText("Etiquette Brown 13");
        jLabelPrixEtiquette.setText("1 Bois et 1 Nourriture");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(13);
    }//GEN-LAST:event_jPanelEtiquetteBrown13MousePressed

    private void jPanelEtiquetteBrown14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteBrown14MousePressed
        afficherUneBordureSurLaSelection(7);
        jLabelNomEtiquette.setText("Etiquette Brown 14");
        jLabelPrixEtiquette.setText("1 Bois et 1 Nourriture");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(14);
    }//GEN-LAST:event_jPanelEtiquetteBrown14MousePressed

    private void jPanelEtiquetteBlue32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteBlue32MousePressed
        afficherUneBordureSurLaSelection(8);
        jLabelNomEtiquette.setText("Etiquette Blue 32");
        jLabelPrixEtiquette.setText("2 Pierres et 1 Or");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(32);
    }//GEN-LAST:event_jPanelEtiquetteBlue32MousePressed

    private void jPanelEtiquetteBlue33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteBlue33MousePressed
        afficherUneBordureSurLaSelection(9);
        jLabelNomEtiquette.setText("Etiquette Blue 33");
        jLabelPrixEtiquette.setText("3 Bois et 2 or");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(33);
    }//GEN-LAST:event_jPanelEtiquetteBlue33MousePressed

    private void jPanelEtiquetteBlue34MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteBlue34MousePressed
        afficherUneBordureSurLaSelection(10);
        jLabelNomEtiquette.setText("Etiquette Blue 34");
        jLabelPrixEtiquette.setText("3 Pierres et 1 Or");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(34);
    }//GEN-LAST:event_jPanelEtiquetteBlue34MousePressed

    private void jPanelEtiquetteBlue35MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteBlue35MousePressed
        afficherUneBordureSurLaSelection(11);
        jLabelNomEtiquette.setText("Etiquette Blue 35");
        jLabelPrixEtiquette.setText("3 Bois et 1 Or");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(35);
    }//GEN-LAST:event_jPanelEtiquetteBlue35MousePressed

    private void jPanelEtiquetteBlue36MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteBlue36MousePressed
        afficherUneBordureSurLaSelection(12);
        jLabelNomEtiquette.setText("Etiquette Blue 36");
        jLabelPrixEtiquette.setText("3 Pierres et 2 Or");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(36);
    }//GEN-LAST:event_jPanelEtiquetteBlue36MousePressed

    private void jPanelEtiquetteBlue37MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteBlue37MousePressed
        afficherUneBordureSurLaSelection(13);
        jLabelNomEtiquette.setText("Etiquette Blue 37");
        jLabelPrixEtiquette.setText("3 Pierres et 2 Or");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(37);
    }//GEN-LAST:event_jPanelEtiquetteBlue37MousePressed

    private void jPanelEtiquetteBlue38MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteBlue38MousePressed
        afficherUneBordureSurLaSelection(14);
        jLabelNomEtiquette.setText("Etiquette Blue 38");
        jLabelPrixEtiquette.setText("5 Pierres et 3 Or");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(38);
    }//GEN-LAST:event_jPanelEtiquetteBlue38MousePressed

    private void jPanelEtiquetteBlue39MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteBlue39MousePressed
        afficherUneBordureSurLaSelection(15);
        jLabelNomEtiquette.setText("Etiquette Blue 39");
        jLabelPrixEtiquette.setText("3 Nourriture et 1 Or");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(39);
    }//GEN-LAST:event_jPanelEtiquetteBlue39MousePressed

    private void jPanelEtiquetteBlue40MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteBlue40MousePressed
        afficherUneBordureSurLaSelection(16);
        jLabelNomEtiquette.setText("Etiquette Blue 40");
        jLabelPrixEtiquette.setText("4 Pierres et 2 Or");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(40);
    }//GEN-LAST:event_jPanelEtiquetteBlue40MousePressed

    private void jPanelEtiquetteGreen24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteGreen24MousePressed
        afficherUneBordureSurLaSelection(17);
        jLabelNomEtiquette.setText("Etiquette Green 24");
        jLabelPrixEtiquette.setText("1 Denier et 1 Tissu");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(24);
}//GEN-LAST:event_jPanelEtiquetteGreen24MousePressed

    private void jPanelEtiquetteGreen25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteGreen25MousePressed
        afficherUneBordureSurLaSelection(18);
        jLabelNomEtiquette.setText("Etiquette Green 25");
        jLabelPrixEtiquette.setText("1 Denier et 1 Tissu");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(25);
}//GEN-LAST:event_jPanelEtiquetteGreen25MousePressed

    private void jPanelEtiquetteGreen26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteGreen26MousePressed
        afficherUneBordureSurLaSelection(19);
        jLabelNomEtiquette.setText("Etiquette Green 26");
        jLabelPrixEtiquette.setText("1 Denier et 1 Tissu");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(26);
}//GEN-LAST:event_jPanelEtiquetteGreen26MousePressed

    private void jPanelEtiquetteGreen27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteGreen27MousePressed
        afficherUneBordureSurLaSelection(20);
        jLabelNomEtiquette.setText("Etiquette Green 27");
        jLabelPrixEtiquette.setText("1 Denier et 1 Tissu");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(27);
}//GEN-LAST:event_jPanelEtiquetteGreen27MousePressed

    private void jPanelEtiquetteGreen28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteGreen28MousePressed
        afficherUneBordureSurLaSelection(21);
        jLabelNomEtiquette.setText("Etiquette Green 28");
        jLabelPrixEtiquette.setText("1 Denier et 1 Tissu");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(28);
}//GEN-LAST:event_jPanelEtiquetteGreen28MousePressed

    private void jPanelEtiquetteGreen29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteGreen29MousePressed
        afficherUneBordureSurLaSelection(22);
        jLabelNomEtiquette.setText("Etiquette Green 29");
        jLabelPrixEtiquette.setText("1 Denier et 1 Tissu");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(29);
}//GEN-LAST:event_jPanelEtiquetteGreen29MousePressed

    private void jPanelEtiquetteGreen30MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteGreen30MousePressed
        afficherUneBordureSurLaSelection(23);
        jLabelNomEtiquette.setText("Etiquette Green 3O");
        jLabelPrixEtiquette.setText("1 Denier et 1 Tissu");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(30);
}//GEN-LAST:event_jPanelEtiquetteGreen30MousePressed

    private void jPanelEtiquetteGreen31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteGreen31MousePressed
       afficherUneBordureSurLaSelection(24);
       jLabelNomEtiquette.setText("Etiquette Green 31");
        jLabelPrixEtiquette.setText("1 Denier et 1 Tissu");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(31);
}//GEN-LAST:event_jPanelEtiquetteGreen31MousePressed

    private void jPanelEtiquetteGray15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteGray15MousePressed
       afficherUneBordureSurLaSelection(25);
       jLabelNomEtiquette.setText("Etiquette Gray 15");
        jLabelPrixEtiquette.setText("1 Pierre et 1 Nourriture");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(15);
    }//GEN-LAST:event_jPanelEtiquetteGray15MousePressed

    private void jPanelEtiquetteGray16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteGray16MousePressed
       afficherUneBordureSurLaSelection(26);
       jLabelNomEtiquette.setText("Etiquette Gray 16");
        jLabelPrixEtiquette.setText("1 Pierre et 1 Nourriture");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(16);
    }//GEN-LAST:event_jPanelEtiquetteGray16MousePressed

    private void jPanelEtiquetteGray17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteGray17MousePressed
       afficherUneBordureSurLaSelection(27);
       jLabelNomEtiquette.setText("Etiquette Gray 17");
        jLabelPrixEtiquette.setText("1 Pierre et 1 Nourriture");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(17);
    }//GEN-LAST:event_jPanelEtiquetteGray17MousePressed

    private void jPanelEtiquetteGray18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteGray18MousePressed
       afficherUneBordureSurLaSelection(28);
       jLabelNomEtiquette.setText("Etiquette Gray 18");
        jLabelPrixEtiquette.setText("1 Pierre et 1 Nourriture");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(18);
    }//GEN-LAST:event_jPanelEtiquetteGray18MousePressed

    private void jPanelEtiquetteGray19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteGray19MousePressed
       afficherUneBordureSurLaSelection(29);
       jLabelNomEtiquette.setText("Etiquette Gray 19");
        jLabelPrixEtiquette.setText("1 Bois et 1 Pierre");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(19);
    }//GEN-LAST:event_jPanelEtiquetteGray19MousePressed

    private void jPanelEtiquetteGray20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteGray20MousePressed
       afficherUneBordureSurLaSelection(30);
       jLabelNomEtiquette.setText("Etiquette Gray 20");
        jLabelPrixEtiquette.setText("1 Pierre et 1 Tissu");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(20);
    }//GEN-LAST:event_jPanelEtiquetteGray20MousePressed

    private void jPanelEtiquetteGray21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteGray21MousePressed
       afficherUneBordureSurLaSelection(31);
       jLabelNomEtiquette.setText("Etiquette Gray 21");
        jLabelPrixEtiquette.setText("1 Pierre et 1 Nourriture");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(21);
    }//GEN-LAST:event_jPanelEtiquetteGray21MousePressed

    private void jPanelEtiquetteGray22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteGray22MousePressed
       afficherUneBordureSurLaSelection(32);
       jLabelNomEtiquette.setText("Etiquette Gray 22");
        jLabelPrixEtiquette.setText("1 Pierre et 1 Nourriture");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(22);
    }//GEN-LAST:event_jPanelEtiquetteGray22MousePressed

    private void jPanelEtiquetteGray23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteGray23MousePressed
       afficherUneBordureSurLaSelection(33);
       jLabelNomEtiquette.setText("Etiquette Gray 23");
        jLabelPrixEtiquette.setText("1 Bois et 1 Pierre");
        _papa._etiquette = _papa._leCroupier._etiquettes.get(23);
    }//GEN-LAST:event_jPanelEtiquetteGray23MousePressed

    private void jPanelEtiquetteBrown7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEtiquetteBrown7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelEtiquetteBrown7MouseClicked

    private void jLabelChoixEtiquetteOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelChoixEtiquetteOKMouseClicked
        if(_papa._etiquette != null) {
            this.dispose();
        }
    }//GEN-LAST:event_jLabelChoixEtiquetteOKMouseClicked

    private void jLabelChoixEtiquetteCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelChoixEtiquetteCancelMouseClicked
         this.dispose();
    }//GEN-LAST:event_jLabelChoixEtiquetteCancelMouseClicked


    public void initArraylist(){
            jPanelSelectionnables = new ArrayList<JPanel>();
            jPanelSelectionnables.add(jPanelEtiquetteBrown7);
            jPanelSelectionnables.add(jPanelEtiquetteBrown8);
            jPanelSelectionnables.add(jPanelEtiquetteBrown9);
            jPanelSelectionnables.add(jPanelEtiquetteBrown10);
            jPanelSelectionnables.add(jPanelEtiquetteBrownn11);
            jPanelSelectionnables.add(jPanelEtiquetteBrownn12);
            jPanelSelectionnables.add(jPanelEtiquetteBrown13);
            jPanelSelectionnables.add(jPanelEtiquetteBrown14);
            jPanelSelectionnables.add(jPanelEtiquetteBlue32);
            jPanelSelectionnables.add(jPanelEtiquetteBlue33);
            jPanelSelectionnables.add(jPanelEtiquetteBlue34);
            jPanelSelectionnables.add(jPanelEtiquetteBlue35);
            jPanelSelectionnables.add(jPanelEtiquetteBlue36);
            jPanelSelectionnables.add(jPanelEtiquetteBlue37);
            jPanelSelectionnables.add(jPanelEtiquetteBlue38);
            jPanelSelectionnables.add(jPanelEtiquetteBlue39);
            jPanelSelectionnables.add(jPanelEtiquetteBlue40);
            jPanelSelectionnables.add(jPanelEtiquetteGreen24);
            jPanelSelectionnables.add(jPanelEtiquetteGreen25);
            jPanelSelectionnables.add(jPanelEtiquetteGreen26);
            jPanelSelectionnables.add(jPanelEtiquetteGreen27);
            jPanelSelectionnables.add(jPanelEtiquetteGreen28);
            jPanelSelectionnables.add(jPanelEtiquetteGreen29);
            jPanelSelectionnables.add(jPanelEtiquetteGreen30);
            jPanelSelectionnables.add(jPanelEtiquetteGreen31);
            jPanelSelectionnables.add(jPanelEtiquetteGray15);
            jPanelSelectionnables.add(jPanelEtiquetteGray16);
            jPanelSelectionnables.add(jPanelEtiquetteGray17);
            jPanelSelectionnables.add(jPanelEtiquetteGray18);
            jPanelSelectionnables.add(jPanelEtiquetteGray19);
            jPanelSelectionnables.add(jPanelEtiquetteGray20);
            jPanelSelectionnables.add(jPanelEtiquetteGray21);
            jPanelSelectionnables.add(jPanelEtiquetteGray22);
            jPanelSelectionnables.add(jPanelEtiquetteGray23);
    }

     public void afficherUneBordureSurLaSelection(int pSelection) {
        for (JPanel jP : jPanelSelectionnables)
        {
            jP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        }
        jPanelSelectionnables.get(pSelection).setBorder(blackline);
        control(pSelection);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelChoixEtiquetteCancel;
    private javax.swing.JLabel jLabelChoixEtiquetteOK;
    private javax.swing.JLabel jLabelDroitOK;
    private javax.swing.JLabel jLabelNomEtiquette;
    private javax.swing.JLabel jLabelNomJoueur;
    private javax.swing.JLabel jLabelPasLeDroit2;
    private javax.swing.JLabel jLabelPrixDeux;
    private javax.swing.JLabel jLabelPrixEtiquette;
    private javax.swing.JLabel jLabelPrixUn;
    private javax.swing.JLabel jLabelpasLeDroit1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelEtiquetteBlue32;
    private javax.swing.JPanel jPanelEtiquetteBlue33;
    private javax.swing.JPanel jPanelEtiquetteBlue34;
    private javax.swing.JPanel jPanelEtiquetteBlue35;
    private javax.swing.JPanel jPanelEtiquetteBlue36;
    private javax.swing.JPanel jPanelEtiquetteBlue37;
    private javax.swing.JPanel jPanelEtiquetteBlue38;
    private javax.swing.JPanel jPanelEtiquetteBlue39;
    private javax.swing.JPanel jPanelEtiquetteBlue40;
    private javax.swing.JPanel jPanelEtiquetteBrown10;
    private javax.swing.JPanel jPanelEtiquetteBrown13;
    private javax.swing.JPanel jPanelEtiquetteBrown14;
    private javax.swing.JPanel jPanelEtiquetteBrown7;
    private javax.swing.JPanel jPanelEtiquetteBrown8;
    private javax.swing.JPanel jPanelEtiquetteBrown9;
    private javax.swing.JPanel jPanelEtiquetteBrownn11;
    private javax.swing.JPanel jPanelEtiquetteBrownn12;
    private javax.swing.JPanel jPanelEtiquetteGray15;
    private javax.swing.JPanel jPanelEtiquetteGray16;
    private javax.swing.JPanel jPanelEtiquetteGray17;
    private javax.swing.JPanel jPanelEtiquetteGray18;
    private javax.swing.JPanel jPanelEtiquetteGray19;
    private javax.swing.JPanel jPanelEtiquetteGray20;
    private javax.swing.JPanel jPanelEtiquetteGray21;
    private javax.swing.JPanel jPanelEtiquetteGray22;
    private javax.swing.JPanel jPanelEtiquetteGray23;
    private javax.swing.JPanel jPanelEtiquetteGreen24;
    private javax.swing.JPanel jPanelEtiquetteGreen25;
    private javax.swing.JPanel jPanelEtiquetteGreen26;
    private javax.swing.JPanel jPanelEtiquetteGreen27;
    private javax.swing.JPanel jPanelEtiquetteGreen28;
    private javax.swing.JPanel jPanelEtiquetteGreen29;
    private javax.swing.JPanel jPanelEtiquetteGreen30;
    private javax.swing.JPanel jPanelEtiquetteGreen31;
    private javax.swing.JPanel jPanelEtiquettesBleues;
    private javax.swing.JPanel jPanelEtiquettesOranges;
    private javax.swing.JPanel jPanelEtiquettesVertes;
    private javax.swing.JPanel jPanelInfoEtiquette;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables

    public void control(int pSelection){
        switch(pSelection){
            case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7:
                if(_joueur.aLePermisDeConstruireBatimentMarron())
                    labelOK();
                else
                    labelPasOK();
                break;
            case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15: case 16:
                if(_joueur.aLePermisDeConstruireBatimentBleu())
                    labelOK();
                else
                    labelPasOK();
                break;
            case 17: case 18: case 19: case 20: case 21: case 22: case 23: case 24:
                if(_joueur.aLePermisDeConstruireBatimentGris())
                    labelOK();
                else
                    labelPasOK();
                break;
            case 25: case 26: case 27: case 28: case 29: case 30: case 31: case 32: case 33:
                if(_joueur.aLePermisDeConstruireBatimentVert())
                    labelOK();
                else
                    labelPasOK();
                break;
        }
    }

    public void labelOK(){
        jLabelDroitOK.setVisible(true);
        jLabelpasLeDroit1.setVisible(false);
        jLabelPasLeDroit2.setVisible(false);
    }

    public void labelPasOK(){
        jLabelDroitOK.setVisible(false);
        jLabelpasLeDroit1.setVisible(true);
        jLabelPasLeDroit2.setVisible(true);
    }
}
