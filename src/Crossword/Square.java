package Crossword;

public class Square {

    private boolean isBlack;
    private int num;

    public Square(boolean isBlack, int num) {

        this.isBlack = isBlack;
        this.num = num;
    }

    // Extra
    public String toString() {

        return "Is Black: " + isBlack + " Num: " + num;
    }
}