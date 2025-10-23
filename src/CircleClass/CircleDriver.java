package CircleClass;

public class CircleDriver {
    public static void main(String[] args){
        System.out.println(Circle.totalCirclesCreated()); // This should return 0
        Point p = new Point(1, 1);
        Circle c = new Circle(p, 1.5); // Creates a new circle where the center is (1, 1), and the radius is 1.5.

        System.out.println(Circle.totalCirclesCreated()); // This should return 1

        Circle c1 = new Circle(2, 3, 2.25);
        // Creates a new circle where the center is (2, 3), and the radius is 2.25.

        System.out.println(Circle.totalCirclesCreated()); // returns 2
        System.out.println(c1.equals(c));

        Circle c2  = new Circle(2, 3, 2.25);
        System.out.println(c1.equals(c2));

    }
}
