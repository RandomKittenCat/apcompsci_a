package Feeder;

public class Feeder {
    private int currentFood;

    public void simulateOneDay(int numBirds){
        if ((int)(Math.random() * 100) < 95){
            int gramsPerBird = (int) (Math.random() * 41) + 10;
            int totalEaten = gramsPerBird * numBirds;

            if (totalEaten > currentFood) {
                currentFood = 0;
            } else {
                currentFood -= totalEaten;
            }
        }else{
            currentFood = 0;
        }
    }

    public int simulateManyDays(int numBirds, int numDays){
        int daysWithFood = 0;

        for (int d = 0; d < numDays; d++) {
            if (currentFood == 0) {
                return daysWithFood;
            }

            simulateOneDay(numBirds);
            daysWithFood++;
        }

        return daysWithFood;
    }
}