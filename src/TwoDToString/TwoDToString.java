package TwoDToString;

public class TwoDToString {
    public static void main(String[] args){
        int[][] array = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        System.out.println(convertToString(array)); // 987654321
    }

    public static String convertToString(int[][] arr){
        String result = "";
        for (int[] row : arr){
            for (int col : row){
                result+=""+col;
            }
        }
        return result;
    }
}
