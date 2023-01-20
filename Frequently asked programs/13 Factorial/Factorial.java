import java.util.Scanner;

public class Factorial{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		long fact = 1;

		for(int i=1 ; i<=n ; i++){
			fact=fact*i; // 1 2 6 24 120
		}

		System.out.println("Factorial is " + fact);

			
	}
}

// using recursion

// public class RecursionDemo {
//     public static void main(String[] args) {

//         // Example while calculating factorial
//         System.out.println(factorial(4));
//     }

//     private static int factorial(int value) {

//         if (value == 0){
//             return 1;
//         }
			// return n * factorial(n-1) ex: 5! = 5 * (4*3*2*1) = 120 ( 5 * 4!)
//         return factorial(value - 1) * value;
//         // calculate(value); this (Recursion) causes StackOverFlowError
//     }
// }