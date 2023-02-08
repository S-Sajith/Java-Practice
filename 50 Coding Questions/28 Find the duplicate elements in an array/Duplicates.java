import java.util.ArrayList;

public class Duplicates{
	public static void main(String[] args) {
		int arr[] = {82,11,34,56,78,69,73,11};

		int n  = arr.length;

		findDuplicates(arr,n);
	}

	static void findDuplicates(int arr[] , int len){

		ArrayList<Integer> al = new ArrayList<>();

		boolean isPresent = false;

		for(int i=0; i<len-1; i++){
			for(int j=i+1;j<len;j++){
				if(arr[i]==arr[j])
				{
					if(al.contains(arr[i])){
						break;
					}
				
					else{	
					al.add(arr[i]);
					isPresent = true;
					}
				}
			}
		}
		if(isPresent == true){
			System.out.println("The duplicate elements are");
			System.out.println(al + " ");
		}
		else{
			System.out.println("No duplicates are present in the array");
		}


	}

}