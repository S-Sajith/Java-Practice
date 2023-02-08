// finding second smallest and second largest element 
// sort the string using bubble sort and then find the elements

public class Second{
	public static void main(String[] args) {
		int a[] = {25,38,11,56,8,72};
		int n= a.length;
		for(int i=0;i<n-1;i++){ // number of passess
			for(int j=0;j<n-1;j++){
				if(a[j]>a[j+1]){
					int temp = a[j+1];
					a[j+1]=a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("Second largest is " + a[n-2]);
		System.out.println("Second smallest is " + a[1]);
	}
}