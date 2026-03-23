package Cubes;

public class CubePair {
    private Cube c1;
    private Cube c2;

    public CubePair(String t1, String t2) {
        c1 = new Cube(t1);
        c2 = new Cube(t2);
    }

    public CubePair(String type){
        c1 = new Cube(type);
        c2 = new Cube(type);
    }

    public String rollCubes(){
        String result = "";

        result+= c1.roll();
        result+= c2.roll();

        return result;
    }
}