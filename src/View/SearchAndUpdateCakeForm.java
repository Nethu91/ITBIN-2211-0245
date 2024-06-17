/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author @Sewwandi <your.name at your.org>
 */
public class SearchAndUpdateCakeForm extends javax.swing.JFrame {

    /**
     * Creates new form AddCakesForm
     */
    public SearchAndUpdateCakeForm() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cNameTF = new javax.swing.JTextField();
        cCodeTF = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        updteBtn = new javax.swing.JButton();
        weightCmb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        destTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        priceTF = new javax.swing.JTextField();
        exitBtn = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("Search & Update");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 23, -1, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel2.setText("Cake Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel3.setText("Cake Code:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel4.setText("Cake Weight:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 155, -1, -1));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        cNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNameTFActionPerformed(evt);
            }
        });
        jPanel1.add(cNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 188, -1));
        jPanel1.add(cCodeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 188, -1));

        searchBtn.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 60, -1));

        updteBtn.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        updteBtn.setText("Update");
        updteBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 60, -1));

        weightCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "500g", "1kg", "1.5kg", "2kg" }));
        weightCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightCmbActionPerformed(evt);
            }
        });
        jPanel1.add(weightCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 188, -1));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel6.setText("Price:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 248, -1, 20));
        jPanel1.add(destTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 188, -1));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel7.setText("Cake Description:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 205, -1, -1));

        priceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTFActionPerformed(evt);
            }
        });
        jPanel1.add(priceTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 180, -1));

        exitBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void weightCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightCmbActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        try{
           Statement s =DBConnection.getStatementConnection();
           ResultSet rs =s.executeQuery("SELECT * FROM cakes WHERE cakecode = '"+cCodeTF.getText()+"'");
           if(rs.next()){
               cNameTF.setText(rs.getString("cakename"));
               destTF.setText(rs.getString("description"));
               priceTF.setText(rs.getString("price"));
               weightCmb.setSelectedItem("weight");
   
           }
       }catch(SQLException e){
           System.out.println(e);
           JOptionPane.showMessageDialog(this, "Invalid Cake Code: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       }

    }//GEN-LAST:event_searchBtnActionPerformed

    private void cNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNameTFActionPerformed

    private void priceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTFActionPerformed

    private void updteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updteBtnActionPerformed
        // TODO add your handling code here:
        String cakeName = cNameTF.getText();
        String price = priceTF.getText();
        String discription = destTF.getText();
       String weight = (String)weightCmb.getSelectedItem();
        
        try{
            Statement s= DBConnection.getStatementConnection();
            s.executeUpdate("UPDATE cakes SET cakename= '"+cakeName+"',description= '"+discription+"',price= '"
                    +price+"',weight= '"+weight+"'");
            JOptionPane.showMessageDialog(this, "Account updated successfully!");
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Error aupdating account: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updteBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SearchAndUpdateCakeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchAndUpdateCakeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchAndUpdateCakeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchAndUpdateCakeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SearchAndUpdateCakeForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cCodeTF;
    private javax.swing.JTextField cNameTF;
    private javax.swing.JTextField destTF;
    private javax.swing.JButton exitBtn;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField priceTF;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updteBtn;
    private javax.swing.JComboBox<String> weightCmb;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        cNameTF.setText("");
        cCodeTF.setText("");
        destTF.setText("");
        priceTF.setText("");
        weightCmb.setEditable(false);
    }
}
