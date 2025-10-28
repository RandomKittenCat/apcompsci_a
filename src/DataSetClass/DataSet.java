package DataSetClass;

public class DataSet {
    private double avg;
    private int value;
    private int maxval;
    private int count;

    public DataSet(){
        count = 0;
        avg = 0.0;
        maxval = 0;
    }

    public void add(int n){
        value+=n;
        count++;
        if(n>maxval){
            maxval = n;
        }
    }

    public double average() {
        if (value == 0) {
            return 0;
        }
        return (double) value / count;
    }

    public int max(){
        return maxval;
    }
}
