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

    String userWord = word.getText();


    @FXML
    public void clearScore() {
        //clear the score from the pane
        scrabblePane.getChildren().clear();
        //change the text of the clear button
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
    public void displayNumberException() {
        scrabblePane.drawNumberException();
    } {


   
    try {
        if (userWord == null || userWord.isEmpty()) {
            //throw new BadWordException("Please enter a word");
            scrabblePane.drawEmptyException();
        }
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    /* if (userWord == null || userWord.isEmpty()) {
        throw new IllegalArgumentException("Please enter a word");
    }

    if (userLanguage == null || userLanguage.isEmpty()) {
        throw new IllegalArgumentException("Please enter a language");
    }

    if (userWord.matches(".*\\d.*")) {
        throw new IllegalArgumentException("Please enter a word with no numbers");
    }

    if (userLanguage.matches(".*\\d.*")) {
        throw new IllegalArgumentException("Please enter a language with no numbers");
    }

 */
    }

    private static class BadWordException extends RuntimeException {
        public BadWordException(String message) {
            super(message);
        }
    }}


