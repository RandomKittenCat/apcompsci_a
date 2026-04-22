package GameScoreboard;

public class Scoreboard {
    private String team1;
    private int score1;
    private String team2;
    private int score2;

    private boolean teamone = true;

    public Scoreboard(String team1, String team2){
        this.team1 = team1;
        this.team2 = team2;
    }

    public void recordPlay(int points){
        if (points >= 1){
            if (teamone){
                score1+= points;
            }else{
                score2+= points;
            }
        }else{
            teamone = !teamone;
        }
    }

    public String getScore(){
        if (teamone){
            return score1 + "-" + score2 + "-" + team1;
        }else{
            return score1 + "-" + score2 + "-" + team2;
        }
        
    }
}