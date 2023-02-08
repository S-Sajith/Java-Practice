import java.util.ArrayList;

public class NonDuplicates{
	public static void main(String[] args) {
		int arr[] = {76,91,34,8,76,91,54};

		int n = arr.length;

		printNonDuplicates(arr,n);
	}

	static void printNonDuplicates(int arr[] ,int len){

		ArrayList<Integer> al = new ArrayList<>();

		boolean isUnique = false;

		for(int i=0 ; i<len-1;i++){
			for(int j=i+1;j<len;j++){
				if(arr[i]!=arr[j]){
					if(al.contains(arr[i])){
						break;
					}
					else{
						al.add(arr[i]);
						isUnique = true;
					}
				}
			}
		}

		if(isUnique==true){
			System.out.println("The non repeated elements of the array are " + al);			
		}
		else{
			System.out.println("No unique elements are present in the array");
		}
	}
}