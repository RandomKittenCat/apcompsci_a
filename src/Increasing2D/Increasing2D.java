package Increasing2D;

public class Increasing2D {
    public static void main(String[] args){

    }

    public static boolean increasing(int[][] arr){
        if(arr.length < 2) {
            return true;
        }
        for (int col = 0; col < arr[0].length; col++) {
            for (int row = 0; row < arr.length-1; row++) {
                if(arr[row][col] > arr[row+1][col]){
                    return false;
                }
            }
        }
        return true;
    }
}