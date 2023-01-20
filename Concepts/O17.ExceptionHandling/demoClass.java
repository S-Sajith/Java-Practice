package O17.ExceptionHandling;

import java.io.IOException;
import java.text.ParseException;

public class demoClass {
    public void error() throws IOException , ParseException{
        //throw new IOException();

        throw new ParseException("Error in command list",2);
    }
}
