package Notes.jan272026;

public class TwoDArrays {
    public static void main(String[] args){

        int[][] arr2D = new int[3][3];
        int[][] arr2DAlt = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

    }

    public static int countEvents(int[][] arr2D){
        int count = 0;

        for (int row = 0; row < arr2D.length; row++){
            for(int col = 0; col < arr2D[0].length; col++){
                if(arr2D[row][col] % 2 == 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static int countEvensAlt(int[][] arr2D){
        int count = 0;

        for(int[] row : arr2D){
            for(int col : row){
                if (col%2==0){
                    count++;
                }
            }
        }
        return count;
    }
}
