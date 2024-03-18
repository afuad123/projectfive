package edu.guilford;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class ScrabblePane extends GridPane {

    private Word word;
    private ScrabbleSet scrabbleset;


    // public ScrabblePane() {
    //     // //when the enter key is pressed, the score of the word should be displayed
    //     // this.setOnKeyPressed(e -> {
    //     //     //if the enter key is pressed
    //     //     if (e.getCode() == KeyCode.ENTER) {
    //     //         //get the score of the word
    //     //         //int score = word.getScore();
    //     //         //display the score using drawScore()
    //     //         drawScore();
    //     //     }
    //     // });
    //      //add an image
    //     //first create a file object that points to the image file
    //     File file = new File(this.getClass().getResource("scrabble.png").getPath());
    //     //System.out.println(file);

    //     //add an  ImageView object that uses that File object
    //     ImageView logo = new ImageView(file.toURI().toString());

    //     //add the ImageView object to the pane
    //     add(logo, 2,1,1,5);

    //     //fix aspect ratio
    //     logo.setPreserveRatio(true);
    //     logo.setFitWidth(100);
    // }
    // public void setWord(Word word) {
    //     this.word = word;
    // }

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
        this.getChildren().add(scoreLabel);}

    public void setWord(Word word) {
             this.word = word;
         }
    //attributes
    private TextField wordField;
    private Label scoreLabel;
    private Button submitButton;
    
    public ScrabblePane() {
        //set the horizontal gap between components
        this.setHgap(10);
        //set the vertical gap between components
        this.setVgap(10);

        //create the components
        wordField = new TextField("Word");
        scoreLabel = new Label("Score:");
        submitButton = new Button("Submit");
       

        //add an image
        //first create a file object that points to the image file
        File file = new File(this.getClass().getResource("scrabble.png").getPath());
        System.out.println(file);

        //add an  ImageView object that uses that File object
        ImageView logo = new ImageView(file.toURI().toString());

        //add the ImageView object to the pane
        add(logo, 2,1,1,5);

        //fix aspect ratio
        logo.setPreserveRatio(true);
        logo.setFitWidth(200);
        //logo.setRotate(45);

        //add components to the pane
        add(wordField, 1, 2);
        add(scoreLabel, 1, 3);
        add(submitButton, 1, 4);

        //create a lambda function for the event handler (button being clicked by user)
        submitButton.setOnAction((ActionEvent e) -> {
            setFields(e);     
        });
        wordField.setOnAction((ActionEvent e) -> {
            setFields(e);
        });

        //use the method reference operator :: for the event handler
        //this::setFields is the setFields method in this class
      
    }

    public void setFields(ActionEvent e) { //allows user to press enter in the text field to submit
        System.out.println(e);
        Word wordtoScore = new Word(wordField.getText(), scrabbleset);
        scoreLabel.setText("Word: " + wordField.getText() + " " + "Score: "  + wordtoScore.getScore());

    }
}



   // }
        
//}


