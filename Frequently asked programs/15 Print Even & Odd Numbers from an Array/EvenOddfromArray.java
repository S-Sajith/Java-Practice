import java.util.Scanner;

public class EvenOddfromArray{
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		int[] array = new int[n];

		System.out.print("Enter the array elements");
		for (int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}

		// extracting even numbers


		System.out.println("Even numbers");
		for(int i=0;i<array.length;i++){
			if(array[i]%2==0){System.out.println(array[i]);}
		}0

		System.out.println("Odd numbers");
		for(int i=0;i<array.length;i++){
			if(array[i]%2!=0){System.out.println(array[i]);}
		}



	}
}