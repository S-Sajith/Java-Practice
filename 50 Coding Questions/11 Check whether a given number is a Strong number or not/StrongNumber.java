// Strong Numbers are the numbers whose sum of 
// factorial of digits is equal to the original number.


// Input  : n = 145
// Output : Yes
// Sum of digit factorials = 1! + 4! + 5!
//                         = 1 + 24 + 120
//                         = 145

import java.util.*;

public class StrongNumber{

	public static void main(String[] args) {
		preCompute();
		if(isStrong(145)){System.out.println("Number is strong");}
		else {System.out.println("Not strong");}
	}

	static int f[] = new int[10];


	static void preCompute(){  // store factorials of all digits from 1-9 in array f
		f[0] = f[1] = 1;
		for(int i=2;i<10;i++){
			f[i] = f[i-1] * i;
		}
	}

	static boolean isStrong(int n){
		int temp = n;
		int sum = 0;

		while(temp>0){
			sum+=f[temp%10]; // extracting each digit and adding the value of factorial stored in array f

			temp/=10; // removing last digit
		}
		return (sum==n); // will return true if sum == temp
	}
}