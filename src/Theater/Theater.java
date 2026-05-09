package Theater;

public class Theater {
    private Seat[][] theaterSeats;

    public Theater(int seatsPerRow, int tier1Rows, int tier2Rows){
        int totalrows = tier1Rows+tier2Rows;
        theaterSeats = new Seat[totalrows][seatsPerRow];

        for (int row = 0; row < tier1Rows ; row++){
            for (int col = 0; col < theaterSeats[0].length; col++){
                theaterSeats[row][col] = new Seat(true, 1);
            }
        }

        for (int row = tier1Rows; row < totalrows ; row++){
            for (int col = 0; col < theaterSeats[0].length; col++){
                theaterSeats[row][col] = new Seat(true, 2);
            }
        }
    }

    public boolean reassignSeat(int fromRow, int fromCol, int toRow, int toCol){
        Seat currSeat = theaterSeats[fromRow][fromCol];
        Seat newSeat = theaterSeats[toRow][toCol];

        if (currSeat.getTier() <= newSeat.getTier() && newSeat.isAvailable()){
            currSeat.setAvailability(true);
            newSeat.setAvailability(false);
            return true;
        }else{
            return false;
        }
    }
}