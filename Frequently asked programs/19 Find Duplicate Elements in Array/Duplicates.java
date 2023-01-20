import java.util.HashSet;

public class Duplicates{

	public static void main(String[] args) {
		int a[] = {1,2,1,5,5};
		
		boolean flag=false;
		for(int i=0;i<a.length;i++){

			for(int j=i+1;j<a.length;j++) // inner loop keeps executing until duplicate is found {
				if(a[i]==a[j]){
					System.out.println( a[i] +" is the duplicate element");
					flag=true;
				}
			} 
			if(flag==false){
				System.out.println("No duplicates found");
			}


			// approach 2: using hashset

			System.out.println();
			System.out.println("Using Hashset Approach:");


			HashSet<Integer> set = new HashSet();
			boolean flag=false;

			for(int v:a){

				if(set.add(v)==false){System.out.println("Found duplicate element " + v);}
				flag=true;
			}
			if(flag==false){
				System.out.println("No duplicates found");
			}



		}
	}