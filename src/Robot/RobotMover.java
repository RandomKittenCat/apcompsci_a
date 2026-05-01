package Robot;

public class RobotMover {
    private String moveSequence;

    public RobotMover(int numMoves){
        String currMove = "";

        for (int i = 0; i < numMoves; i++){
            int random = (int) (Math.random() * 4);

            if (random == 0){
                currMove += "up_";
            }else if (random == 1){
                currMove += "down_";
            }else if (random == 2){
                currMove += "left_";
            }else{
                currMove += "right_";
            }
        }
    }

    public int countOccurences(String str){
        int count = 0;
        int i = 0;

        while (i < moveSequence.length()){
            int index = moveSequence.indexOf(str, i);

            if (index >= 0){
                count++;
                i = index + str.length();
            }else{
                break;
            }
        }

        return count;
    }
    
}