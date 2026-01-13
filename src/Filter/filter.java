package Filter;
import java.util.ArrayList;

public class filter {
    public static void filter(ArrayList<String> a){
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).length() <= 2){
                a.remove(i);
                i--;
            }
        }
    }
}