package Digits;

import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num){
        digitList = new ArrayList<Integer>();
        String numstr = num + "";

        for(int i=0; i < numstr.length(); i++){
            digitList.add(Integer.parseInt(numstr.substring(i, i+1)));
        }
    }

    public boolean isStrictlyIncreasing(){
        for (int i=0; i < digitList.size()-1; i++){
            if(digitList.get(i) >= digitList.get(i+1)){
                return false;
            }
        }
        return true;
    }
}
