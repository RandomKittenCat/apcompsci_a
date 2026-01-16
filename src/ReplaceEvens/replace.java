package ReplaceEvens;
import java.util.ArrayList;

public class replace {
    public static void main(String[] args){
        ArrayList<Integer> t = new ArrayList<>();
        t.add(7);
        t.add(12);
        t.add(3);
        t.add(9);
        t.add(4);
        t.add(888);
        replace(t);
        System.out.println(t.toString());
    }

    // replace method = every even number is replaced with the closest previous odd number
    public static void replace(ArrayList<Integer> a){
        int lastodd = 0;
        for (int i = 0; i < a.size(); i++){
            if (a.get(i) % 2 != 0){
                lastodd = a.get(i);
            }else{
                a.set(i, lastodd);
            }
        }
    }
}