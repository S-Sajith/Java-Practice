package O2.GettingUserInput;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        //Output the prompt
        System.out.println("Enter a line of text:");

        //Wait for the user to enter a line of text
        String line = input.nextLine();// for integer int value = input.nextInt();
        
        // tell em what they entered
        System.out.println("You entered " + line);
    }
}
