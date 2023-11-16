/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editeurtext;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author admin
 */
public class EditeurTexte extends javax.swing.JFrame {

    /**
     * Creates new form EditeurTexte
     */
    public EditeurTexte() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        spinnert = new javax.swing.JSpinner();
        cmbpolices = new javax.swing.JComboBox<>();
        btncouleur = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtr = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuo = new javax.swing.JMenuItem();
        menus = new javax.swing.JMenuItem();
        menuq = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("   Taille");

        spinnert.setModel(new javax.swing.SpinnerNumberModel(20, 0, 40, 2));

        cmbpolices.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Felix Titling", "Footlight MT Light", "Forte", "Franklin Gothic Book", " " }));
        cmbpolices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbpolicesActionPerformed(evt);
            }
        });

        btncouleur.setText("Couleur");
        btncouleur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncouleurActionPerformed(evt);
            }
        });

        txtr.setColumns(20);
        txtr.setRows(5);
        jScrollPane1.setViewportView(txtr);

        jMenu1.setText("File");

        menuo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuo.setText("Ouvrire");
        menuo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuoActionPerformed(evt);
            }
        });
        jMenu1.add(menuo);

        menus.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menus.setText("Sauvegarder");
        menus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menusActionPerformed(evt);
            }
        });
        jMenu1.add(menus);

        menuq.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        menuq.setText("Quitter");
        menuq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuqActionPerformed(evt);
            }
        });
        jMenu1.add(menuq);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinnert, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbpolices, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncouleur, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbpolices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncouleur))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


     

    private void menuoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuoActionPerformed
     JFileChooser choix = new JFileChooser();
     choix.setCurrentDirectory(new File("."));
     FileNameExtensionFilter filter =new FileNameExtensionFilter("Fichier Texte", "txt");
     choix.setFileFilter(filter);
     int rep= choix.showOpenDialog(null);
     if (rep==JFileChooser.APPROVE_OPTION){
         try {
             File fichier = new File(choix.getSelectedFile().getAbsolutePath());
             txtr.setText("");
             Scanner sc = new Scanner(fichier);
             while (sc.hasNext()) {
                 String line = sc.nextLine();
                 txtr.append(line+"\n");
             }
             sc.close();
         } catch (FileNotFoundException fileNotFoundException) {
         }
     }
        
    }//GEN-LAST:event_menuoActionPerformed

    private void menusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusActionPerformed
       JFileChooser choix = new JFileChooser();
       choix.setCurrentDirectory(new File("."));
       int rep =choix.showSaveDialog(null);
       if(rep==JFileChooser.APPROVE_OPTION){
           FileWriter fw = null;
           try {
               File fichier = new File(choix.getSelectedFile().getAbsolutePath());
               fw = new FileWriter(fichier);
               fw.write(txtr.getText());
               fw.close();
              JOptionPane.showMessageDialog(null,"le contenu enregestrer dans "+fichier.getAbsolutePath(),"Sauvegarder",JOptionPane.INFORMATION_MESSAGE);
           } 
           catch (IOException iOException) {
           
       }
           
    }//GEN-LAST:event_menusActionPerformed
    }
    private void menuqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuqActionPerformed
     System.exit(0);
    }//GEN-LAST:event_menuqActionPerformed
 

    private void btncouleurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncouleurActionPerformed
    JColorChooser choix =new JColorChooser();
    Color couleur =choix.showDialog(null,"choisir une couleur :", Color.BLACK);
    txtr.setForeground(couleur);	
    }//GEN-LAST:event_btncouleurActionPerformed
    private void cmbpolicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbpolicesActionPerformed
       txtr.setFont(new Font(cmbpolices.getSelectedItem().toString(),Font.BOLD,(int)spinnert.getValue()));
    }//GEN-LAST:event_cmbpolicesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditeurTexte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditeurTexte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditeurTexte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditeurTexte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditeurTexte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncouleur;
    private javax.swing.JComboBox<String> cmbpolices;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuo;
    private javax.swing.JMenuItem menuq;
    private javax.swing.JMenuItem menus;
    private javax.swing.JSpinner spinnert;
    private javax.swing.JTextArea txtr;
    // End of variables declaration//GEN-END:variables
}
