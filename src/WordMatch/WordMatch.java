package WordMatch;

public class WordMatch {
    private String secret;

    public WordMatch(String word){
        /* implementation not shown */
    }

    public int scoreGuess(String guess){
        int occurences = 0;
        int lastIndex = 0;

        while(lastIndex+guess.length() <= secret.length()){
            String sub = secret.substring(lastIndex, guess.length()+lastIndex);
            lastIndex++;
            if(sub.equals(guess)){
                occurences++;
            }
        }

        return occurences*guess.length()*guess.length();
    }

    public String findBetterGuess(String guess1, String guess2){
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);

        if (score1 == score2){
            if(guess1.compareTo(guess2) > 0){
                return guess1;
            }else{
                return guess2;
            }
        }else{
            if(score1>score2){
                return guess1;
            }else{
                return guess2;
            }
        }
    }

}