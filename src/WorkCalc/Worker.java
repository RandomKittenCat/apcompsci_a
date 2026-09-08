package WorkCalc;

public class Worker {
    private int hours;
    private double pay;
    private boolean bonus;
    private double paycheck;

    public void addWork(int hours, double pay, boolean bonus){
        paycheck += hours*pay;
        if (bonus){
            paycheck+=5.0;
        }
    }

    public double getPaycheck(){
        return paycheck;
    }
    
}
