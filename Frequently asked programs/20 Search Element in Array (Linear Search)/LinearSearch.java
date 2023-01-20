import java.util.Scanner;

public class SearchArray{
	public static void main(String[] args) {
		
		int a[]={10,20,30,40,50};

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the element to be found");
		int key=sc.nextInt();
		boolean flag=false;

		for(int v:a){
			if(key==v){
				System.out.println("Element found");
				flag=true;
				break;
			}
		}
		if(flag==false){System.out.println("Element not found");}	
	}
}