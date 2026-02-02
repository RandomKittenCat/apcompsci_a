package SeatingChart;
import java.util.ArrayList;

public class SeatingChart {
    private Student[][] seats;

    public SeatingChart(ArrayList<Student> studentList, int rows, int cols) {
        seats = new Student[rows][cols];
        int arrayindex = 0;
        for (int row = 0; row<seats.length; row++){
            for (int col = 0; col<seats[0].length; col++){
                if (arrayindex < studentList.size()) {
                    seats[row][col] = studentList.get(arrayindex);
                    arrayindex++;
                }
            }
        }
    }

    public int removeAbsentStudents(int allowedAbsences) {
        int removed = 0;
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[0].length; col++) {
                if (seats[row][col] != null && seats[row][col].getAbsenceCount() > allowedAbsences){
                    seats[row][col] = null;
                    removed++;
                }
            }
        }
        return removed;
    }
}