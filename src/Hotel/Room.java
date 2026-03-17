package Hotel;

public class Room {
    private int beds;
    private boolean hasView;
    private double pricepn;

    public Room(int beds, boolean hasView, double priceNight){
        this.beds = beds;
        this.hasView = hasView;
        this.pricepn = this.pricepn;
    }

    public int getBeds() {
        return beds;
    }

    public boolean getView() {
        return hasView;
    }

    public double getPricepn() {
        return pricepn;
    }
}