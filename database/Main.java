/* *************THINGS LEFT TO DO*******************
This youtube channel will give us all the tools needed to succeed.
It uses eclipse but the concepts and syntax are the same
https://www.youtube.com/watch?v=pb-r8U2kpCU&list=PLS1QulWo1RIbYMA5Ijb72QHaHvCrPKfS2


RST. NEEDS TO BE IMPLEMENTED ON OUR SEARCH PAGES TO RETURN VALUES IN THE BIG BOX BASED ON THE ID ENTERED

ALSO THE FINAL REPORT.

LASTLY, CELEBRATE SUCCESS

*/
package database;

import java.sql.*;
import javax.swing.*;
import java.sql.*;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AddNurseButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ProjectTitleLabel = new javax.swing.JLabel();
        AddDoctorButton = new javax.swing.JButton();
        AddPatientButton = new javax.swing.JButton();
        SearchMenuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Healthcare Database System");
        setBackground(new java.awt.Color(250, 250, 250));
        setBounds(new java.awt.Rectangle(820, 540, 540, 540));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(820, 540));
        setMinimumSize(new java.awt.Dimension(820, 560));
        setPreferredSize(new java.awt.Dimension(840, 560));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 100, 150), 8));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        AddNurseButton.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        AddNurseButton.setText("Add New Nurse");
        AddNurseButton.setMaximumSize(new java.awt.Dimension(300, 30));
        AddNurseButton.setMinimumSize(new java.awt.Dimension(300, 30));
        AddNurseButton.setPreferredSize(new java.awt.Dimension(100, 20));
        AddNurseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNurseButtonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        ProjectTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 46)); // NOI18N
        ProjectTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProjectTitleLabel.setText("Healthcare Database System");
        ProjectTitleLabel.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProjectTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProjectTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        AddDoctorButton.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        AddDoctorButton.setText("Add New Doctor");
        AddDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDoctorButtonActionPerformed(evt);
            }
        });

        AddPatientButton.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        AddPatientButton.setText("Add New Patient");
        AddPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPatientButtonActionPerformed(evt);
            }
        });

        SearchMenuButton.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        SearchMenuButton.setText("Search");
        SearchMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AddNurseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AddDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(SearchMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AddPatientButton, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))))
                        .addGap(0, 31, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddNurseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddNurseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNurseButtonActionPerformed
        // Adds a new nurse
        New_Nurse Nurse = new New_Nurse();
        Nurse.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddNurseButtonActionPerformed

    private void AddPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPatientButtonActionPerformed
        // Adds a new patient
        New_Patient Patient = new New_Patient();
        Patient.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddPatientButtonActionPerformed

    private void SearchMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchMenuButtonActionPerformed
        // searchs the database
        Search searchlist = new Search();
        searchlist.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SearchMenuButtonActionPerformed

    private void AddDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDoctorButtonActionPerformed
        this.toBack();
        New_Doctor Doctor = new New_Doctor();
        Doctor.setVisible(true);
        Doctor.toFront();
        this.setVisible(false);
    }//GEN-LAST:event_AddDoctorButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDoctorButton;
    private javax.swing.JButton AddNurseButton;
    private javax.swing.JButton AddPatientButton;
    private javax.swing.JLabel ProjectTitleLabel;
    private javax.swing.JButton SearchMenuButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
