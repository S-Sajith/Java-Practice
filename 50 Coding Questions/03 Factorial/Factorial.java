import java.util.Scanner;


public class Factorial{
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(factorial(num));
	}

	private static int factorial(int num){
		if (num == 0){
			 return 1;
		 }
 		return num * factorial(num-1) ;
	}
}