package database;

import java.awt.Font;
import java.sql.*;

public class Search extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Search() {
                con = DbConnection.ConnectionDB();
        initComponents();
    }
    Nurse_Search Employee_Search = new Nurse_Search();
    Patient_Search Patient_Search = new Patient_Search();
    Doctor_Search Doctor_Search = new Doctor_Search();


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Back3 = new javax.swing.JButton();
        SearchDoctor1 = new javax.swing.JButton();
        SearchNurse1 = new javax.swing.JButton();
        SearchPatient1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 100, 150), 8));
        jPanel3.setMinimumSize(new java.awt.Dimension(20, 120));
        jPanel3.setPreferredSize(new java.awt.Dimension(20, 120));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel12.setText("Search");

        Back3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Back3.setText("Back");
        Back3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back3ActionPerformed(evt);
            }
        });

        SearchDoctor1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        SearchDoctor1.setText("Doctor");
        SearchDoctor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchDoctor1ActionPerformed(evt);
            }
        });

        SearchNurse1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        SearchNurse1.setText("Nurse");
        SearchNurse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchNurse1ActionPerformed(evt);
            }
        });

        SearchPatient1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        SearchPatient1.setText("Patient");
        SearchPatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchPatient1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(SearchDoctor1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(SearchNurse1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(SearchPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchDoctor1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchNurse1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(Back3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back3ActionPerformed
        //Closes current window and goes to previous window.
        dispose();
        Main m = new Main();
        m.setVisible(true);
    }//GEN-LAST:event_Back3ActionPerformed

    private void SearchDoctor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchDoctor1ActionPerformed
        //Closes current window and goes to previous window.
        dispose();
        Doctor_Search m = new Doctor_Search();
        m.setVisible(true);
    }//GEN-LAST:event_SearchDoctor1ActionPerformed

    private void SearchNurse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchNurse1ActionPerformed
        //Closes current window and goes to previous window.
        dispose();
        Nurse_Search m = new Nurse_Search();
        m.setVisible(true);
    }//GEN-LAST:event_SearchNurse1ActionPerformed

    private void SearchPatient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchPatient1ActionPerformed
        //Closes current window and goes to previous window.
        dispose();
        Patient_Search m = new Patient_Search();
        m.setVisible(true);
    }//GEN-LAST:event_SearchPatient1ActionPerformed

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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back3;
    private javax.swing.JButton SearchDoctor1;
    private javax.swing.JButton SearchNurse1;
    private javax.swing.JButton SearchPatient1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
