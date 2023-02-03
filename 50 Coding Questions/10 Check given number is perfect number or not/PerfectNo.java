// A number is a perfect number if 
// is equal to sum of its proper divisors, that 
// is, sum of its positive divisors excluding the number itself.

// Input: n = 6
// Output: true
// Divisors of 6 are 1, 2 and 3. Sum of 
// divisors is 6.

import java.util.Scanner;

public class PerfectNo{

	public static void main(String[] args) {

	System.out.println("Enter the number");
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int sum = 0;

	for(int i=1;i<n;i++){
		if(n%i==0){
			sum = sum + i;
		}
	}
	if(sum==n){ System.out.println("Number is perfect");}
	else {System.out.println("Number is not perfect");}

}

}