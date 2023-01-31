import java.util.Arrays;

public class BubleSort{

	public static void main(String[] args) {
		
		int a[] = {5,8,2,6,1};

		int n = a.length;

		System.out.println("The unsorted array is " + Arrays.toString(a));

		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1;j++){
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
 
		System.out.println("The sorted array is " + Arrays.toString(a));

	}

}