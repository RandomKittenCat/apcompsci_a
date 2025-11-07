package APCalendar;

public class APCalendar {

    private static boolean isLeapYear(int year){
        /* implementation not shown */
    }

    public static int numberOfLeapYears(int year1, int year2){
        int leapyears = 0;
        for (; year1 <= year2; year1++){
            if(isLeapYear(year1)){
                leapyears++;
            }
        }
        return leapyears;
    }

    private static int firstDayOfYear(int year){
        /* implementation not shown */
    }

    private static int dayOfYear(int month, int day, int year){
        /* implementation not shown */
    }

    public static int dayOfWeek(int month, int day, int year){
        int firstday = firstDayOfYear(year);
        int dayofinput = dayOfYear(month, day, year);
        return (firstday + dayofinput -1)%7;
    }
}