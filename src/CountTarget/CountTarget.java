package CountTarget;

public class CountTarget {
    public static void main(String[] args){
        int[][] nums = {
                {1, 2, 3},
                {4, 2, 2},
                {5, 6, 2}
        };

        System.out.println(count(nums, 2)); // should be 4
    }

    public static int count(int[][] array, int target){
        int count = 0;
        for(int[] x : array){
            for(int i : x){
                if (i==target){
                    count++;
                }
            }
        }
        return count;
    }
}
