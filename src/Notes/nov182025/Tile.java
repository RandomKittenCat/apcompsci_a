package Notes.nov182025;

public class Tile {

    private String name;
    private boolean passable;

    public Tile(String name) {

        this.name = name;
        passable = false;
    }

    public String getName() {

        return name;
    }

    public void switchPassable() {
        passable = !passable;
    }

    public String toString() {
        return "Name: " + name + " Passable: " + passable;
    }
}
