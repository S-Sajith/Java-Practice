package O17.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exception {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        FileReader fr = new FileReader(file);
    }
}
// There are two types of exceptions checked exceptions(Which have to be handled) and unchecked or runtime exceptions
// some examples of runtime exceptions are arithmetic exception, null-pointer exception,arrayIndexOutOFBounds exception
