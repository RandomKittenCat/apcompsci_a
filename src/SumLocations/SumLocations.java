package SumLocations;
import java.util.ArrayList;

public class SumLocations {

    public static void main(String[] args) {

        int[][] arr2D = {{5, 7, 12, 1, 7},
                {2, -3, 0, 5, 1},
                {10, -9, 7, 2, 1},
                {-7, 2, -11, 1, 5}};

        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(10,1));
        locations.add(new Location(0, 3));
        locations.add(new Location(0, 4));
        locations.add(new Location(1, 0));
        locations.add(new Location(1, 2));
        locations.add(new Location(4, 5));
        locations.add(new Location(2, 2));
        locations.add(new Location(3, 0));
        locations.add(new Location(3, 2));
        locations.add(new Location(3, 4));
        locations.add(new Location(4, 5));

        int sum = sumLocations(arr2D, locations);

        System.out.println("The sum of the locations is: " + sum);
    }

    public static int sumLocations(int[][] arr2D, ArrayList<Location> locations) {
        int sum = 0;
        for(Location l: locations) {
            int row = l.getRow();
            int col = l.getCol();

            if (row >= 0 && row < arr2D.length) {
                if (col >= 0 && col < arr2D[row].length) {
                    sum += arr2D[row][col];
                }
            }
        }
        return sum;
    }
}