package O1.LoopsSwitch;

import java.util.Scanner;

public class doWhileDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* 
        System.out.println("Enter the number");
        int value = in.nextInt();

        while(value!=5){
            System.out.println("Enter the value");
            value = in.nextInt();
        }
        */

        int value = 0;
        do{
            System.out.println("Enter the number");
            value = in.nextInt();
        }
        while(value != 5);
        System.out.println("got 5");
    }
}
