import java.util.Scanner;

public class LeapYear{

	// a century year ends with 00
	// a non century year is leap if its divisible by 4 & not by hundred
	// a century year is leap if its divisible by 400

	static boolean checkYear(int year){
		return((year%4==0 && year%100!=0)
				|| (year%400==0));
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();
		System.out.println(checkYear(year)? "Year is leap" : "Year is not leap");
	}
}