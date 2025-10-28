package DataSetClass;

public class DataSetDriver {
    public static void main(String[] args){
        DataSet ds = new DataSet();

        System.out.println(ds.average()); // Should be 0.0

        ds.add(5);
        System.out.println(ds.average()); // Should be 5.0

        ds.add(3);
        System.out.println(ds.max()); // Should be 5
        System.out.println(ds.average()); // Should be 4.0

        ds.add(8);
        System.out.println(ds.max()); // Should be 8
        System.out.println(ds.average()); // Should be 5.33333333

    }
}
