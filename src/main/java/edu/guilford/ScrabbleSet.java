package edu.guilford;

import java.util.Arrays;
import java.util.Random;

/**
 * This is a class definition file for the "ScrabbleSet" class which defines a ScrabbleSet object.
 * @author A. Fuad
 * @version 2/7/24
 
 */

public class ScrabbleSet {
    Random rand = new Random();
    //ATTRIBUTES
    /**Instantiates a list of Tile objects for the letters and the blank tile.*/
    private Tile[] tiles;

    /**Instantiates a list that provides a count of each letter in the Scrabble set*/
    private int[] letterCount;

    //CONSTRUCTORS
    /**Builds a ScrabbleSet object specified by language.
     * @param language the language of the ScrabbleSet; default English
    */
    public ScrabbleSet(String language) {
        tiles = new Tile[27];
        //if the language is English
        if (language.equals("English") || language.equals("english")) {
            //instantiate a Tile object for each letter in the English Scrabble set
            tiles[0] = new Tile(' ', 0);
            tiles[1] = new Tile('A', 1);
            tiles[2] = new Tile('B', 3);
            tiles[3] = new Tile('C', 3);
            tiles[4] = new Tile('D', 2);
            tiles[5] = new Tile('E', 1);
            tiles[6] = new Tile('F', 4);
            tiles[7] = new Tile('G', 2);
            tiles[8] = new Tile('H', 4);
            tiles[9] = new Tile('I', 1);
            tiles[10] = new Tile('J', 8);
            tiles[11] = new Tile('K', 5);
            tiles[12] = new Tile('L', 1);
            tiles[13] = new Tile('M', 3);
            tiles[14] = new Tile('N', 1);
            tiles[15] = new Tile('O', 1);
            tiles[16] = new Tile('P', 3);
            tiles[17] = new Tile('Q', 10);
            tiles[18] = new Tile('R', 1);
            tiles[19] = new Tile('S', 1);
            tiles[20] = new Tile('T', 1);
            tiles[21] = new Tile('U', 1);
            tiles[22] = new Tile('V', 4);
            tiles[23] = new Tile('W', 4);
            tiles[24] = new Tile('X', 8);
            tiles[25] = new Tile('Y', 4);
            tiles[26] = new Tile('Z', 10);

            letterCount = new int[27];
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

        }
        else if (language.equals("Random") || language.equals("random")) {
        tiles = new Tile[27];
        //instantiate a Tile object for each letter in the English Scrabble set
        tiles[0] = new Tile(' ', 0);
        tiles[1] = new Tile('A', 1);
        tiles[2] = new Tile('B', 3);
        tiles[3] = new Tile('C', 3);
        tiles[4] = new Tile('D', 2);
        tiles[5] = new Tile('E', 1);
        tiles[6] = new Tile('F', 4);
        tiles[7] = new Tile('G', 2);
        tiles[8] = new Tile('H', 4);
        tiles[9] = new Tile('I', 1);
        tiles[10] = new Tile('J', 8);
        tiles[11] = new Tile('K', 5);
        tiles[12] = new Tile('L', 1);
        tiles[13] = new Tile('M', 3);
        tiles[14] = new Tile('N', 1);
        tiles[15] = new Tile('O', 1);
        tiles[16] = new Tile('P', 3);
        tiles[17] = new Tile('Q', 10);
        tiles[18] = new Tile('R', 1);
        tiles[19] = new Tile('S', 1);
        tiles[20] = new Tile('T', 1);
        tiles[21] = new Tile('U', 1);
        tiles[22] = new Tile('V', 4);
        tiles[23] = new Tile('W', 4);
        tiles[24] = new Tile('X', 8);
        tiles[25] = new Tile('Y', 4);
        tiles[26] = new Tile('Z', 10);

      
       letterCount = new int[27];
       //the number of each tile should be a random amount. the point value should be the same as a normal scrabble set
         for (int i = 0; i < letterCount.length; i++) {
              letterCount[i] = rand.nextInt(3) + 1;
        }  
        }
        //if the language is something else
        else {
            //System.out.println("Error: language not English");
        }
    }

