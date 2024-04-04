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
        String stringword = word.toString();
        //check if the word is empty
        if (stringword.isEmpty()) {
            Label emptyException = new Label("The word is empty");
            emptyException.setLayoutX(0);
            emptyException.setLayoutY(20);
            //add the label to the pane
            this.getChildren().add(emptyException);
        }
    }

    public void drawNumberException() {
        this.getChildren().clear();
        //get the value of the word
        String stringword = word.toString();
        //loop that parses through the word and identifies numbers
        for (int i = 0; i < stringword.length(); i++) {
            if (Character.isDigit(stringword.charAt(i))) {
                Label numberException = new Label("The word " + stringword + " contains a number");
                numberException.setLayoutX(0);
                numberException.setLayoutY(20);
                //add the label to the pane
                this.getChildren().add(numberException);
            }
        }
    }

    public void drawInvalidCharacterException() {
        this.getChildren().clear();
        //get the value of the word
        String stringword = word.toString();
        //loop that parses through the word and identifies invalid characters
        for (int i = 0; i < stringword.length(); i++) {
            if (!Character.isLetter(stringword.charAt(i))) {
                Label invalidCharacterException = new Label("The word " + stringword + " contains an invalid character");
                invalidCharacterException.setLayoutX(0);
                invalidCharacterException.setLayoutY(20);
                //add the label to the pane
                this.getChildren().add(invalidCharacterException);
            }
        }
    }

    public void drawInvalidWordException () {
        this.getChildren().clear();
        //get the value of the word
        String stringword = word.toString();
        int[] wordLetterCount = new int[27];letterCount = new int[27];
        letterCount[0] = 2; //blank tile
        letterCount[1] = 9; //A
        letterCount[2] = 2; //B
        letterCount[3] = 2; //C
        letterCount[4] = 4; //D
        letterCount[5] = 12; //E
        letterCount[6] = 2; //F
        letterCount[7] = 3; //G
        letterCount[8] = 2; //H
        letterCount[9] = 9; //I
        letterCount[10] = 1; //J
        letterCount[11] = 1; //K
        letterCount[12] = 4; //L
        letterCount[13] = 2; //M
        letterCount[14] = 6; //N
        letterCount[15] = 8; //O
        letterCount[16] = 2; //P
        letterCount[17] = 1; //Q
        letterCount[18] = 6; //R
        letterCount[19] = 4; //S
        letterCount[20] = 6; //T
        letterCount[21] = 4; //U
        letterCount[22] = 2; //V
        letterCount[23] = 2; //W
        letterCount[24] = 1; //X
        letterCount[25] = 2; //Y
        letterCount[26] = 1; //Z
        //loop that parses through the word and identifies invalid characters
        for (int i = 0; i < stringword.length(); i++) {
            if (Character.isLetter(stringword.charAt(i))) {
                int index = stringword.charAt(i) - 'A' + 1;
                if (wordLetterCount[index] > letterCount[index]) {
                    Label invalidWordException = new Label("The word " + stringword + " contains an invalid word");
                    invalidWordException.setLayoutX(0);
                    this.getChildren().add(invalidWordException);
                    invalidWordException.setLayoutY(20);
                    }
                }   
            }    
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

    






