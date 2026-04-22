package WordChecker;
import java.util.ArrayList;

public class WordChecker {
    private ArrayList<String> wordList;

    public boolean isWordChain(){
        for (int i = 1; i < wordList.size(); i++){
            String currWord = wordList.get(i);
            String prevWord = wordList.get(i-1);
            
            if (!currWord.contains(prevWord)){
                return false;
            }
        }   
    return true;
    }

    public ArrayList<String> createList(String target){
        ArrayList<String> ret = new ArrayList<>();

        for (String word : wordList){
            if (word.indexOf(target) == 0){
                ret.add(word.substring(target.length()));
            }
        }
        return ret;
    }
}