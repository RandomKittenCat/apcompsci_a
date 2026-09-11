package TwoD;

public class TwoDArrays {
    private boolean[][] calendar;

    public static int getAvailDays(boolean[][] calendar){
        int days = 0;
        for (boolean[] arr : calendar){
            for (boolean i : arr){
                if (i){
                    days++;
                }
            }
        }
        return days;
    }

    public static int getDaysOfWeek(boolean[][] calendar, String dayName){
        int day = 0;
        int daycount =0;
        switch(dayName){
            case "Sunday":
                day = 0;
                break;
            case "Monday":
                day = 1;
                break;
            case "Tuesday":
                day = 2;
                break;
            case "Wednesday":
                day = 3;
                break;
            case "Thursday":
                day = 4;
                break;
            case "Friday":
                day = 5;
                break;
            case "Saturday":
                day = 6;
                break;
        }

        for (boolean[] arr : calendar){
            for (int i = 0; i < arr.length; i++){
                if (i == day){
                    if (arr[i]){
                        daycount++;
                    }
                }
            }
        }

        return daycount;
    }

    

}
