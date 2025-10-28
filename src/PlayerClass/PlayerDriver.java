package PlayerClass;

public class PlayerDriver {
    public static void main(String[] args){
        Player p = new Player("John");
        p.add(5);
        System.out.println(p.winning()); //true
        Player p2 = new Player("Jim");

        System.out.println(p.toString());
        System.out.println(Player.getHighScore());
        p2.add(50);
        System.out.println(p.winning());

        Player.reset();

        System.out.println(Player.getHighScore());
        p.add(200);
        System.out.println(Player.getHighScore());
    }
}
