package Notes.nov182025;

public class Map {

    private Tile[] tiles;

    public Map(int mapSize, String[] tileNames) {

        tiles = new Tile[mapSize];
        initMap(tileNames);
    }

    private void initMap(String[] tileNames) {

        for(int i = 0; i < tiles.length; i++) {
            tiles[i] = new Tile(tileNames[i]);
        }
    }

    public void printTiles(){

        for(Tile t : tiles) {
            System.out.println(t);
        }
    }
}