package ArrayResizer;

public class ArrayResizer {

	public static boolean isNonZeroRow(int[][] array2D, int r){
		for(int i : array2D[r]){
			if (i == 0){
				return false;
			}
		}
		return true;
	}

	public static int numNonZeroRows(int[][] array2D){
		// not shown
		return 0;
	}

	public static int[][] resize(int[][] array2D){
		int numRows = numNonZeroRows(array2D);
		int[][] result = new int[numRows][array2D[0].length];

		int copyindex = 0;
		for (int r = 0; r < array2D.length; r++){
			if (isNonZeroRow(array2D, r)){
				result[copyindex] = array2D[r];
				copyindex++;
			}
		}
		return result;
	}
}