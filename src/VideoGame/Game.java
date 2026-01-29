package VideoGame;

public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    public Game(){
        // not shown
    }

    public boolean isBonus(){
        // not shown
        return false;
    }

    public void play(){
        // not shown
    }

    public int getScore(){
        int score = 0;
        if (levelOne.goalReached()){
            score += levelOne.getPoints();
        }
        if(levelTwo.goalReached()){
            score += levelTwo.getPoints();
        }
        if(levelThree.goalReached()){
            score += levelThree.getPoints();
        }
        if(isBonus()){
            score *= 3;
        }
        return score;
    }

    public int playManyTimes(int num){
        int topscore = 0;
        while (num>0){
            play();
            if (getScore() > topscore){
                topscore = getScore();
            }
            num--;
        }
        return topscore;
    }
}