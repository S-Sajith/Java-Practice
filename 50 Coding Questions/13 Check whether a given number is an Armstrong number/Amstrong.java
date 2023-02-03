//  A positive integer of n digits is called an Armstrong number
//  of order n (order is number of digits) if. 

// abcd… = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + …

// Input : 153
// Output : Yes
// 153 is an Armstrong number.
// 1*1*1 + 5*5*5 + 3*3*3 = 153

// Input : 120
// Output : No
// 120 is not a Armstrong number.
// 1*1*1 + 2*2*2 + 0*0*0 = 9

import java.lang.Math;

public class Amstrong{

	public static void main(String[] args) {
		if(isAmstrong(153)){System.out.println("Amstrong");}
		else{System.out.println("Not Amstrong");}
		if(isAmstrong(1634)){System.out.println("Amstrong");}
		else{System.out.println("Not Amstrong");}
		if(isAmstrong(1253)){System.out.println("Amstrong");}
		else{System.out.println("Not Amstrong");}
	}

	static boolean isAmstrong(int n){
		double sum = 0;
		int og_n = n;
		int len = String.valueOf(n).length();

		while(n>0){
			sum = sum + Math.pow(n%10,len);

			n/=10;
		}

		return(og_n==sum);

	}
}