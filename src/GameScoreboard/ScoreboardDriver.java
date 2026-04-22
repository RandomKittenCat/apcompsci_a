package GameScoreboard;

public class ScoreboardDriver {
    public static void main(String[] args){
        Scoreboard s = new Scoreboard("Blue", "Red");

        s.recordPlay(5);
        s.recordPlay(2);

        System.out.println(s.getScore());

        s.recordPlay(0);
        s.recordPlay(5);
        s.recordPlay(8);

        System.out.println(s.getScore());
    }
}