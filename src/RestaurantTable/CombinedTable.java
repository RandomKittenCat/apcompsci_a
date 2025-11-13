package RestaurantTable;

public class CombinedTable {
    private SingleTable t1;
    private SingleTable t2;
    boolean sameHeight;

    //overloaded constructor
    public CombinedTable(SingleTable t1, SingleTable t2){
        this.t1 = t1;
        this.t2 = t2;
    }

    // can a double table seat this many people
    public boolean canSeat(int people){
        if (people <= (t1.getNumSeats()+t2.getNumSeats()-2)){
            return true;
        }else{return false;}
    }

    public double getDesirability(){
        double avgView = (t1.getViewQuality() + t2.getViewQuality()) / 2.0;
        if ((t1.getHeight() == t2.getHeight())) {
            return avgView;
        }else{
            return avgView-=10;
        }
    }
}