package Notes.jan62026;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListNotes {
    public static void main(String[] args){

        System.out.println(percentageIncreasing(10000000,10));

    }

    public static double percentageIncreasing(int trials, int size){
        ArrayList<Integer> li = new ArrayList<Integer>();

        int numIncreasing = 0;

        for(int i = 0; i < trials; i++){
            fillArray(li, size);
            if(isIncreasing(li)) numIncreasing++;

            li.clear(); // clears all elements inside array list, size is now 0
        }

        return (double) numIncreasing / trials;
    }

    public static boolean isIncreasing(ArrayList<Integer> l){
        for(int i = 0; i < l.size()-1; i++){
            if(l.get(i) > l.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public static void fillArray(ArrayList<Integer> l, int size){

        for(int i = 0; i<size; i++){
            l.add((int) (100 * Math.random()) + 1);
        }
    }
}
