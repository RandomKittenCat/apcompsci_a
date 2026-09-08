package WorkCalc;

public class WorkerDriver {
    public static void main(String[] args){
        Worker employee = new Worker();

        employee.addWork(1, 17.0, false);
        System.out.println(employee.getPaycheck());
        employee.addWork(3, 2.0, true);
        System.out.println(employee.getPaycheck());
    }
}