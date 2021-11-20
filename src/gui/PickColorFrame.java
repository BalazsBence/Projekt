/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import uno.UnoCard;
import java.awt.Font;
/**
 *
 * @author bbben
 */
public class PickColorFrame extends javax.swing.JFrame {

    private UnoCard.Color wildColor = null;
    Boolean allow = false;
    PopUp popUp;
    
    public PickColorFrame() {
        initComponents();
    }
    
    public PickColorFrame(PopUp pop){
        initComponents();
        popUp = pop;
    }
    
    public UnoCard.Color choseColor(UnoCard card){
        if(card.getColor() == UnoCard.Color.Wild){
            this.setVisible(true);
            this.setResizable(false);
            this.setBounds(100,150,600,700);
        }
        
        return card.getColor();
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
        redButton = new javax.swing.JButton();
        blueButton = new javax.swing.JButton();
        greenButton = new javax.swing.JButton();
        yellowButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Pick the Color of your wild card");

        redButton.setText("Red");
        redButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redButtonActionPerformed(evt);
            }
        });

        blueButton.setText("Blue");
        blueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueButtonActionPerformed(evt);
            }
        });

        greenButton.setText("Green");
        greenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenButtonActionPerformed(evt);
            }
        });

        yellowButton.setText("Yellow");
        yellowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(redButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(blueButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yellowButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(greenButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(108, 108, 108)
                .addComponent(redButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(yellowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(greenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
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

    private void redButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redButtonActionPerformed
        wildColor = UnoCard.Color.Red;
        JLabel message = new JLabel("Th Wild Color is Red!");
        message.setFont(new Font("Arial", Font.BOLD, 48));
        JOptionPane.showMessageDialog(null, message);
        allow = true;
        this.dispose();
        popUp.declaredColor = UnoCard.Color.Red;
        popUp.gameStage.setPidName(popUp.game.getCurrentPlayer());
        popUp.gameStage.setButtonIcons();
        popUp.topCardButton.setIcon(new javax.swing.ImageIcon("/Images/PNGs/small" + popUp.game.getTopCardImage()));
        popUp.game.setCardColor(UnoCard.Color.Red);
        popUp.dispose();
    }//GEN-LAST:event_redButtonActionPerformed

    private void blueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueButtonActionPerformed
        wildColor = UnoCard.Color.Blue;
        JLabel message = new JLabel("Th Wild Color is Blue!");
        message.setFont(new Font("Arial", Font.BOLD, 48));
        JOptionPane.showMessageDialog(null, message);
        allow = true;
        this.dispose();
        popUp.declaredColor = UnoCard.Color.Blue;
        popUp.gameStage.setPidName(popUp.game.getCurrentPlayer());
        popUp.gameStage.setButtonIcons();
        popUp.topCardButton.setIcon(new javax.swing.ImageIcon("/Images/PNGs/small" + popUp.game.getTopCardImage()));
        popUp.game.setCardColor(UnoCard.Color.Blue);
        popUp.dispose();
    }//GEN-LAST:event_blueButtonActionPerformed

    private void yellowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowButtonActionPerformed
        wildColor = UnoCard.Color.Yellow;
        JLabel message = new JLabel("Th Wild Color is Yellow!");
        message.setFont(new Font("Arial", Font.BOLD, 48));
        JOptionPane.showMessageDialog(null, message);
        allow = true;
        this.dispose();
        popUp.declaredColor = UnoCard.Color.Yellow;
        popUp.gameStage.setPidName(popUp.game.getCurrentPlayer());
        popUp.gameStage.setButtonIcons();
        popUp.topCardButton.setIcon(new javax.swing.ImageIcon("/Images/PNGs/small" + popUp.game.getTopCardImage()));
        popUp.game.setCardColor(UnoCard.Color.Yellow);
        popUp.dispose();
    }//GEN-LAST:event_yellowButtonActionPerformed

    private void greenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenButtonActionPerformed
        wildColor = UnoCard.Color.Green;
        JLabel message = new JLabel("Th Wild Color is Green!");
        message.setFont(new Font("Arial", Font.BOLD, 48));
        JOptionPane.showMessageDialog(null, message);
        allow = true;
        this.dispose();
        popUp.declaredColor = UnoCard.Color.Green;
        popUp.gameStage.setPidName(popUp.game.getCurrentPlayer());
        popUp.gameStage.setButtonIcons();
        popUp.topCardButton.setIcon(new javax.swing.ImageIcon("/Images/PNGs/small" + popUp.game.getTopCardImage()));
        popUp.game.setCardColor(UnoCard.Color.Green);
        popUp.dispose();
    }//GEN-LAST:event_greenButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PickColorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PickColorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PickColorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PickColorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PickColorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blueButton;
    private javax.swing.JButton greenButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton redButton;
    private javax.swing.JButton yellowButton;
    // End of variables declaration//GEN-END:variables
}