    /**
     * Builds a ScrabbleSet object with the default language of English but a random amount of each letter.
     */
    public ScrabbleSet() {
        tiles = new Tile[27];
        //instantiate a Tile object for each letter in the English Scrabble set
        tiles[0] = new Tile(' ', 0);
        tiles[1] = new Tile('A', 1);
        tiles[2] = new Tile('B', 3);
        tiles[3] = new Tile('C', 3);
        tiles[4] = new Tile('D', 2);
        tiles[5] = new Tile('E', 1);
        tiles[6] = new Tile('F', 4);
        tiles[7] = new Tile('G', 2);
        tiles[8] = new Tile('H', 4);
        tiles[9] = new Tile('I', 1);
        tiles[10] = new Tile('J', 8);
        tiles[11] = new Tile('K', 5);
        tiles[12] = new Tile('L', 1);
        tiles[13] = new Tile('M', 3);
        tiles[14] = new Tile('N', 1);
        tiles[15] = new Tile('O', 1);
        tiles[16] = new Tile('P', 3);
        tiles[17] = new Tile('Q', 10);
        tiles[18] = new Tile('R', 1);
        tiles[19] = new Tile('S', 1);
        tiles[20] = new Tile('T', 1);
        tiles[21] = new Tile('U', 1);
        tiles[22] = new Tile('V', 4);
        tiles[23] = new Tile('W', 4);
        tiles[24] = new Tile('X', 8);
        tiles[25] = new Tile('Y', 4);
        tiles[26] = new Tile('Z', 10);

      
       letterCount = new int[27];
       //the number of each tile should be a random amount. the point value should be the same as a normal scrabble set
         for (int i = 0; i < letterCount.length; i++) {
              letterCount[i] = rand.nextInt(3) + 1;
        }  
       
    }

    //METHODS
    /**Returns a string representation of the ScrabbleSet object.
     * @return a string representation of the ScrabbleSet object
    */
    @Override
    public String toString() {
        return "ScrabbleSet [tiles=" + Arrays.toString(tiles) + ", letterCount="
                + Arrays.toString(letterCount) + "]";
    }
    
    /**Calculates the score of a word
     * @param word the word to calculate the score of
     * @return the score of the word
    */
    public int getWordScore(String word) {
        int score = 0;
        String upperWord = word.toUpperCase();
        
        int[] wordLetterCount = new int[27]; // Array to store the count of each letter in the word

        // Calculate the count of each letter in the word
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(upperWord.charAt(i))) {
                int index = upperWord.charAt(i) - 'A' + 1;
                wordLetterCount[index] += 1;
            }
        }

        // Check if the count of any letter in the word exceeds the count in the Scrabble set
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(upperWord.charAt(i))) {
                int index = upperWord.charAt(i) - 'A' + 1;
                if (wordLetterCount[index] > letterCount[index]) {
                    return -1; // More of a letter than is present in the Scrabble set
                }
            }
        }

        // for each letter in the word
        for (int i = 0; i < word.length(); i++) {
            // if the letter is not a letter
            char letter = Character.toUpperCase(upperWord.charAt(i));
            int scoreToAdd = 0;
            if ("?!,'-./;".indexOf(letter) != -1) {
                scoreToAdd += 0;} 
            else {
                if ("AEIOULNRST".indexOf(letter) != -1) {
                    scoreToAdd = 1;
                } else if ("DG".indexOf(letter) != -1) {
                    scoreToAdd = 2;
                } else if ("BCMP".indexOf(letter) != -1) {
                    scoreToAdd = 3;
                } else if ("FHVWY".indexOf(letter) != -1) {
                    scoreToAdd = 4;
                } else if ("K".indexOf(letter) != -1) {
                    scoreToAdd = 5;
                } else if ("JX".indexOf(letter) != -1) {
                    scoreToAdd = 8;
                } else if ("QZ".indexOf(letter) != -1) {
                    scoreToAdd = 10;
                }
                score += scoreToAdd;
            }
        }
            return score;
        
        }
}