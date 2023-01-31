import java.util.Arrays;
import java.util.Collections;

public class Sort{
	public static void main(String[] args) {
	
	// Approach 1

	int a[] = {30,50,20,10,60};
	System.out.println("The unsorted array is " + Arrays.toString(a));

	Arrays.parallelSort(a);

	System.out.println("The sorted array is " + Arrays.toString(a));

	// Approach 2

	int b[] = {40,70,20,10,90};
	System.out.println("The unsorted array is " + Arrays.toString(b));

	Arrays.sort(b);

	System.out.println("The sorted array is " + Arrays.toString(b));

	// Sort in reverse order

	Integer c[] = {56,38,72,45,28};
	System.out.println("The unsorted array is " + Arrays.toString(c));

	Arrays.sort(c,Collections.reverseOrder());

	System.out.println("The sorted array is " + Arrays.toString(c));

	}
}