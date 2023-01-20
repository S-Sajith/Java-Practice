import java.util.Scanner;

public class PalindromeN{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		int rev = 0;
		int org_num = num;

		while(num!=0){
			rev=rev*10 + num%10;
			num=num/10;
		}
		if(rev==org_num){System.out.println("Number's a palindrome");}
		else{System.out.println("Number ain't a palindrome");}
	}
}