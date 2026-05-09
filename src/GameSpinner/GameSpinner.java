package GameSpinner;

public class GameSpinner {
    private int sects;
    private int lastnum;
    private int streak;
    
    public GameSpinner(int sectors){
        sects = sectors;
        lastnum = 0;
        streak = 0;
    }

    public int spin(){
        int spin = (int) (Math.random() * sects + 1);
        if (spin == lastnum){
            streak++;
        }else{
            streak = 1;
        }
        lastnum = spin;
        return spin;
    }

    public int currentRun(){
        return streak;
    }
}