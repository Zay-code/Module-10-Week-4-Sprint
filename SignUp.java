/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author Our
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edtConfirm = new javax.swing.JPasswordField();
        edtPassword = new javax.swing.JPasswordField();
        edtUsername = new javax.swing.JTextField();
        btnSignUp = new javax.swing.JButton();
        edtHome = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setName("frmSignUp"); // NOI18N

        jPanel1.setForeground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 36)); // NOI18N
        jLabel1.setText("Sign Up");

        jLabel2.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel2.setText("Enter a username:");

        jLabel3.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel3.setText("Enter a Password:");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel4.setText("Confirm Password:");

        edtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPasswordActionPerformed(evt);
            }
        });

        btnSignUp.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnSignUp.setText("Sign Up");
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        edtHome.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        edtHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolsystem/back.PNG"))); // NOI18N
        edtHome.setText("Home");
        edtHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edtHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtHomeActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolsystem/logo.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(edtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(edtPassword)
                            .addComponent(edtConfirm)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(edtHome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnSignUp))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel5)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnSignUp)
                .addGap(20, 20, 20)
                .addComponent(edtHome)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPasswordActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        boolean u = false, p = false, c = false;
        if (edtUsername.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter a Username");
        } else {
            u = true;
        }
        if (edtPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter a Password");
        } else {
            p = true;
        }
        if (edtConfirm.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Confirm Password");
        } else {
            c = true;
        }
        if ((u = true) && (p = true) && (c = true)) {
            try {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

                String path = "SchoolDatabase.mdb";

                String ur = "jdbc:ucanaccess://" + path;

                Connection con = DriverManager.getConnection(ur);

                Statement st = con.createStatement();

                String q = "SELECT Username FROM Users WHERE Username = '" + edtUsername.getText() + "'";
                ResultSet rs = st.executeQuery(q);
                while (rs.next()) {
                    if (rs.getString("Username").equals(edtUsername.getText())) {
                        JOptionPane.showMessageDialog(null, "The Username is Taken enter another ");
                    } else {
                        if (edtPassword.getText().equals(edtConfirm.getText())) {
                            Statement s = con.createStatement();

                            String w = "INSERT INTO Users VALUES ('" + edtUsername.getText() + "', '" + edtPassword.getPassword() + "') ";
                            ResultSet r = s.executeQuery(w);
                            JOptionPane.showMessageDialog(null, "You Have been Signed Up");
                            SignIn frmSignIn = new SignIn();
                            frmSignIn.setVisible(true);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Passwords do not match ");
                        }
                    }
                }

                con.close();

            } catch (Exception e) {
                System.out.println(e);
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void edtHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtHomeActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JPasswordField edtConfirm;
    private javax.swing.JButton edtHome;
    private javax.swing.JPasswordField edtPassword;
    private javax.swing.JTextField edtUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
