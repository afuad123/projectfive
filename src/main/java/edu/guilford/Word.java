package edu.guilford;

import java.util.Random;
import java.util.Scanner;
/**This is a class definition file for the "Word" class which defines a word object
 * @author: A. Fuad
 * @version: 2/6/2024
 * 
 */

public class Word implements Comparable<Word> {
    //ATTRIBUTES
    
    /** 
     * String attribute that stores a word
     *  */
    private String word;
    /**
     * ScrabbleSet attribute that stores the scrabbleset used along with word
     *  */
    private ScrabbleSet scrabbleSet = new ScrabbleSet("English");

    //CONSTRUCTORS
    /** 
     * Constructor that creates the default word object
     * @param word: a string that stores the word
     * @param scrabbleSet: a ScrabbleSet object that stores the scrabbleset used along with word
     * */
    public Word(String word, ScrabbleSet scrabbleSet) {
        this.word = word;
        this.scrabbleSet = scrabbleSet;
    }

    /**
     * A constructor that generates a  String of random length 3-12 characters and with randomly determined characters
     * */
    public Word() {
        //read through the words.txt  file and select a random word from the file that is at least 2 characters long but no greater than 13 characters long.
        String filePath = "edu/guilford/words.txt";
        String word = "";
        try {
            Scanner scanner = new Scanner(ScrabbleFXDriver.class.getResourceAsStream("/" + filePath));
            Random random = new Random();
            int lineNum = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineNum++;
                if (line.length() >= 2 && line.length() <= 13) {
                    if (random.nextInt(lineNum) == 0) {
                        word = line;
                    }
                }
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.word = word;
    }

    //METHODS
    /**
     * A method that return the Scrabble score of the word using the Scrabbleset
     * @return the score of the word
     * */
    public int getScore() {
        return scrabbleSet.getWordScore(word);
    }
    //make a getWord getter
    /**
     * A method that returns the word
     * @return the word
     * */
    public String getWord() {
        return word; 
    }
    /** 
     * A compareTo method that returns 0 if two words are identical, 
     * returns one if otherWord has a smaller score than the current Word, 
     * and returns -1 if otherWord has a larger score than the current Word.
     * @param otherWord: the other word to compare the current word to
     * @return a value of -1 or 1*/
    public int compareTo(Word otherWord) {
        if (this.getScore() == otherWord.getScore()) {
            //return the value of the compareTo method from String, comparing the String attributes of each Word.
            return this.word.compareTo(otherWord.word);
        } else if (this.getScore() > otherWord.getScore()) {
            return 1;
        } else {
            return -1;
        }
    }

    /**
     * A method that returns the word and its score in a string format
     * @return a string of the word and its score
    */
    @Override
    public String toString() {
        return "Word: " + word + ", Score: " + getScore();
    }


}
