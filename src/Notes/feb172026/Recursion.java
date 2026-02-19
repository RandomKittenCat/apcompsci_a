package Notes.feb172026;

// recursion is calling the method inside of itself to basically loop

public class Recursion {
    public static void main(String[] args){
        System.out.println(recurFactorial(5)); // returns 120
        recurString("hello",0); // returns hello
        recurString("hello", 2); // returns llo
        flipString("hello", 0); // returns olleh
        System.out.println(recur(5)); // returns 12
    }

    public static int recur(int n){
        if(n<=2) return 3;

        return (n-1) + recur(n-1);
    }

    public static void recurString(String s, int index){
        if(index==s.length()) return; // leave the method once index is too high

        System.out.println(s.substring(index, index+1));
        recurString(s, index+1);
    }

    public static void flipString(String s, int index){
        if(index==s.length()) return; // leave the method once index is too high

        flipString(s, index+1); // swapping the lines prints it in reverse

        System.out.println(s.substring(index, index+1));
    }

    public static int recurFactorial(int n){
        if (n==1) return 1;

        return n * recurFactorial(n-1);
    }
}