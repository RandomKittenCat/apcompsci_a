package TwoD;

public class TwoDArraysDriver {
    public static void main(String[] args){
        boolean[][] calendar = {
            {true, false, false, false, false, false, false},
            {true, false, false, false, false, false, false},
            {true, true, false, false, false, false, false}
        };

        System.out.println(TwoDArrays.getAvailDays(calendar));
        System.out.println(TwoDArrays.getDaysOfWeek(calendar, "Monday"));
    }
}