import java.util.Scanner;
import java.lang.StringBuffer;
import java.lang.StringBuilder;


public class ReverseN{
	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in); // 1234
		int num = sc.nextInt();

		// 1. Using an algorithm

		int rev=0;

		while(num!=0){
			rev=rev*10 + num%10; // (0+4=4) (40+3=43) (430+2=432) (4320+1=4321)
			num=num/10; // (1234/10=123) (123/10=12) (12/10=1) (1/10=0)
		}

		System.out.println("Reverse number is " + rev);


		// 2. Using StringBuffer class

		System.out.println("Enter the number");
		int num2 = sc.nextInt();

		StringBuffer sb = new StringBuffer(String.valueOf(num2));
		StringBuffer rev2 = sb.reverse();
		System.out.println("The reverse of the number is " + rev2);


		// 3. Using StringBuilder class

		System.out.println("Enter the number");
		int num3 = sc.nextInt();

		StringBuilder sb2 = new StringBuilder();
		sb2.append(num3);
		StringBuilder reverse = sb2.reverse();

		System.out.println("The number's reverse is " + reverse);
		
	}
}