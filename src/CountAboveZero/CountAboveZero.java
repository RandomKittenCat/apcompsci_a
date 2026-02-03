package CountAboveZero;

public class CountAboveZero {
    public static void main(String[] args){
        int[][] arr = {{1,2,-3}, {-4,-5,6}};
        System.out.println(count(arr)); // 3
    }

    public static int count(int[][] arr){
        int num = 0;
        for(int[] r : arr){
            for(int i : r){
                if(i>0) num++;
            }
        }
        return num;
    }
}