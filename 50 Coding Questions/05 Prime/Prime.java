// a number is prime if it is divisible by 1 and the number itself
import java.util.Scanner;


public class Prime  {
	static String prime(int n){
		int count = 0;

		if(n>1)
		{
			for(int i=1;i<=n;i++)
			{	
				if(n%i==0){
				count++;}
			}
			if(count==2){return "Prime";}
			else{return "Not prime";}
		}
		else 
			{return "Not prime";}
					}	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println(prime(n));
	}

}