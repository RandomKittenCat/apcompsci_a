package Notes.feb242026;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileIOtwo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("/home/inquiline/Documents/apcompsci_a/src/Notes/feb242026/words.txt"));

        while (sc.hasNextLine()){
            String animal = sc.nextLine();
            if(animal.length() > 4){
                System.out.println(animal);
            }
        }

        sc.close();
    }
}