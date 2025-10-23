package CircleClass;

public class Circle {
    double radius;
    private Point center;
    private static int circlesCreated;

    public Circle(){
        this.center = new Point(0, 0);
        radius = 1.0;
        circlesCreated++;
    }
    public Circle(int x, int y, double radius){
        this.center = new Point(x, y);
        this.radius = radius;
        circlesCreated++;
    }
    public Circle(Point p, double radius){
        this.center = p;
        this.radius = radius;
        circlesCreated++;
    }

    public double getRadius(){return radius;}
    public Point getCenter(){return center;}
    public void setRadius(double radius){this.radius = radius;}
    public void setCenter(Point center){this.center = center;}

    public double getArea(){
        return (Math.PI * (Math.pow(radius,2)));
    }

    public static int totalCirclesCreated(){
        return circlesCreated;
    }

    // call center.toString() and get radius
    public String toString(){
        return "Center: " + center.toString() + ", Radius: " + getRadius();
    }

    public boolean equals(Object other){
        if (other instanceof Circle){
            Circle c = (Circle) other;
            return this.center.equals(c.center) && this.radius == c.radius;
        }
        return false;
    }
}
