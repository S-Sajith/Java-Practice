import java.util.Scanner;
import java.util.Arrays;


public class BinarySearch{

	public static void main(String[] args) {

		int a[] = {10,20,30,40,50,60,70};

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to be found");
		int key = sc.nextInt();

		int l=0; int h = a.length-1; boolean flag=false;

		while(h>=l){

			int m = (l+h)/2;

			if(a[m]==key){System.out.println("Element found"); 
			flag=true;
			break;}

			if(key>a[m]){
				l=m+1;
			}

			if(key<a[m]){
				h=m-1;
			}
		}
		if(flag==false){System.out.println("Element not found");}
	
		// approach 2 : built in method Arrays.binarySearch()

		System.out.println();
		System.out.println("Search using built in array method");
		System.out.println("Found at position "+Arrays.binarySearch(a,50));
		System.out.println(a[Arrays.binarySearch(a,50)]);

	}
}