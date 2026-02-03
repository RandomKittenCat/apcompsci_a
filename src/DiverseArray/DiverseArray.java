package DiverseArray;

public class DiverseArray {

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i : arr){
            sum+=i;
        }
        return sum;
    }

    public static int[] rowSums(int[][] arr2D) {
        int[] sums = new int[arr2D.length];
        int count = 0;

        for(int[] arr : arr2D) {
            sums[count] = arraySum(arr);
            count++;
        }
        return sums;
    }

    public static boolean isDiverse(int[][] arr2D) {
        int[] a = rowSums(arr2D);
        for(int i=0; i<a.length; i++){
            for(int b=i+1; b<a.length; b++){
                if(a[i] == a[b]){
                    return false;
                }
            }
        }
        return true;
    }
}