import java.util.Scanner;


public class CountOccurence{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.out.println("Enter the character which needs to be counted");
		char charac = sc.next().charAt(0);
		int count = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == charac){
				count++;
			}
		}
		System.out.println("The number of times " + charac + "is repeated in the sentence is " + count);

		// approach 2

		String s = "Java lava guava strava";

		int c = s.length() - s.replaceAll("a","").length() ;

		System.out.println(s);
		System.out.println("The number of times a is repeated is " + c);

	}
}