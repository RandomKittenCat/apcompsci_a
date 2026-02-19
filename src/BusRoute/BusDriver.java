package BusRoute;

public class BusDriver {
    public static void main(String[] args){
        Bus b = new Bus(4);

        System.out.println(b.getCurrentStop());
        b.move();
        System.out.println(b.getCurrentStop());
        b.move();
        b.move();
        System.out.println(b.getCurrentStop());
        b.move();
        System.out.println(b.getCurrentStop());
    }
}