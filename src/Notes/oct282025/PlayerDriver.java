package Notes.oct282025;

public class PlayerDriver {
    public static void main(String[] args){
        Player p1 = new Player(100);
        Player p2 = new Player(100);
        Player p3 = p1;

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}