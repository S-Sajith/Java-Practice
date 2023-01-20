// if a number is divisible by 1 and the number itself then it's a prime number

import java.util.Scanner;


public class Prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int count = 0;

		if(n>1){

			for(int i=1;i<=n;i++){  // divide the given number by numbers b/w 1 and the number itself
				if(n%i==0){count++;}
			}
			if (count==2) {System.out.println("Prime");}
			else{System.out.println("Not prime");}


		}
		else{System.out.println("Not prime");}


	}
	
}			