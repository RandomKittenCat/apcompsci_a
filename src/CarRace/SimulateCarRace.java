package CarRace;

public class SimulateCarRace {
    private RaceCar carOne;
    private RaceCar carTwo;

    public String findWinner(int numLaps){
        double onetotal = 0.0;
        double twototal = 0.0;

        for (int i = 0; i<numLaps; i++){
            onetotal += carOne.getLapTime(i+1);
            twototal += carTwo.getLapTime(i+1);
        }

        if (onetotal == twototal){
            return "Tie!";
        }else if (onetotal > twototal){
            return "Car 1 wins!";
        }else{
            return "Car 2 wins!";
        }
    }

    public String shortenMessage(String message, String str){
        int len = str.length();
        String result = "";
        int i = 0;

        while (i < message.length()){
            if (i <= message.length() - len && message.substring(i, i + len).equals(str)) {
                i+=len;
            }else{
                result += message.substring(i, i + 1);
                i++;
            }
        }
        return result;
    }
}
