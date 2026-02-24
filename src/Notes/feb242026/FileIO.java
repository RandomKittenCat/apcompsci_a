package Notes.feb242026;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) throws IOException {

        File file = new File("/home/inquiline/Documents/apcompsci_a/src/Notes/feb242026/numbers.txt");
        Scanner txt = new Scanner(file);
        int sum = 0;
        int count = 0;

        while(txt.hasNext()){
            sum+= txt.nextInt();
            count++;
        }

        txt.close();
        System.out.println("Average: " + ((double) sum/count));
    }
}