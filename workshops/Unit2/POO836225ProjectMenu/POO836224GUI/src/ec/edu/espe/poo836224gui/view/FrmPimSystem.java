/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.poo836224gui.view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class FrmPimSystem extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public FrmPimSystem() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuPimSystem = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuInventory = new javax.swing.JMenu();
        mnuPairOfShoes = new javax.swing.JMenu();
        itmAddPairOfShoes = new javax.swing.JMenuItem();
        itmModifyPairOfShoes = new javax.swing.JMenuItem();
        itmRemovePairOfShoes = new javax.swing.JMenuItem();
        mnuBill = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        itmModifyBill = new javax.swing.JMenuItem();
        itmRemoveBill = new javax.swing.JMenuItem();
        mnuSupplier = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuPimSystem.setText("PIM");

        jMenuItem1.setText("Quit");
        mnuPimSystem.add(jMenuItem1);

        jMenuBar1.add(mnuPimSystem);

        mnuInventory.setText("Inventory");

        mnuPairOfShoes.setText("Pair of Shoes");
        mnuPairOfShoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPairOfShoesActionPerformed(evt);
            }
        });

        itmAddPairOfShoes.setText("Add Pair of Shoes");
        itmAddPairOfShoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAddPairOfShoesActionPerformed(evt);
            }
        });
        mnuPairOfShoes.add(itmAddPairOfShoes);

        itmModifyPairOfShoes.setText("Modify Pair of Shoes");
        mnuPairOfShoes.add(itmModifyPairOfShoes);

        itmRemovePairOfShoes.setText("Remove Pair of Shoes");
        mnuPairOfShoes.add(itmRemovePairOfShoes);

        mnuInventory.add(mnuPairOfShoes);

        jMenuBar1.add(mnuInventory);

        mnuBill.setText("Bill");

        jMenuItem2.setText("Add ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuBill.add(jMenuItem2);

        itmModifyBill.setText("Modify");
        mnuBill.add(itmModifyBill);

        itmRemoveBill.setText("Remove");
        itmRemoveBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRemoveBillActionPerformed(evt);
            }
        });
        mnuBill.add(itmRemoveBill);

        jMenuBar1.add(mnuBill);

        mnuSupplier.setText("Supplier");
        mnuSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSupplierMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuSupplier);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmRemoveBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRemoveBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmRemoveBillActionPerformed

    private void mnuPairOfShoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPairOfShoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuPairOfShoesActionPerformed

    private void itmAddPairOfShoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAddPairOfShoesActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new FrmInventory().setVisible(true);
    }//GEN-LAST:event_itmAddPairOfShoesActionPerformed

    private void mnuSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSupplierMouseClicked
        try {
            // TODO add your handling code here:
            this.setVisible(false);
            new FrmSupplierLogin().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(FrmPimSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuSupplierMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new FrmBill().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPimSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPimSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPimSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPimSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPimSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAddPairOfShoes;
    private javax.swing.JMenuItem itmModifyBill;
    private javax.swing.JMenuItem itmModifyPairOfShoes;
    private javax.swing.JMenuItem itmRemoveBill;
    private javax.swing.JMenuItem itmRemovePairOfShoes;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu mnuBill;
    private javax.swing.JMenu mnuInventory;
    private javax.swing.JMenu mnuPairOfShoes;
    private javax.swing.JMenu mnuPimSystem;
    private javax.swing.JMenu mnuSupplier;
    // End of variables declaration//GEN-END:variables
}
