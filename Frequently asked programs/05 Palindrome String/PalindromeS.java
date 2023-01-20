import java.util.Scanner;


public class PalindromeS{
	
	public static void main(String[] args){


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String org_str = str;
		String rev = "";
		int len = str.length();

		for(int i=len-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}

		if (rev.equals(org_str)) {
			System.out.println("The String is a palindrome");
		} else {
			System.out.println("The String is not a palindrome");
		}


	}



}