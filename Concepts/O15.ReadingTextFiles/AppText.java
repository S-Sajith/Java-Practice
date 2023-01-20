package O15.ReadingTextFiles;

import java.io.*;

public class AppText {
    public static void main(String[] args) {
        File file = new File("F:\\Java Practice\\ReadingTextFiles\\file.txt");
        //practical use of try with resources
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cant find file");
        } catch (IOException e) {
            System.out.println("Cant read file");
        }
    }
}
