package O20.WriteTextFiles;

import java.io.*;

public class AppWrite {
    public static void main(String[] args) {
        File file = new File("F:\\Java Practice\\WriteTextFiles\\write.txt");
        //practical use of try with resources
        try(BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.write("This is line one");
            br.newLine();
            br.write("This is line two");
            br.newLine();
            br.write("Last line");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}

