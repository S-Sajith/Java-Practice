import java.util.Scanner;

public class Digits{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count = 0;

		while(num>0){
			num=num/10;
			count++;
		}

		System.out.println("Number of elements is " + count);
		
	}
}