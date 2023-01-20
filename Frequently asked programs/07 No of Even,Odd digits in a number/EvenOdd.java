import java.util.Scanner;

public class EvenOdd{

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num= sc.nextInt();
	int even_count=0;
	int odd_count=0;


	while(num>0){

		int rem = num%10; // get last digit of the number

		if(rem%2==0){even_count++;}
		else{odd_count++;}

		num=num/10; // remove last digit of the number

	}

	System.out.println("No of even numbers: " + even_count);
	System.out.println("No of odd numbers: " + odd_count);
		
	}
}
	

