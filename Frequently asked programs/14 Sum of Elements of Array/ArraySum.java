import java.util.Scanner;

public class ArraySum{


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		int[] array = new int[n];

		System.out.print("Enter the array elements");
		for (int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Array elements are" );
		for (int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}

		System.out.println();


		int sum = 0;
		for (int value : array){
			sum = sum+value;
		}
		System.out.println("Sum of the elements in the array is " + sum);
		
	}

}