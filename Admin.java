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
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Our
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnDeleteLearner = new javax.swing.JButton();
        btnSearchLearner = new javax.swing.JButton();
        btnDeleteParent = new javax.swing.JButton();
        btnSearchParent = new javax.swing.JButton();
        btnDeleteTeacher = new javax.swing.JButton();
        btnSearchTeacher = new javax.swing.JButton();
        btnAddTeacher = new javax.swing.JButton();
        cmbAge = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frmAdmin"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblLabel.setFont(new java.awt.Font("Sitka Text", 1, 34)); // NOI18N
        lblLabel.setText("Admin Access");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel1.setText("Learner Records");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel2.setText("Parent Records");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel3.setText("Teacher Records");

        btnDeleteLearner.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnDeleteLearner.setText("Delete Learner");
        btnDeleteLearner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteLearner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteLearnerActionPerformed(evt);
            }
        });

        btnSearchLearner.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnSearchLearner.setText("Search Learner");
        btnSearchLearner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchLearner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchLearnerActionPerformed(evt);
            }
        });

        btnDeleteParent.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnDeleteParent.setText("Delete Parent");
        btnDeleteParent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteParentActionPerformed(evt);
            }
        });

        btnSearchParent.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnSearchParent.setText("Search Parent");
        btnSearchParent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchParentActionPerformed(evt);
            }
        });

        btnDeleteTeacher.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnDeleteTeacher.setText("Delete Teacher");
        btnDeleteTeacher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTeacherActionPerformed(evt);
            }
        });

        btnSearchTeacher.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnSearchTeacher.setText("Search Teacher");
        btnSearchTeacher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTeacherActionPerformed(evt);
            }
        });

        btnAddTeacher.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnAddTeacher.setText("Add Teacher");
        btnAddTeacher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTeacherActionPerformed(evt);
            }
        });

        cmbAge.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        cmbAge.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "6 - 9 ", "10 - 14 ", "15 - 17 " }));
        cmbAge.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAgeActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolsystem/logo.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDeleteParent, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearchParent, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(207, 207, 207))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDeleteTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearchTeacher)
                                .addGap(27, 27, 27)
                                .addComponent(btnAddTeacher)
                                .addGap(58, 58, 58))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(104, 104, 104)
                                        .addComponent(lblLabel)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteLearner)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchLearner)
                        .addGap(30, 30, 30)
                        .addComponent(cmbAge, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLabel)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(17, 17, 17)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnDeleteLearner)
                    .addComponent(btnSearchLearner)
                    .addComponent(cmbAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearchParent)
                            .addComponent(btnDeleteParent))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnDeleteTeacher)
                    .addComponent(btnSearchTeacher)
                    .addComponent(btnAddTeacher))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnReturn.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolsystem/back.PNG"))); // NOI18N
        btnReturn.setText("Home");
        btnReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReturn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnReturn)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteLearnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteLearnerActionPerformed
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            String path = "SchoolDatabase.mdb";

            String ur = "jdbc:ucanaccess://" + path;

            Connection con = DriverManager.getConnection(ur);

            Statement st = con.createStatement();
            String Deleted = JOptionPane.showInputDialog("Enter Contact number of record to be deleted :");
            String q = "SELECT * FROM tblLearner,tblAccepted WHERE ParentContact ='" + Deleted + "'";
            ResultSet rs = st.executeQuery(q);
            String answer = JOptionPane.showInputDialog("Are you sure you want to Delete this record YES/NO");
            if (answer.equalsIgnoreCase("Yes")) {
                q = "DELETE FROM tblLearner,tblAccepted WHERE ParentContact='" + Deleted + "'";
                st.executeUpdate(q);
                System.out.println("Record Deleted...");
            } else {
                System.out.println("Record Not Found...");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteLearnerActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Connection2DB c = new Connection2DB();
        c.ShowLeaner(jTable1);
        c.ShowParent(jTable4);
        c.ShowTeacher(jTable3);// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void btnDeleteParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteParentActionPerformed
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            String path = "SchoolDatabase.mdb";

            String ur = "jdbc:ucanaccess://" + path;

            Connection con = DriverManager.getConnection(ur);

            Statement st = con.createStatement();
            String Deleted = JOptionPane.showInputDialog("Enter Contact number of record to be deleted :");
            String q = "SELECT * FROM tblParent WHERE ParentContact ='" + Deleted + "'";
            ResultSet rs = st.executeQuery(q);
            String answer = JOptionPane.showInputDialog("Are you sure you want to Delete this record YES/NO");
            if (answer.equalsIgnoreCase("Yes")) {
                q = "DELETE FROM tblParent WHERE ParentContact='" + Deleted + "'";
                st.executeUpdate(q);
                System.out.println("Record Deleted...");
            } else {
                System.out.println("Record Not Found...");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteParentActionPerformed

    private void btnDeleteTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTeacherActionPerformed
     try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            String path = "SchoolDatabase.mdb";

            String ur = "jdbc:ucanaccess://" + path;

            Connection con = DriverManager.getConnection(ur);

            Statement st = con.createStatement();
            String Deleted = JOptionPane.showInputDialog("Enter Contact number of record to be deleted :");
            String q = "SELECT * FROM tblTeacher WHERE TeacherContact ='" + Deleted + "'";
            ResultSet rs = st.executeQuery(q);
            String answer = JOptionPane.showInputDialog("Are you sure you want to Delete this record YES/NO");
            if (answer.equalsIgnoreCase("Yes")) {
                q = "DELETE FROM tblTeacher WHERE TeacherContact ='" + Deleted + "'";
                st.executeUpdate(q);
                System.out.println("Record Deleted...");
            } else {
                System.out.println("Record Not Found...");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteTeacherActionPerformed

    private void btnSearchLearnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchLearnerActionPerformed
      try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

			String path = "SchoolDatabase.mdb";

			String ur = "jdbc:ucanaccess://" + path;

			Connection con = DriverManager.getConnection(ur);

				Statement st = con.createStatement();
		   String Content = JOptionPane.showInputDialog("Enter learner name to search :");
		   String q="SELECT * FROM tblAccepted WHERE LearnerName LIKE'%"+Content+"'";
		   ResultSet rs= st.executeQuery(q);
                   
		con.close();
                
		   }catch(Exception e){
				System.out.println(e);
			}
		// TODO add your handling code here:
    }//GEN-LAST:event_btnSearchLearnerActionPerformed

    private void btnSearchParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchParentActionPerformed
   try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

			String path = "SchoolDatabase.mdb";

			String ur = "jdbc:ucanaccess://" + path;

			Connection con = DriverManager.getConnection(ur);

				Statement st = con.createStatement();
		   String Content = JOptionPane.showInputDialog("Enter parent name to search :");
		   String q="SELECT * FROM tblParent WHERE ParerntName LIKE'%"+Content+"%'";
		   ResultSet rs= st.executeQuery(q);
		con.close();
		   }catch(Exception e){
				System.out.println(e);
			}        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchParentActionPerformed

    private void btnSearchTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTeacherActionPerformed
        try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

			String path = "SchoolDatabase.mdb";

			String ur = "jdbc:ucanaccess://" + path;

			Connection con = DriverManager.getConnection(ur);
                      Statement st = con.createStatement();
		   String Content = JOptionPane.showInputDialog("Enter teacher name to search :");
		   String q="SELECT * FROM tblTeacher WHERE TeacherName LIKE'%"+Content+"'";
		   ResultSet rs= st.executeQuery(q);
		con.close();
		   }catch(Exception e){
				System.out.println(e);
			}  // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchTeacherActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
      HomePage frmHome = new HomePage();
      frmHome.setVisible(true);
      this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnAddTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTeacherActionPerformed
        String TeacherName = JOptionPane.showInputDialog("Enter teacher name :");
		String TeacherSurname = JOptionPane.showInputDialog("Enter teacher Surname :");
		String Subject= JOptionPane.showInputDialog("Enter teacher teaching subject:");
		
		String contact = JOptionPane.showInputDialog("Enter teacher contact : ");
       	try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

			String path = "SchoolDatabase.mdb";

			String ur = "jdbc:ucanaccess://" + path;

			Connection con = DriverManager.getConnection(ur);

			String query = "INSERT INTO tblTeacher VALUES ('"+TeacherName+"', '"+TeacherSurname+"', '"+Subject+"', '"+contact+"')";
			Statement Stmt = con.createStatement();
			int rs = Stmt.executeUpdate(query);
			Statement st = con.createStatement();
                        System.out.println("Record inserted successfully.");
		con.close();
		   }catch(Exception e){
				System.out.println(e);
			}  // TODO add your handling code here:
    }//GEN-LAST:event_btnAddTeacherActionPerformed

    private void cmbAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAgeActionPerformed
      int index = cmbAge.getSelectedIndex();
       String q = "";
       switch (index){
           case 0 : 
                q = "SELECT * FROM tblLearner";
                break;
            case 1:
                q = "SELECT * FROM tblLearner WHERE LearnerAge BETWEEN 6 AND 9 ";
                break;
            case 2:
                q = "SELECT * FROM tblLearner WHERE LearnerAge BETWEEN 10 AND 13 ";
                break;
            case 3:
                q = "SELECT * FROM tblLearner WHERE LearnerAge BETWEEN 14 AND 17 ";
                break;
       }
       try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

                    String path = "SchoolDatabase.mdb";

                    String ur = "jdbc:ucanaccess://" + path;

                    Connection con = DriverManager.getConnection(ur);

                    Statement st = con.createStatement();

                    ResultSet rs = st.executeQuery(q);

                    jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                    con.close();

                } catch (Exception e) {
                    System.out.println(e);
                }
       // TODO add your handling code here:
    }//GEN-LAST:event_cmbAgeActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTeacher;
    private javax.swing.JButton btnDeleteLearner;
    private javax.swing.JButton btnDeleteParent;
    private javax.swing.JButton btnDeleteTeacher;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSearchLearner;
    private javax.swing.JButton btnSearchParent;
    private javax.swing.JButton btnSearchTeacher;
    private javax.swing.JComboBox cmbAge;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel lblLabel;
    // End of variables declaration//GEN-END:variables
}