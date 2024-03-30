package edu.guilford;


import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;

public class ScrabblePane extends GridPane {

    private Word word;

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
        //set the x position of the label
        scoreLabel.setLayoutX(0);
        //set the y position of the label
        scoreLabel.setLayoutY(0);
        //add the label to the pane
        this.getChildren().add(scoreLabel);
    }

    public void setWord(Word word) {
             this.word = word;
    }

   
}




