package PositionMethods;

public class Position {

    private int r;
    private int c;

    public Position(int r, int c) {

        this.r = r;
        this.c = c;
    }


    // extra
    public String toString() {

        return "Row: " + r + " Col: " + c;
    }
}