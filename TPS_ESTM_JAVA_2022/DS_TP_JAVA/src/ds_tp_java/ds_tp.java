/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_tp_java;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JColorChooser;


public class ds_tp extends javax.swing.JFrame {

   
    public ds_tp() {
        initComponents();
        this.setTitle("Nom & Prenom ");
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btni = new javax.swing.JButton();
        spinner = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtar = new javax.swing.JTextArea();
        btncouleur = new javax.swing.JButton();
        cmb = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btni.setText("initialiser");
        btni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniActionPerformed(evt);
            }
        });

        spinner.setModel(new javax.swing.SpinnerNumberModel(30, 1, 100, 1));

        txtar.setColumns(20);
        txtar.setRows(5);
        jScrollPane1.setViewportView(txtar);

        btncouleur.setText("Couleur");
        btncouleur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncouleurActionPerformed(evt);
            }
        });

        cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Algerian", "arial", "forte", "calibri", "segoe ui light", "arial black", "arial narrow", "bodoni mt", "book antiqua", " " }));
        cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbActionPerformed(evt);
            }
        });

        jMenu1.setText("Serialisation");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("serialiser");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Deserialiser");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Quitter");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(btni)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(btncouleur)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncouleur, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(324, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btncouleurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncouleurActionPerformed
       JColorChooser choix =new JColorChooser();
       Color couleur = choix.showDialog(null, "choisir une couleur :", Color.BLACK);
       txtar.setForeground(couleur);
    }//GEN-LAST:event_btncouleurActionPerformed

    private void btniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniActionPerformed
        txtar.setText("");
        txtar.setForeground(Color.BLACK);
        txtar.setFont(new Font(cmb.getItemAt(0),Font.PLAIN ,30));
    }//GEN-LAST:event_btniActionPerformed

    private void cmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbActionPerformed
       txtar.setFont(new Font(cmb.getSelectedItem().toString(),Font.PLAIN, (int) spinner.getValue()));
    }//GEN-LAST:event_cmbActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        TextSerialisable txt= new TextSerialisable("hello my name is zakaria",(int)spinner.getValue(),cmb.getSelectedItem().toString(), Color.blue);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ds_tp().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncouleur;
    private javax.swing.JButton btni;
    private javax.swing.JComboBox<String> cmb;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spinner;
    private javax.swing.JTextArea txtar;
    // End of variables declaration//GEN-END:variables
}
