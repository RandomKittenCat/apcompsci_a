package RestaurantTable;

public class SingleTable {
    
    private final int numSeats;
    private final int height;
    private double viewQuality;
    
    public SingleTable(int numSeats, int height, double viewQuality) {
        
        this.numSeats = numSeats;
        this.height = height;
        this.viewQuality = viewQuality;
    }
    
    public int getNumSeats() { return this.numSeats; }
    
    public int getHeight() { return this.height; }
    
    public double getViewQuality() { return this.viewQuality; }
    
    public void setViewQuality(double viewQuality) { this.viewQuality = viewQuality; }
}