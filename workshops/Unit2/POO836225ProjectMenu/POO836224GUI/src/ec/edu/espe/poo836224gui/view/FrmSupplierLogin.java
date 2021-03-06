/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.poo836224gui.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.poo836224gui.model.ShoeSize;
import ec.edu.espe.poo836224gui.model.Supplier;
import ec.edu.espe.poo836224gui.model.TypeOfShoes;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class FrmSupplierLogin extends javax.swing.JFrame {

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    /**
     * Creates new form FrmSupplierLogin
     */
    public FrmSupplierLogin() throws IOException {
        initComponents();
        
        /*ShoeSize t1 = new ShoeSize("KIND");
        ShoeSize t2 = new ShoeSize("CHILDREN");
        FileWriter fw = new FileWriter("ShoeSize.json");
        gson.toJson(t1, fw);
        gson.toJson(t2, fw);
        fw.flush();
        fw.close();*/

        /*List<TypeOfShoes> listTypeOfShoes = new ArrayList<>();
        try (Reader fr = new FileReader("TypeOfShoes.json")) {
            TypeOfShoes typeOfShoes = gson.fromJson(fr, TypeOfShoes.class);
            listTypeOfShoes.add(typeOfShoes);
        } catch (IOException e) {

        }

        for (TypeOfShoes e : listTypeOfShoes) {
            cmbTypeOfShoe.addItem(e.getDescription());
        }*/

        /* file = new File("ShoeSize.json");
        if (!file.exists()) {
            file.createNewFile();
        }
        br = new BufferedReader(new FileReader(file));
        String currentLine1 = null;
        String shoeSizeJson = null;

        while ((currentLine1 = br.readLine()) != null) {

            shoeSizeJson = currentLine1 + shoeSizeJson;
        }
        java.lang.reflect.Type shoeSizeType = new TypeToken<ArrayList<ShoeSize>>() {
        }.getType();

        List<ShoeSize> arrayShoeSizeJson = new ArrayList<>();

        arrayShoeSizeJson = gson.fromJson(shoeSizeJson, shoeSizeType);

        DefaultListModel defaultListModel = new DefaultListModel();

        for (int i = 0; i < arrayShoeSizeJson.size(); i++) {
            defaultListModel.addElement(arrayShoeSizeJson.get(i));
        }

        lstShoeSize.setModel(defaultListModel);

        br.close();*/
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/ec/edu/espe/poo836224gui/image/logo.png"));
        Icon icon = new ImageIcon(imageIcon.getImage().getScaledInstance(lblImage.getWidth(),
                lblImage.getHeight(), Image.SCALE_DEFAULT));
        lblImage.setIcon(icon);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSupplierInput = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCompanyName = new javax.swing.JTextField();
        txtNumberLot = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tarDescriptionOfAnIncidentOnTheWay = new javax.swing.JTextArea();
        cmbTypeOfShoe = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstShoeSize = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        pnlActionButtons = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SUPPLIER LOGIN");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Company Name");

        jLabel3.setText("Lot Number");

        txtCompanyName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCompanyNameKeyTyped(evt);
            }
        });

        txtNumberLot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberLotActionPerformed(evt);
            }
        });

        jLabel4.setText("Description of an incident on the way");

        tarDescriptionOfAnIncidentOnTheWay.setColumns(20);
        tarDescriptionOfAnIncidentOnTheWay.setRows(5);
        tarDescriptionOfAnIncidentOnTheWay.setToolTipText("Enter first Company Name and second Lot Number");
        tarDescriptionOfAnIncidentOnTheWay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tarDescriptionOfAnIncidentOnTheWayKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tarDescriptionOfAnIncidentOnTheWay);

        jLabel5.setText("Type of Shoe");

        jScrollPane2.setViewportView(lstShoeSize);

        jLabel6.setText("Shoe Size: ");

        btnSave.setBackground(new java.awt.Color(153, 153, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 153, 255));
        btnDelete.setText("Clean");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnShow.setBackground(new java.awt.Color(153, 153, 255));
        btnShow.setText("Show");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(153, 153, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlActionButtonsLayout = new javax.swing.GroupLayout(pnlActionButtons);
        pnlActionButtons.setLayout(pnlActionButtonsLayout);
        pnlActionButtonsLayout.setHorizontalGroup(
            pnlActionButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActionButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSave)
                .addGap(53, 53, 53)
                .addComponent(btnDelete)
                .addGap(45, 45, 45)
                .addComponent(btnShow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addContainerGap())
        );
        pnlActionButtonsLayout.setVerticalGroup(
            pnlActionButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlActionButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlActionButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnDelete)
                    .addComponent(btnShow)
                    .addComponent(btnExit))
                .addGap(33, 33, 33))
        );

        lblImage.setMaximumSize(new java.awt.Dimension(1552, 697));

        javax.swing.GroupLayout pnlSupplierInputLayout = new javax.swing.GroupLayout(pnlSupplierInput);
        pnlSupplierInput.setLayout(pnlSupplierInputLayout);
        pnlSupplierInputLayout.setHorizontalGroup(
            pnlSupplierInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSupplierInputLayout.createSequentialGroup()
                .addGroup(pnlSupplierInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSupplierInputLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlSupplierInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSupplierInputLayout.createSequentialGroup()
                                .addGroup(pnlSupplierInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(28, 28, 28)
                                .addGroup(pnlSupplierInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCompanyName)
                                    .addComponent(txtNumberLot, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)))
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlSupplierInputLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(61, 61, 61)
                                .addComponent(cmbTypeOfShoe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlSupplierInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSupplierInputLayout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addGroup(pnlSupplierInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlSupplierInputLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlSupplierInputLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(pnlActionButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnlSupplierInputLayout.setVerticalGroup(
            pnlSupplierInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSupplierInputLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlSupplierInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(pnlSupplierInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSupplierInputLayout.createSequentialGroup()
                        .addGroup(pnlSupplierInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumberLot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(pnlSupplierInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbTypeOfShoe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlSupplierInputLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(pnlActionButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jLabel1.setText("SUPPLIER LOGIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnlSupplierInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(333, 333, 333))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(pnlSupplierInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumberLotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberLotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberLotActionPerformed

    private void txtCompanyNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCompanyNameKeyTyped
        // TODO add your handling code here:
        char validating = evt.getKeyChar();
        if (Character.isDigit(validating)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Enter only letters please...");
        }
    }//GEN-LAST:event_txtCompanyNameKeyTyped

    private void tarDescriptionOfAnIncidentOnTheWayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tarDescriptionOfAnIncidentOnTheWayKeyTyped
        // TODO add your handling code here:
        char validating = evt.getKeyChar();
        if (Character.isDigit(validating)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Enter only letters please...");
        }
    }//GEN-LAST:event_tarDescriptionOfAnIncidentOnTheWayKeyTyped

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
        FrmShowingSupplier frmShowingSupplier = new FrmShowingSupplier();
        frmShowingSupplier.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        //System.exit(0);
        this.setVisible(false);
        new FrmPimSystem().setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        txtCompanyName.setText("");
        txtNumberLot.setText("");
        tarDescriptionOfAnIncidentOnTheWay.setText("");
        lstShoeSize.setSelectedIndex(NORMAL);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            // TODO add your handling code here:
            String addingSupplier[] = new String[5];
            addingSupplier[0] = txtCompanyName.getText();
            addingSupplier[1] = txtNumberLot.getText();
            addingSupplier[2] = tarDescriptionOfAnIncidentOnTheWay.getText();
            addingSupplier[3] = (String) cmbTypeOfShoe.getSelectedItem();
            addingSupplier[4] = lstShoeSize.getSelectedValue().toUpperCase();
            Supplier supplier = new Supplier(addingSupplier[0], addingSupplier[1], addingSupplier[2],
                    (addingSupplier[3]), addingSupplier[4]);

            String supplierJason = gson.toJson(supplier);
            File file = new File("Suppliers.json");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.append(supplierJason);
            bw.append("\n");
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(FrmSupplierLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSupplierLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSupplierLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSupplierLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSupplierLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmSupplierLogin().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(FrmSupplierLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnShow;
    private javax.swing.JComboBox<String> cmbTypeOfShoe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImage;
    private javax.swing.JList<String> lstShoeSize;
    private javax.swing.JPanel pnlActionButtons;
    private javax.swing.JPanel pnlSupplierInput;
    private javax.swing.JTextArea tarDescriptionOfAnIncidentOnTheWay;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JTextField txtNumberLot;
    // End of variables declaration//GEN-END:variables
}
