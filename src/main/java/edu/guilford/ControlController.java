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
    private Label scoreLabel;
    

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

   @FXML
   //display score method that uses drawScore() from scrabblepane
    private void displayScore() {
         scrabblePane.drawScore();
         //set the text of the score label to the word's score WITHOUT using getWord() or getScore()
         scoreLabel.setText("The score of the word is: ");
          
    }

}
