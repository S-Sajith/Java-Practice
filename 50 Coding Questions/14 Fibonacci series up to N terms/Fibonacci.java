// In mathematical terms, the sequence Fn of Fibonacci numbers 
// is defined by the recurrence relation
// Fn = Fn-1 + Fn-2 with seed values F0 = 0 and F1 = 1.

// 0 1 1 2 3 5 8 13 21 34

import java.util.Scanner;

public class Fibonacci {

	// Fibonacci Series using Recursion + for calculating sum of fibonnaci numbers

	static int fib(int n){
		if (n==0 || n==1)
			return 0;
		else if (n == 2)
			return 1;
		return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {
		System.out.println(fib(7));

		// displaying fibonacci series
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto which fibonacci series must be displayed");
		int range = sc.nextInt();
		System.out.print(n1+ " " + n2);

		for(int i=2;i<range;i++){
			sum = n1 + n2;
			System.out.print(" " + sum);
			n1 = n2;
			n2 = sum;
		}
	}

}