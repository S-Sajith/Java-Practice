import java.util.Scanner;
import java.lang.StringBuilder;


public class ReverseAllWords{
	public static void main(String[] args) {

		// approach 1

		System.out.println("Enter the string");
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		String words[] = s.split(" ");
		String reversedString ="";
		for(String word: words)
		{

			String reversedWord="";
			for(int i=word.length()-1;i>=0;i--)
			{
				reversedWord=reversedWord+word.charAt(i);
			}
			reversedString=reversedString+reversedWord+" ";
		}
		System.out.println(reversedString);

		// approach 2

		String str = "Welcome to the jungle";
		String wordss[] = str.split("\\s");

		String reverseword="";
		
		for(String w:wordss){
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();

			reverseword=reverseword+sb.toString()+" ";
		}
		System.out.println("The reversed string is "+ reverseword);

	}
	
}