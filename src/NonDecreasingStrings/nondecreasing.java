package NonDecreasingStrings;
import java.util.ArrayList;

public class nondecreasing {
    public static boolean nondecreasing(ArrayList<String> strs){
        for(int i = 0; i < strs.size()-1; i++){
            if(strs.get(i+1).compareTo(strs.get(i)) < 0){
                return false;
            }
        }
        return true;
    }
}