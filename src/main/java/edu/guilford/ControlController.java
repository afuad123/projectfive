package edu.guilford;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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
    private Button randomButton;

    @FXML
    private Label scoreLabel;
    

    @FXML
    public void clearScore() {
        scrabblePane.getChildren().clear();
        clearButton.setText("Cleared");
    }

    @FXML
    public void submitScore() {
        scrabblePane.drawScore();
        submitButton.setText("Submitted");
    }

    public void setScrabblePane(ScrabblePane scrabblePane) {
        this.scrabblePane = scrabblePane;
    }

   @FXML
   //display score method that uses drawScore() from scrabblepane
    public void displayScore() {
         scrabblePane.drawScore();
         //scoreLabel.setText("The score of the word is: ");
        // randomButton.setText("Score Displayed");
          
    }

}
