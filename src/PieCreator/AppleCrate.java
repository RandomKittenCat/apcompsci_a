package PieCreator;

public class AppleCrate {
    private Apple[][] apples;

    /**
     * Returns the number of pies that can be made from the 2D array apples
     * if each pie requires poundsPerPie pounds of apples. If an apple is
     * rotten, it cannot be used in a pie, nor can any adjacent apple.
     * Preconditions: apples has at least two rows and at least two columns.
     *                  No elements in apples are null.
     */
    public int numberOfPies(double poundsPerPie){
        double usableWeight = 0.0;

        for (int row = 0; row < apples.length; row++){
            for (int col = 0; col < apples[row].length; col++){
                boolean isRuined = apples[row][col].isRotten();

                // checking above
                if (!isRuined && row > 0 && apples[row - 1][col].isRotten()) {
                    isRuined = true;
                }

                // checking below
                if (!isRuined && row < apples.length - 1 && apples[row + 1][col].isRotten()) {
                    isRuined = true;
                }

                // checking left
                if (!isRuined && col > 0 && apples[row][col - 1].isRotten()) {
                    isRuined = true;
                }

                // checking right
                if (!isRuined && col < apples[row].length - 1 && apples[row][col + 1].isRotten()) {
                    isRuined = true;
                }

                if(!isRuined){
                    usableWeight += apples[row][col].getWeight();
                }
            }
        }
        return (int) (usableWeight/poundsPerPie);
    }
}