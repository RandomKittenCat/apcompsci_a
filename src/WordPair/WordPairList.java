package WordPair;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words){
        allPairs = new ArrayList<WordPair>();

        for(int i=0; i<words.length; i++){
            for(int j=i+1; j<words.length; j++){
                WordPair pair = new WordPair(words[i], words[j]);
                allPairs.add(pair);
            }
        }
    }

    public int numMatches(){
        int matches = 0;

        for(WordPair p : allPairs){
            if (p.getFirst().equals(p.getSecond())){
                matches++;
            }
        }
        return matches;
    }
}
