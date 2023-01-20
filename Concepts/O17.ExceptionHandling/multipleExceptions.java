package O17.ExceptionHandling;

import java.io.IOException;
import java.text.ParseException;

public class multipleExceptions {
    public static void main(String[] args) {
        demoClass DemoClass = new demoClass();
        try {
            DemoClass.error();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
