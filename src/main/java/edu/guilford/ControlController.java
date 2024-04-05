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

    //String userWord = word.getText();
    


    @FXML
    public void clearScore() {
        //clear the score from the pane
        scrabblePane.getChildren().clear();
        //change the text of the clear button
    }

    @FXML
    // public void submitScore() {
    //     scrabblePane.setWord(new Word(this.word.getText(), scrabbleset));
    //     scrabblePane.drawScore();
    // }
    public void submitScore() {
        String userWord = word.getText();
        try {
            if (userWord == null || userWord.length() == 0) {
                throw new EmptyException("Please enter a word");   
            }
        } catch (EmptyException e) {
            scrabblePane.drawEmptyException();
            System.out.println(e.getMessage());
        } 
        try {
            for (int i = 0; i < userWord.length(); i++) {
                if (Character.isDigit(userWord.charAt(i))) {
                    throw new NumberException("The word entered contains a number");
                }
            }
        } catch (NumberException e) {
            scrabblePane.drawNumberException();
            System.out.println(e.getMessage());
        } 
        
        try {
            for (int i = 0; i < userWord.length(); i++) {
                if (!Character.isLetter(userWord.charAt(i))) {
                    throw new InvalidCharacterException("The word entered contains an invalid character");
                }
            }
        } catch (InvalidCharacterException e) {
            scrabblePane.drawInvalidCharacterException();
            System.out.println(e.getMessage());
        }

        // try {
        // int[] wordLetterCount = new int[27]; 
        // int [] letterCount = new int[27];
        // letterCount[0] = 2; //blank tile
        // letterCount[1] = 9; //A
        // letterCount[2] = 2; //B
        // letterCount[3] = 2; //C
        // letterCount[4] = 4; //D
        // letterCount[5] = 12; //E
        // letterCount[6] = 2; //F
        // letterCount[7] = 3; //G
        // letterCount[8] = 2; //H
        // letterCount[9] = 9; //I
        // letterCount[10] = 1; //J
        // letterCount[11] = 1; //K
        // letterCount[12] = 4; //L
        // letterCount[13] = 2; //M
        // letterCount[14] = 6; //N
        // letterCount[15] = 8; //O
        // letterCount[16] = 2; //P
        // letterCount[17] = 1; //Q
        // letterCount[18] = 6; //R
        // letterCount[19] = 4; //S
        // letterCount[20] = 6; //T
        // letterCount[21] = 4; //U
        // letterCount[22] = 2; //V
        // letterCount[23] = 2; //W
        // letterCount[24] = 1; //X
        // letterCount[25] = 2; //Y
        // letterCount[26] = 1; //Z
        // //loop that parses through the word and identifies invalid characters
        // for (int i = 0; i < userWord.length(); i++) {
        //     if (Character.isLetter(userWord.charAt(i))) {
        //         int index = userWord.charAt(i) - 'A' + 1;
        //         if (wordLetterCount[index] > letterCount[index]) {
        //             throw new InvalidWordException("The word " + userWord + " is not a valid word in the English language");
        //             }
        //         }   
        //     }  
        // } catch (InvalidWordException e) {
        //     scrabblePane.drawInvalidWordException();
        //     System.out.println(e.getMessage());
        // } 
        scrabbleset = new ScrabbleSet("English");
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
    } //{


   
    // try {
    //     if (userWord == null || userWord.isEmpty()) {
    //         //throw new BadWordException("Please enter a word");
    //         scrabblePane.drawEmptyException();
    //     }
    // } catch (Exception e) {
    //     // TODO Auto-generated catch block
    //     e.printStackTrace();
    // }

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
   // }

    private static class EmptyException extends RuntimeException {
        public EmptyException(String message) {
            super(message);
        }
    }

    private static class NumberException extends RuntimeException {
        public NumberException(String message) {
            super(message);
        }
    }

    private static class InvalidCharacterException extends RuntimeException {
        public InvalidCharacterException(String message) {
            super(message);
        }
    }

    private static class InvalidWordException extends RuntimeException {
        public InvalidWordException(String message) {
            super(message);
        }
    }
}


