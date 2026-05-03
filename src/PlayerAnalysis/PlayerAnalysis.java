package PlayerAnalysis;
import java.util.ArrayList;

public class PlayerAnalysis {
    private ArrayList<Player> playerList;
    
    public String playerWithClosestScore(int targetScore){
        Player closest = playerList.get(0);

        for(Player p : playerList){
            double diff = Math.abs(p.getScore()-targetScore);
            double closestdiff = Math.abs(closest.getScore()-targetScore);
            if (diff < closestdiff){
                closest = p;
            }
        }

        return closest.getID();
    }
}