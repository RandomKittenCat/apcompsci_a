package StepTrackerClass;

public class StepTracker {
    private int activeDays;
    private int normDays;
    private int total_steps;
    private int min_steps;

    public StepTracker(int min_steps){
        this.min_steps=min_steps;
    }

    public void addDailySteps(int steps){
        total_steps+=steps;
        normDays++;
        if (steps >= min_steps) {
            activeDays++;
        }
    }

    public int activeDays(){
        return activeDays;
    }

    public double averageSteps(){
        return (double) total_steps / (double) normDays;
    }



}
