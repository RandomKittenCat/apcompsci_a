package Notes.nov182025;

public class MapDriver {
    public static void main(String[] args){

        String[] names = {"Grass", "Snow", "Water", "Sand"};

        Map m = new Map(4, names);

        m.printTiles();
    }
}
