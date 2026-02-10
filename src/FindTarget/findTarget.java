package FindTarget;

public class findTarget {
    public static void main(String[] args){
        int[][] ints = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        System.out.println(find(ints, 6)); //should be (1, 1)
    }

    public static Location find(int[][] ints, int target){

        for(int row=0;row<ints.length;row++){
            for(int col=0;col<ints[0].length;col++){
                if(ints[row][col] == target){
                    return new Location(row,col);
                }
            }
        }
        return null;
    }
}