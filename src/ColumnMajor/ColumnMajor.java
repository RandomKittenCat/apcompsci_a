package ColumnMajor;

public class ColumnMajor {
    public static void main(String[] args){
        String[][] strings = {{"A", "B", "C"}, {"D", "E", "F"}};

        System.out.println(colMajor(strings)); // ADBECF
    }

    public static String colMajor(String[][] s){
        String result = "";

        for (int col = 0; col < s[0].length; col++) {
            for (int row = 0; row < s.length; row++) {
                result+=s[row][col];
            }
        }
        return result;
    }
}