/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author bbben
 */
public class AddsPlayerNames extends javax.swing.JFrame {

    public ArrayList<String> playerIDs;
    /**
     * Creates new form AddsPlayerNames
     */
    public AddsPlayerNames() {
        initComponents();
        playerIDs = new ArrayList<>();
    }

    public String[] getPids(){
        String[] pids = playerIDs.toArray(new String[playerIDs.size()]);
        return pids;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        DoneButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pidTextBox = new javax.swing.JTextField();
        pidOneLabel = new javax.swing.JLabel();
        pidTwoLabel = new javax.swing.JLabel();
        pidThreeLabel = new javax.swing.JLabel();
        pidFourLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Add the names of the players");

        SaveButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        DoneButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DoneButton.setText("Done");
        DoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name of the players:");

        pidTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidTextBoxActionPerformed(evt);
            }
        });

        pidOneLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        pidTwoLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        pidThreeLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        pidFourLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(SaveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DoneButton)
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pidOneLabel)
                            .addComponent(pidTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pidTwoLabel)
                            .addComponent(pidThreeLabel)
                            .addComponent(pidFourLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(pidTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(pidOneLabel)
                .addGap(18, 18, 18)
                .addComponent(pidTwoLabel)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SaveButton)
                            .addComponent(DoneButton))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pidThreeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(pidFourLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        if(pidTextBox.getText().isEmpty()){
            JLabel message = new JLabel("Please enter in a name!");
            message.setFont(new Font("Arial", Font.BOLD, 48));
            JOptionPane.showMessageDialog(null, message);
        }

        else {
            String name = pidTextBox.getText().trim();
            playerIDs.add(name);

            if (playerIDs.size() == 1) {
                pidOneLabel.setText(playerIDs.get(0));
            }

            else if (playerIDs.size() == 2) {
                pidOneLabel.setText(playerIDs.get(0));
                pidTwoLabel.setText(playerIDs.get(1));
            }

            else if (playerIDs.size() == 3) {
                pidOneLabel.setText(playerIDs.get(0));
                pidTwoLabel.setText(playerIDs.get(1));
                pidThreeLabel.setText(playerIDs.get(2));

            }

            else if (playerIDs.size() == 4) {
                pidOneLabel.setText(playerIDs.get(0));
                pidTwoLabel.setText(playerIDs.get(1));
                pidThreeLabel.setText(playerIDs.get(2));
                pidFourLabel.setText(playerIDs.get(3));

            }

            if (playerIDs.size() > 0 && playerIDs.size() < 5) {
                JLabel message = new JLabel("Succesful Save!");
                message.setFont(new Font("Arial", Font.BOLD, 48));
                JOptionPane.showMessageDialog(null, message);
                pidTextBox.setText("");
            }

            if (playerIDs.size() == 5) {
                playerIDs.remove(name);
                JLabel message = new JLabel("There can only be between 2-4 players!");
                message.setFont(new Font("Arial", Font.BOLD, 48));
                JOptionPane.showMessageDialog(null, message);
                pidTextBox.setText("");
            }
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void DoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButtonActionPerformed
        if (playerIDs.size() == 1 || playerIDs.size() == 0) {
            JLabel message = new JLabel("Theremust be at least 2 players!");
            message.setFont(new Font("Arial", Font.BOLD, 48));
            JOptionPane.showMessageDialog(null, message);
        }

        else{
            this.dispose();
            new GameStage(playerIDs).setVisible(true);
        }
    }//GEN-LAST:event_DoneButtonActionPerformed

    private void pidTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidTextBoxActionPerformed
        
    }//GEN-LAST:event_pidTextBoxActionPerformed

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
            java.util.logging.Logger.getLogger(AddsPlayerNames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddsPlayerNames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddsPlayerNames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddsPlayerNames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddsPlayerNames().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DoneButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pidFourLabel;
    private javax.swing.JLabel pidOneLabel;
    private javax.swing.JTextField pidTextBox;
    private javax.swing.JLabel pidThreeLabel;
    private javax.swing.JLabel pidTwoLabel;
    // End of variables declaration//GEN-END:variables
}
