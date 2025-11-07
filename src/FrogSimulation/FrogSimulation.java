package FrogSimulation;

public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops){
        goalDistance=dist;
        maxHops=numHops;
    }

    private int hopDistance(){ /* implementation not shown */ }

    public boolean simulate(){
        int pos = 0;

        for (int i = 0; i < maxHops; i++){
            pos+=hopDistance();

            if (pos >= goalDistance){
                return true; // reached goal
            }
            if(pos < 0){
                return false; // went under 0
            }
        }
        return false; // used all hops
    }

    public double runSimulations(int num){
        int success = 0;

        for (int i = 0; i < num; i++){
            if (simulate()){
                success++;
            }
        }
        return (double) success / num;
    }
}