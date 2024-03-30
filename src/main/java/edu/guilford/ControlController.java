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
    private Button submitLanguageButton;

    @FXML
    private Label scoreLabel;

    @FXML
    private TextField word; 

    @FXML
    private TextField language;

    @FXML
    public void clearScore() {
        //clear the score from the pane
        scrabblePane.getChildren().clear();
        //change the text of the clear button
    }

    @FXML
    public void submitLanguage() {
        scrabbleset = new ScrabbleSet(language.getText());
        scrabblePane.setScrabbleSet(new ScrabbleSet(language.getText()));
    }
    @FXML
    public void submitScore() {
        scrabblePane.setWord(new Word(this.word.getText(), scrabbleset));
        scrabblePane.drawScore();
    }


    public void setScrabblePane(ScrabblePane scrabblePane) {
        this.scrabblePane = scrabblePane;
    }

   @FXML
    public void displayScore() {
         scrabblePane.drawScore();
          
    }

    @FXML
    public void displayLanguage() {
        scrabblePane.setLanguageLabel(language.getText());
    }

    

    

}
