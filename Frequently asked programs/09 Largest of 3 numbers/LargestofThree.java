import java.util.Scanner;

public class LargestofThree{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		//Approach 1

		if(a>b && a>c){System.out.println(a+" is largest");}
		else if(b>a && b>c){System.out.println(b+" is largest");}
		else{System.out.println(c+" is largest");}

		// Ternary operator in java

		// int largest = a>b?a:b; // if a is greater than b then answer is a otherwise b
		// largest = c>largest?c:largest;

		//combine two expressions instead of 2 statements
		int largest = c>(a>b?a:b)?c:(a>b?a:b);

		System.out.println("Getting th output using ternary operator : " + largest );


	}
}