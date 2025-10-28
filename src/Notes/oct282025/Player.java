package Notes.oct282025;

public class Player {
    private int currentHP;

    public Player(int maxHP){
        currentHP = maxHP;
    }

    public int getHP(){
        return currentHP;
    }

    public void hitPlayer(int damage){
        currentHP -= damage;

        if(currentHP <= 0){
            System.out.println("You are dead.");
        }
    }

    public boolean equals(Player p){
        return p.getHP() == currentHP;
    }
}
