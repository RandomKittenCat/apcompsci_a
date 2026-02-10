package MaxRange;

public class MaxRange {
    int[][] ints;

    public MaxRange(int[][] given){
        ints = new int[given.length][given[0].length];

        for(int row=0;row<given.length;row++){
            for(int col=0;col<given[0].length;col++){

                ints[row][col]=given[row][col];
            }
        }
    }

    public int max(int[] arr){
        int maxval = arr[0];

        for(int i : arr){
                if(maxval<i){
                    maxval = i;
                }
            }
        return maxval;
    }

    public int min(int[] arr){
        int minval = arr[0];

        for(int i : arr){
            if(minval>i){
                minval = i;
            }
        }
        return minval;
    }

    public int maxRange() {
        int maxrange = max(ints[0]) - min(ints[0]);

        for (int row = 1; row < ints.length; row++) {
            int range = max(ints[row]) - min(ints[row]);
            if(range>maxrange){
                maxrange=range;
            }
        }
        return maxrange;
    }
}