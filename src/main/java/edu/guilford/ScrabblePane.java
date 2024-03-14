package edu.guilford;

import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

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

    //make a method called "drawScore()" that will display the score of the word in the pane
    public void drawScore() {
        //clear the pane
        this.getChildren().clear();
        //get the score of the word
        int score = word.getScore();
        //create a new Text object
        Text text = new Text();
        //set the text of the Text object to the score
        text.setText("The score of the word is " + score);
        //set the x position of the Text object
        text.setX(0);
        //set the y position of the Text object
        text.setY(0);
        //add the Text object to the pane
        this.getChildren().add(text);
    }
        /*super();
        //add a mouse click listener to generate new words             
        this.setOnMouseClicked(e -> {
            scrabbleset = new ScrabbleSet("English");
            word = new Word();
            word.getScore();
            
        });
        super();
        //add a mouse click listener to generate new shapes             
        this.setOnMouseClicked(e -> {
            //will generator a random number of shapes
            tileList.generateTiles();
            drawShapes();
        });
        
    }

    public void setScrabbleSet(ScrabbleSet scrabbleset) {
        this.scrabbleset = scrabbleset;
    }

    //make a method that displays the word called drawWord()
    public void drawWord() {
        //clear the pane
        this.getChildren().clear();
        //get the word from the word object
        String word = this.word.getWord();
        //get the length of the word
        int length = word.length();
        //get the width of the pane
        double width = this.getWidth();
        //get the height of the pane
        double height = this.getHeight();
        //get the width of each letter
        double letterWidth = width / length;
        //get the height of each letter
        double letterHeight = height;
        //loop through the word
        for (int i = 0; i < length; i++) {
            //get the letter
            char letter = word.charAt(i);
            //create a new ScrabbleTile
            Tile tile = new Tile(letter, i);
            //set the width of the tile
            tile.setWidth(letterWidth);
            //set the height of the tile
            tile.setHeight(letterHeight);
            //set the x position of the tile
            tile.setX(i * letterWidth);
            //set the y position of the tile
            tile.setY(0);
        }*/
        
    
    }


