package edu.guilford;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class ScrabbleFXDriver extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        ScrabblePane root = new ScrabblePane();
        Word word = new Word();
        word.getScore();
        root.setWord(word);
        root.drawScore();
        scene = new Scene(root, 800, 800);
        scene.getRoot().setStyle("-fx-font-family: 'serif'");
        stage.setScene(scene);
        stage.show();

          //window for controls
          Stage controlStage = new Stage();
          //build an FXMLLoader object that will load the FXML file and interact with the controller class
          FXMLLoader loader = new FXMLLoader(getClass().getResource("/edu/guilford/control.fxml"));
          Parent controlRoot = loader.load();
          ControlController controlController = loader.getController();
          controlController.setScrabblePane(root);
          controlController.displayScore();
          Scene controlScene = new Scene(controlRoot, 300, 200);
          controlStage.setScene(controlScene);
          //moves the control panel window to top left
          //controlStage.setX(20);
          //controlStage.setY(50);
          controlStage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ScrabbleFXDriver.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}