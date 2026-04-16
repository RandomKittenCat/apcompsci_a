package Sign;

public class Sign {
    private String message;
    private int width;

    public Sign(String message, int width) {

        this.message = message;
        this.width = width;
    }

    public int numberOfLines(){
        int length = message.length();

        if (length%width == 0){
            return length/width;
        }else{
            return length/width + 1;
        }
    }

    public String getLines(){
        int numlines = numberOfLines();
        String ret = "";
        if(numlines == 0) {
            return null;
        }

        for (int i = 1; i < numlines; i++) {
            ret += message.substring((i-1)*width, i*width) + ";";
        }

        return ret + message.substring((numlines-1)*width);
    }
}