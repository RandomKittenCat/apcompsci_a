package GrayImage;

public class GrayImage {

    public static final int BLACK = 0;
    public static final int WHITE = 255;

    private int[][] pixelValues;

    public GrayImage(int[][] pv) {

        pixelValues = pv;
    }

    public int[][] getArray() { return pixelValues; }

    public int countWhitePixels() {
        int count = 0;
        for (int[] x : pixelValues){
            for (int i : x){
                if (i == WHITE){
                    count++;
                }
            }
        }
        return count;
    }

    public void processImage() {
        for (int i = 0; i < pixelValues.length-2; i++){
            for (int j = 0; j < pixelValues[0].length-2; j++){
                if (pixelValues[i][j] - pixelValues[i+2][j+2] < BLACK){
                    pixelValues[i][j] = BLACK;
                }else{
                    pixelValues[i][j] = pixelValues[i][j] - pixelValues[i+2][j+2];
                }
            }
        }
    }
}
