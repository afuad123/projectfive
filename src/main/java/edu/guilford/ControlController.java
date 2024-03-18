package edu.guilford;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class ControlController {
    private ScrabblePane scrabblePane;
    private ScrabbleSet scrabbleset;

    
    @FXML
    private Button clearButton;

    @FXML
    private Button submitButton;

    @FXML
    private Button randomButton;

    @FXML
    private Label scoreLabel;

    @FXML
    private TextField word; 

    @FXML
    public void clearScore() {
        //clear the score from the pane
        scrabblePane.getChildren().clear();
        //change the text of the clear button
        clearButton.setText("Cleared");
    }

    @FXML
    public void submitScore() {
        scrabbleset = new ScrabbleSet("English");
        scrabblePane.setWord(new Word(this.word.getText(), scrabbleset));
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
          
    }

    

    

}
