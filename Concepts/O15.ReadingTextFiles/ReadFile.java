package O15.ReadingTextFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "F:\\Java Practice\\ReadingTextFiles\\file.txt";

        File textFile = new File(filename); //in built file object in java

        Scanner in = new Scanner(textFile);

        while(in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(line);
        }
        in.close();
    }
}
