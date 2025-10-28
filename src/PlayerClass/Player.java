package PlayerClass;

public class Player {
    private String name = "";
    private int score;
    private static int h_score;

    public Player(String name){
        this.name=name;
        score=0;
    }

    public void add(int addnum){
        if (addnum >= 0){
            score+=addnum;
            if (score > h_score){
                h_score = score;
            }
        }
    }

    public boolean winning(){
        return score == h_score;
    }

    public String toString(){
        return name + ": " + score;
    }

    public static int getHighScore(){
        return h_score;
    }

    public static void reset(){
        h_score = 0;
    }
}
