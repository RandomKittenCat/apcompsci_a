package CandyBox;

public class BoxOfCandy {
    private Candy[][] box;

    public boolean moveCandyToFirstRow(int col){
        if (box[0][col] != null){
            return true;
        }
        for (int row = 1; row < box.length; row++){
            if (!(box[row][col] == null)){
                box[0][col] = box[row][col];
                box[row][col] = null;
                return true;
            }
        }
        return false;
    }

    public Candy removeNextByFlavor(String flavor){
        for (int row = box.length-1; row >= 0; row--){
            for (int col = 0; col < box[row].length; col++){
                if (box[row][col] != null && flavor.equals(box[row][col].getFlavor())){
                    Candy retcandy = box[row][col];
                    box[row][col] = null;
                    return retcandy;
                }
            }
        }
        return null;
    }
}