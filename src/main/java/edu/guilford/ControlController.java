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
        scrabbleset = new ScrabbleSet("English");
        Word wordUserWord = new Word(userWord, scrabbleset);
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

        try {
            if (wordUserWord.getScore() == -1) {
                throw new InvalidWordException("The word " + userWord + " is not a valid word in the English language");   
            }
        } catch (InvalidWordException e) {
            scrabblePane.drawInvalidWordException();
            System.out.println(e.getMessage());
        } 
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


