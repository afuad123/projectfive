package edu.guilford;


import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import edu.guilford.BadWordException;

public class ScrabblePane extends GridPane {

    private Word word;
    private ScrabbleSet scrabbleset;
    private int[] letterCount;
    

    public ScrabblePane() {
        super();
    }

    public void drawScore() {
        //clear the pane
        this.getChildren().clear();
        //get the score of the word
        int score = word.getScore();
        //display the score of the word using a label object
        String stringword = word.toString();
        Label scoreLabel = new Label("The score of the word " + stringword.toUpperCase() + " is " + score);
        scoreLabel.setLayoutX(0);
        scoreLabel.setLayoutY(20);
        //add the label to the pane
        this.getChildren().add(scoreLabel);
    }

    public void drawEmptyException() {
        this.getChildren().clear();
        //get the value of the word
        //check if the word is empty
        Label emptyException = new Label("The word is empty");
        emptyException.setLayoutX(0);
        emptyException.setLayoutY(40);
        //add the label to the pane
        this.getChildren().add(emptyException);   
    }
    public void drawNumberException() {
        this.getChildren().clear();
        //get the value of the word
        Label numberException = new Label("The word entered contains a number");
        numberException.setLayoutX(0);
        numberException.setLayoutY(40);
        //add the label to the pane
        this.getChildren().add(numberException);   
    }

    public void drawInvalidCharacterException() {
        this.getChildren().clear();
        //get the value of the word
        //loop that parses through the word and identifies invalid characters
        Label invalidCharacterException = new Label("The word entered contains an invalid character");
        invalidCharacterException.setLayoutX(0);
        invalidCharacterException.setLayoutY(20);
        //add the label to the pane
        this.getChildren().add(invalidCharacterException); 
    }

    public void drawInvalidWordException () {
        this.getChildren().clear();
        //get the value of the word
        String stringword = word.toString();
        Label invalidWordException = new Label("The word " + stringword + " is not a valid word in the English language");
        invalidWordException.setLayoutX(0);
        this.getChildren().add(invalidWordException);
        invalidWordException.setLayoutY(20);  
        }

    public void setWord(Word word) {
             this.word = word;
    }

    public void setScrabbleSet(ScrabbleSet scrabbleset) {
        this.scrabbleset = scrabbleset;
    }

    //setLanguageLabel
    public void setLanguageLabel(String language) {
        Label languageLabel = new Label("The language of the word is " + language);
        languageLabel.setLayoutX(0);
        languageLabel.setLayoutY(0);
        //add the label to the pane
        this.getChildren().add(languageLabel);
        languageLabel.setText(language);
        }

   
    }

    






