package edu.guilford;


import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;

public class ScrabblePane extends GridPane {

    private Word word;
    private ScrabbleSet scrabbleset;

    public ScrabblePane() {
        //when the enter key is pressed, the score of the word should be displayed
        this.setOnKeyPressed(e -> {
            //if the enter key is pressed
            if (e.getCode() == KeyCode.ENTER) {
                drawScore();
            }
        });
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

    // //drawLanguage
    // public void drawLanguage() {
    //     //clear the pane
    //     this.getChildren().clear();
    //     //get the language of the word
     
    //     Label languageLabel = new Label("The language of the word is " + language.toUpperCase());
    //     languageLabel.setLayoutX(0);
    //     languageLabel.setLayoutY(0);
    //     //add the label to the pane
    //     this.getChildren().add(languageLabel);
    // }
    public void setWord(Word word) {
             this.word = word;
    }

    public void setScrabbleSet(ScrabbleSet scrabbleset) {
        this.scrabbleset = scrabbleset;
    }

    //setLanguageLabel
    public void setLanguageLabel(String language) {
        Label languageLabel = new Label("The language of the word is " + language.toUpperCase());
        languageLabel.setLayoutX(0);
        languageLabel.setLayoutY(0);
        //add the label to the pane
        this.getChildren().add(languageLabel);
    }

   
}




