package edu.guilford;

import java.util.ArrayList;
import java.util.Random;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TileList extends ArrayList<Tile> {
    private Random rand = new Random();
    private int width;
    private int height;
    private double x;
    private double y;

    public TileList(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void generateTiles(char letter) {
        this.clear();
        if ("?!,'-./;".indexOf(letter) != -1) {
            Rectangle rectangle = new Rectangle(width, height);
            rectangle.setStroke(Color.BLACK);
            rectangle.setStrokeWidth(5);
            rectangle.setFill(Color.BLACK);
            rectangle.setX(x);
            rectangle.setY(y);
        }     
        else {
            if ("AEIOULNRST".indexOf(letter) != -1) {
                Rectangle rectangle = new Rectangle(width, height);
                rectangle.setStroke(Color.RED);
                rectangle.setStrokeWidth(5);
                rectangle.setFill(Color.RED);
                rectangle.setX(x);
                rectangle.setY(y);
            } else if ("DG".indexOf(letter) != -1) {
                Rectangle rectangle = new Rectangle(width, height);
                rectangle.setStroke(Color.ORANGE);
                rectangle.setStrokeWidth(5);
                rectangle.setFill(Color.ORANGE);
                rectangle.setX(x);
                rectangle.setY(y);
            } else if ("BCMP".indexOf(letter) != -1) {
                Rectangle rectangle = new Rectangle(width, height);
                rectangle.setStroke(Color.GOLD);
                rectangle.setStrokeWidth(5);
                rectangle.setFill(Color.GOLD);
                rectangle.setX(x);
                rectangle.setY(y);
            } else if ("FHVWY".indexOf(letter) != -1) {
                Rectangle rectangle = new Rectangle(width, height);
                rectangle.setStroke(Color.GREEN);
                rectangle.setStrokeWidth(5);
                rectangle.setFill(Color.GREEN);
                rectangle.setX(x);
                rectangle.setY(y);
            } else if ("K".indexOf(letter) != -1) {
                Rectangle rectangle = new Rectangle(width, height);
                rectangle.setStroke(Color.CYAN);
                rectangle.setStrokeWidth(5);
                rectangle.setFill(Color.CYAN);
                rectangle.setX(x);
                rectangle.setY(y);
            } else if ("JX".indexOf(letter) != -1) {
                Rectangle rectangle = new Rectangle(width, height);
                rectangle.setStroke(Color.BLUE);
                rectangle.setStrokeWidth(5);
                rectangle.setFill(Color.BLUE);
                rectangle.setX(x);
                rectangle.setY(y);
            } else if ("QZ".indexOf(letter) != -1) {
                Rectangle rectangle = new Rectangle(width, height);
                rectangle.setStroke(Color.MAGENTA);
                rectangle.setStrokeWidth(5);
                rectangle.setFill(Color.MAGENTA);
                rectangle.setX(x);
                rectangle.setY(y);
            }
            else if (" ".indexOf(letter) != -1) {
                Rectangle rectangle = new Rectangle(width, height);
                rectangle.setStroke(Color.WHITE);
                rectangle.setStrokeWidth(5);
                rectangle.setFill(Color.WHITE);
                rectangle.setX(x);
                rectangle.setY(y);
            }
           
        }
}

}
