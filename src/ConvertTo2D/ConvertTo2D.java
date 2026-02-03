package ConvertTo2D;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertTo2D {
    public static void main(String[] args){
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(5);
        ints.add(1);
        ints.add(3);
        ints.add(2);
        ints.add(7);
        ints.add(5);

        System.out.println(Arrays.deepToString(convert(ints, 3, 2)));
    }

    public static int[][] convert(ArrayList<Integer> arr, int rows, int cols){
        int[][] newarr = new int[rows][cols];
        int i = 0;

        for (int row = 0; row < rows; row++){
            for (int col = 0; col < cols; col++){
                newarr[row][col] = arr.get(i);
                i++;
            }
        }
        return newarr;
    }
}