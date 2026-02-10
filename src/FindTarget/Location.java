package FindTarget;

public class Location {

    private int row;
    private int col;

    public Location() {

        row = 0;
        col = 0;
    }

    public Location(int row, int col) {

        this.row = row;
        this.col = col;
    }

    public int getRow() {

        return row;
    }

    public int getCol() {

        return col;
    }

    public String toString() {

        return "(" + row + ", " + col + ")";
    }
}