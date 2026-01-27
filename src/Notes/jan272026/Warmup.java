package Notes.jan272026;

public class Warmup {
    public static void main(String[] args){

    }

    public static boolean isPrime(int value){
        int factors = 0, factor = 1;
        while (factor<= value){
            if(value % factor == 0){
                factors++;
            }
            factor++;
        }
        return (factors==2);
    }

    public static int countPrimes(int[] arr){
        int count = 0;

        for(int v : arr){
            if(isPrime(v)){
                count++;
            }
        }
        return count;
    }
}
