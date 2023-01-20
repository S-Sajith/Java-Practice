import java.util.Scanner;

public class CountSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum=0;

        while(num>0){
            int n = num%10; // last digit of thr number
            sum = sum + n;
            num = num/10; // remove last digit of the number
        }

        System.out.println("The sum of the digits in the number is " + sum);
    }
}