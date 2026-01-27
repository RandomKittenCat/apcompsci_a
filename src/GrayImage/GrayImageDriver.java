package GrayImage;

public class GrayImageDriver {

    public static void main(String[] args) {

        int[][] countWhiteArray = {{255, 184, 178, 84, 129},
                {84, 255, 255, 130, 84},
                {78, 255, 0, 0, 78},
                {84, 130, 255, 130, 84}};

        final int WHITE_COUNT_EXPECTED = 5;

        GrayImage gi = new GrayImage(countWhiteArray);

        if(gi.countWhitePixels() == WHITE_COUNT_EXPECTED) {

            System.out.println("countWhitePixels works.");
        } else {

            System.out.println("countWhitePixels does not work.");
        }

        int[][] beforeProcessImageArray = {{221, 184, 178, 84, 135},
                {84, 255, 255, 130, 84},
                {78, 255, 0, 0, 78},
                {84, 130, 255, 130, 84}};

        int[][] afterProcessImageArray = {{221, 184, 100, 84, 135},
                {0, 125, 171, 130, 84},
                {78, 255, 0, 0, 78},
                {84, 130, 255, 130, 84}};

        GrayImage gi2 = new GrayImage(beforeProcessImageArray);

        gi2.processImage();

        if(equal(gi2.getArray(), afterProcessImageArray)) {

            System.out.println("Looks like processImage is working.");
        } else {

            System.out.println("Something is wrong with processImage.");
        }
    }

    public static boolean equal(int[][] a1, int[][] a2) {

        if(a1.length != a2.length || a1[0].length != a2[0].length) return false;

        for(int row = 0; row < a1.length; row++) {

            for(int col = 0; col < a1[0].length; col++) {

                if(a1[row][col] != a2[row][col]) return false;
            }
        }

        return true;
    }
}
