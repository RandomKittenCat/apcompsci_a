package Stringto2D;

public class Stringto2D {
    public static String[][] create(String str, int rows, int cols){
        String[][] result = new String[rows][cols];
        int index = 0;

        for(int row = 0; row < result.length; row++){
            for(int col = 0; col < result[0].length; col++){
                if(index < str.length()){
                    result[row][col] = str.substring(index, index+1);
                    index++;
                }else{
                    result[row][col] = ".";
                }
            }
        }
        return result;
    }
}