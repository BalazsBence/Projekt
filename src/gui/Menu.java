package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
public class Menu extends javax.swing.JFrame {

    @FXML
    private Button ExitButton;

    @FXML
    private Pane MenuPane;

    @FXML
    void ExitBtClicked(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void jButton2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new AddsPlayerNames().setVisible(true);
        this.dispose();
    }

}
