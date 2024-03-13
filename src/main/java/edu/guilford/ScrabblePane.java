package edu.guilford;

import javafx.scene.layout.Pane;

public class ScrabblePane extends Pane {

    // list of shapes to display
    private ScrabbleSet scrabbleset;
    private Word word;

    public ScrabblePane() {
        super();
        //add a mouse click listener to generate new words             
        this.setOnMouseClicked(e -> {
            scrabbleset = new ScrabbleSet("English");
            word = new Word();
            word.getScore();
            

            
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
            //add the tile to the pane
            this.getChildren().add(tile);
        }
    }


}