public class MissingNArray{

	public static void main(String[] args) {
		
		// Array shouldn't have duplicates
		// Array need not be sorted
		// Values should be in range

		int a[] = {1,2,3,5};

		// 1+2+3+5 = 11 sum1
		// 1+2+3+4+5 = 15 sum2
		// sum2-sum1 = 15-11 = 4 is missing in the range

		int sum1=0;
		for(int v : a){
			sum1 = sum1 + v;
		}

		int sum2=0;
		for(int i=1;i<=5;i++){sum2=sum2+i;}

		System.out.println("Missing element is " + (sum2-sum1));

	}
}