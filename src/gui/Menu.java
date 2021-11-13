package gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Menu {

    @FXML
    private Button ExitButton;

    @FXML
    private Pane MenuPane;

    private Stage stage;
    private Scene scene;
    private Parent root;


    @FXML
    void ExitBtClicked(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void PlayBtClicked(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("AddsPlayerNames.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage = (Stage) MenuPane.getScene().getWindow();
        stage.close();    
    }

}
