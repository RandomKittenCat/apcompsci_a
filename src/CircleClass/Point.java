package CircleClass;

public class Point {
    
    private int x;
    private int y;
    
    public Point() {
        
        x = y = 0;
    }
    
    public Point(int x, int y) {
        
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        
        return x;
    }
    
    public int getY() {
        
        return y;
    }
    
    public void setX(int x) {
        
        this.x = x;
    }
    
    public void setY(int y) {
        
        this.y = y;
    }

    public double distance(int x, int y) {

        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(Point another) {

        return Math.sqrt((x - another.x) * (x - another.x) + (y - another.y) * (y - another.y));
    }
    
    @Override
    public boolean equals(Object another) {
        
        
        if(another instanceof Point) {
            
            Point anotherPoint = (Point)another;
            return x == anotherPoint.x && y == anotherPoint.y;
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        
        return "(" + x + ", " + y + ")";
    }
}