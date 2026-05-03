package LapTracker;

public class LapDriver {
    public static void main(String[] args){
        int count;

        LapTracker amy = new LapTracker(3);
        count = amy.addLaps(8);
        count = amy.addLaps(12);
        System.out.println(count); //20
        count = amy.addLaps(10);
        System.out.println(count); //30

        count = amy.addLaps(11);
        System.out.println(count); //11
        
    }
    
}
