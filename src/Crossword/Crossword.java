package Crossword;

public class Crossword {
    private Square[][] puzzle;

    public Crossword(boolean[][] blackSquares){
        puzzle = new Square[blackSquares.length][blackSquares[0].length];
        int currentnum=1;

        for(int row = 0; row< puzzle.length; row++){
            for(int col = 0; col <puzzle[0].length; col++){
                if (toBeLabeled(row,col,blackSquares)){
                    puzzle[row][col] = new Square(blackSquares[row][col], currentnum);
                    currentnum++;
                }else{
                    puzzle[row][col] = new Square(blackSquares[row][col], 0);
                }
            }
        }
    }

    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
        if (blackSquares[r][c]) {
            return false;
        }

        if (r == 0 || blackSquares[r - 1][c]) {
            return true;
        }

        if (c == 0 || blackSquares[r][c - 1]) {
            return true;
        }

        return false;
    }
}