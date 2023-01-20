package O25.Serialization;

import java.io.*;

public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects");

        Person mike = new Person(543,"Mike");
        Person sue = new Person(123,"Sue");

        System.out.println(mike);
        System.out.println(sue);

        try(FileOutputStream fs = new FileOutputStream("F:\\Java Practice\\Serialization\\people.bin")) {
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(mike);
            os.writeObject(sue);

            os.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
