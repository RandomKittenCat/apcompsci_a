package LapTracker;

public class LapTracker {
    private int laps;
    private int limit;
    private int count;

    public LapTracker(int limit){
        this.limit = limit;
    }

    public int addLaps(int addlaps){
        count++;
        if(count > limit){
            laps = 0;
            count = 1;
        }

        laps+=addlaps;

        return laps;
    }
}