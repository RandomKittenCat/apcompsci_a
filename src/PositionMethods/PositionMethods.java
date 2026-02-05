package PositionMethods;

public class PositionMethods {
    private static Position findPosition(int num, int[][] intArr) {
        for(int row = 0; row< intArr.length; row++){
            for(int col = 0; col <intArr[0].length; col++){
                if(intArr[row][col] == num){
                    Position pos = new Position(row,col);
                    return pos;
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] intArr) {
        int currentnum=0;
        Position[][] result = new Position[intArr.length][intArr[0].length];

        for(int row = 0; row< intArr.length; row++) {
            for (int col = 0; col < intArr[0].length; col++) {
                currentnum=intArr[row][col];
                if(findPosition(currentnum+1, intArr) !=null){
                    result[row][col] = findPosition(currentnum+1, intArr);
                }else{
                    result[row][col] = null;
                }
            }
        }
        return result;
    }
}