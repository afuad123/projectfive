package edu.guilford;


import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import edu.guilford.BadWordException;

public class ScrabblePane extends Pane {

    private Word word;
    private ScrabbleSet scrabbleset;
    private int[] letterCount;
    private Pane scrabblePane;
    

    public ScrabblePane() {
        super();
    }

    public void drawScore() {
        //clear the pane
        //get the score of the word
        int score = word.getScore();
        //display the score of the word using a label object
        String stringword = word.toString();
        Label scoreLabel = new Label("The score of the word " + stringword.toUpperCase() + " is " + score);
        scoreLabel.setLayoutX(0);
        scoreLabel.setLayoutY(20);
        //add the label to the pane (not gridpane)
        this.getChildren().add(scoreLabel);

    }

    public void drawEmptyException() {
        //get the value of the word
        //check if the word is empty
        Label emptyException = new Label("The word is empty");
        emptyException.setLayoutX(0);
        emptyException.setLayoutY(40);
        //add the label to the pane
        this.getChildren().add(emptyException);   
    }
    public void drawNumberException() {
        //get the value of the word
        Label numberException = new Label("The word entered contains a number");
        numberException.setLayoutX(0);
        numberException.setLayoutY(40);
        //add the label to the pane
        this.getChildren().add(numberException);   
    }

    public void drawInvalidCharacterException() {
        //get the value of the word
        //loop that parses through the word and identifies invalid characters
        Label invalidCharacterException = new Label("The word entered contains an invalid character");
        invalidCharacterException.setLayoutX(0);
        invalidCharacterException.setLayoutY(40);
        //add the label to the pane
        this.getChildren().add(invalidCharacterException); 
    }

    public void drawInvalidWordException () {
        //get the value of the word
        Label invalidWordException = new Label("The word is not a valid word in the English language");
        invalidWordException.setLayoutX(0);
        invalidWordException.setLayoutY(40);  
        this.getChildren().add(invalidWordException);
        }

    public void setWord(Word word) {
             this.word = word;
    }

    public void setScrabbleSet(ScrabbleSet scrabbleset) {
        this.scrabbleset = scrabbleset;
    }

   
    }

    






