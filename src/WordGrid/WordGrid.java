package WordGrid;

public class WordGrid {
    private String[][] grid;

    public int countOrderedRows(){
        int count = 0;

        for (String[] row : grid){
            boolean isOrdered = true;

            for (int i = 1; i < row.length; i++){
                int lastlen = row[i-1].length();
                if (row[i].length() < lastlen){
                    isOrdered = false;
                }
            }

            if (isOrdered){
                count++;
            }
        }

        return count;
    }
}