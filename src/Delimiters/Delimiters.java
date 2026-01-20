package Delimiters;
import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close){
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens){
        ArrayList<String> delims = new ArrayList<String>();
        for(String s : tokens){
            if(s.equals(openDel) || s.equals(closeDel)){
                delims.add(s);
            }
        }
        return delims;
    }

    public boolean isBalanced(ArrayList<String> delimeters){
        int balance = 0;

        for(String s : delimeters){
            if(s.equals(openDel)){
                balance++;
            }else if (s.equals(closeDel)){
                balance--;
            }

            if(balance < 0){
                return false;
            }
        }
        return (balance==0);
    }
}