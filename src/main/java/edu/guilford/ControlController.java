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
    private Button submitWordButton;

    @FXML
    private Button submitFileButton;

    @FXML
    private Label scoreLabel;

    @FXML
    private TextField word; 

    @FXML
    private TextField file;

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
        submitWordButton.setText("Submitted");
    }

    // @FXML
    // public void submitFile() {
    //     scrabbleset = new ScrabbleSet("English");
    //     scrabblePane.setFile(file.getText());
    //     scrabblePane.drawScore();
    //     submitWordButton.setText("Submitted");
    // }

    public void setScrabblePane(ScrabblePane scrabblePane) {
        this.scrabblePane = scrabblePane;
    }

   @FXML
   //display score method that uses drawScore() from scrabblepane
    public void displayScore() {
         scrabblePane.drawScore();
          
    }

    

    

}
