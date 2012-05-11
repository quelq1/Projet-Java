/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

/**
 *
 * @author Carlito De La Vega
 */
import Modele.Save;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Mouna
 */
public class SauvegardePartie extends javax.swing.JFrame {
     private Fenetre fenetre;

    /** Creates new form SauvegarderPartie */
    public SauvegardePartie(Fenetre fenetre) {
        this.fenetre = fenetre;
        initComponents();
        centrerFenetre();
        repaint();
    }

      private void centrerFenetre()
    {
        // on place notre fenêtre au milieu
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screen.width - getSize().width)/2,(screen.height - getSize().height)/2);
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonOK = new javax.swing.JButton();
        jButtonCANCEL = new javax.swing.JButton();

        setTitle("Sauvegarder");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Sauvegarder la partie et quitter?");

        jButtonOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/caylus_button_ok - 2.png"))); // NOI18N
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jButtonCANCEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/caylus_button_cancel - 2.png"))); // NOI18N
        jButtonCANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCANCELActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jButtonOK)
                .addGap(31, 31, 31)
                .addComponent(jButtonCANCEL)
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonOK)
                    .addComponent(jButtonCANCEL))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>                        

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {                                          
        //sauvegarder la partie
        fenetre.setVisible(false);
        fenetre.dispose();
        this.setVisible(true);
        new Save(fenetre, "D:/Dropbox/Java_M1/save.caylus");
        this.setVisible(false);
        dispose();
}                                         

    private void jButtonCANCELActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.setVisible(false);
        dispose();
}                                             

    /**
    * @param args the command line arguments
    */
   
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonCANCEL;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   

}