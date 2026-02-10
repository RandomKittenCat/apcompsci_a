package ArrayTester;

public class ArrayTester {

    public static int[] getColumn(int[][] arr2D, int c) {
        int[] result = new int[arr2D.length];
        for (int row=0;row<arr2D.length;row++){
            result[row] = arr2D[row][c];
        }
        return result;
    }

    public static boolean isLatin(int[][] square) {
        if (containsDuplicates(square[0])) {
            return false;
        }

        for (int r = 1; r < square.length; r++) {
            if (!hasAllValues(square[0], square[r])) {
                return false;
            }
        }

        for (int c = 0; c < square[0].length; c++) {
            int[] col = getColumn(square, c);
            if (!hasAllValues(square[0], col)) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasAllValues(int[] arr1, int[] arr2) {

        for(int i = 0; i < arr1.length; i++) {

            if(indexOf(arr2, arr1[i]) == -1) {

                return false;
            }
        }

        return true;
    }

    public static int indexOf(int[] arr, int key) {

        int returnValue = -1;

        for(int i = 0; i < arr.length; i++) {

            if(key == arr[i]) {

                returnValue = i;
                break;
            }
        }

        return returnValue;
    }

    public static boolean containsDuplicates(int[] arr) {

        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] == arr[j]) {

                    return true;
                }
            }
        }

        return false;
    }
}