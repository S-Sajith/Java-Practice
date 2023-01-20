import java.util.Scanner;
import java.lang.StringBuffer;


public class ReverseS{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();

		String rev="";

		// Using charAt()

		int len = str.length();

		for(int i=len-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}

		System.out.println("Reversed using charAt(): " + rev);


		// 2. Using character array

		String rev2="";

		char a[] = str.toCharArray();
		int len2 = a.length;

		for(int j=len2-1;j>=0;j--){
			rev2=rev2+a[j];
		}

		System.out.println("Reversed using toCharArray(): " + rev2);

		// 3. Using StringBuffer

		StringBuffer sb = new StringBuffer(str);
		System.out.println("Reversed using StringBuffer: " + sb.reverse());

	}
}