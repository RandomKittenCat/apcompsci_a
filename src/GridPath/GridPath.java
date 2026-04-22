package GridPath;

public class GridPath {
    private int[][] grid;

    public Location getNextLoc(int row, int col){
        if (row == grid.length - 1){
            return new Location(row, col+1);
        } else if (col == grid[0].length - 1){
            return new Location(row+1, col);
        }else if (grid[row+1][col] > grid[row][col+1]){
            return new Location(row, col+1);
        }else{
            return new Location(row+1, col);
        }
    }

    public int sumPath(int row, int col){
        int sum = 0;

        while (row < grid.length-1 || col < grid[0].length -1){
            sum += grid[row][col];

            Location l = getNextLoc(row, col);
            row = l.getRow();
            col = l.getCol();
        }

        return sum + grid[row][col];
    }
}