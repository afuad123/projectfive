package edu.guilford;

import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;

public class ScrabblePane extends Pane {

    // list of shapes to display
    // private ScrabbleSet scrabbleset;
    // private Word word;
    private Word word;

    public ScrabblePane() {
        //when the enter key is pressed, the score of the word should be displayed
        this.setOnKeyPressed(e -> {
            //if the enter key is pressed
            if (e.getCode() == KeyCode.ENTER) {
                //get the score of the word
                //int score = word.getScore();
                //display the score using drawScore()
                drawScore();
            }
        });
    }
    public void setWord(Word word) {
        this.word = word;
    }

    public void drawScore() {
        //clear the pane
        this.getChildren().clear();
        //get the score of the word
        int score = word.getScore();
        //display the score of the word using a label object
        Label scoreLabel = new Label("The score of the word is " + score);
        //set the x position of the label
        scoreLabel.setLayoutX(0);
        //set the y position of the label
        scoreLabel.setLayoutY(0);
        //add the label to the pane
        this.getChildren().add(scoreLabel);


    }
        
}


