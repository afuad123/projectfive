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

    public void drawWords() {
        this.getChildren().clear();
        for (int i = 0; i < scrabbleset.size(); i++) {
            this.getChildren().add(scrabbleset.get(i));
        }
    }


}