package Hailstone;

public class Hailstone {

    public static int hailstoneLength(int n){
        int length = 1;

        while (n != 1){
            if (n % 2 == 0){
                n = n/2;
            }else{
                n = (3*n)+1;
            }

            length++;
        }

        return length;
    }

    public static boolean isLongSeq(int n){
        return hailstoneLength(n)>n;
    }

    public static double propLong(int n){
        int longcount = 0;

        for (int runs = 1; runs <= n; runs++){
            if (isLongSeq(runs)){
                longcount++;
            }
        }

        return (double) longcount / n;
    }
}