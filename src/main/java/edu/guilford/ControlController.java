package edu.guilford;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControlController {
    private ScrabblePane scrabblePane;

    // @FXML
    // private void switchToSecondary() throws IOException {
    //     ScrabbleFXDriver.setRoot("secondary");
    // }
    @FXML
    private Button clearButton;

    @FXML
    private Button submitButton;

    @FXML
    private void clearScore() {
        scrabblePane.getChildren().clear();
        clearButton.setText("Cleared");
    }

    @FXML
    private void submitScore() {
        scrabblePane.drawScore();
        submitButton.setText("Submitted");
    }

}
