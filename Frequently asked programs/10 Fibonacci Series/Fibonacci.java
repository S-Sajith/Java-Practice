// 0 1 1 2 3 5 8 13 21 34
import java.util.Scanner;

public class Fibonacci{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number");
		int n2 = sc.nextInt();
		System.out.println("Enter the range of numbers");
		int range = sc.nextInt();
		int sum = 0;
		System.out.print(n1+ " " + n2);

		for(int i=2;i<range;i++){
			sum=n1+n2;
			System.out.print(" " + sum);
			n1=n2;
			n2=sum;
		}
		
	}
}