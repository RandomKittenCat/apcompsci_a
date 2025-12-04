package codewars.SnakesLadders;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnakesLadders {
    public SnakesLadders() {
        SnakesLadders game = new SnakesLadders();
        assertEquals("Player 1 is on square 38", game.play(1, 1));
        assertEquals("Player 1 is on square 44", game.play(1, 5));
        assertEquals("Player 2 is on square 31", game.play(6, 2));
        assertEquals("Player 1 is on square 25", game.play(1, 1));
    }

    private boolean pl1 = true;

    public String play(int die1, int die2) {
        int[] board = {
                0, 36, 0, 0, 0, 0, 7, 23, 0, 0, // 1-10
                0, 0, 0, 0, 11, -10, 0, 0, 0, 0, // 11-20
                21, 0, 0, 0, 0, 0, 0, 56, 0, 0, // 21-30
                0, 0, 0, 0, 0, 0, 8, 0, 0, 0, // 31-40
                0, 0, 0, 0, 0, -21, 0, 0, -38, 0, // 41-50
                16, 0, 0, 0, 0, 0, 0, 0, 0, 0, // 51-60
                0, -43, 0, -4, 0, 0, 0, 0, 0, 0, // 61-70
                20, 0, 0, -21, 0, 0, 0, 20, 0, 0, // 71-80
                0, 0, 0, 0, 0, 0, 7, 0, -21, 0, // 81-90
                0, -4, 0, 0, -20, 0, 0, 0, -19, 0 // 91-100
        };

        if (die1==die2){
            return ""; // same player goes again
        }


        int spot = 1;
        int sumdice = die1+die2;

        spot+=(sumdice+board[sumdice-1]);
        pl1 = !pl1;


        /* if they reach spot 100, current player should win
        if they go past, they need to go back the number of spaces they had left in their roll */
        if (spot == 100){
            return "Player n Wins!"; //replace n with 1/2
        }else if (spot > 100) {

        }
    }
}