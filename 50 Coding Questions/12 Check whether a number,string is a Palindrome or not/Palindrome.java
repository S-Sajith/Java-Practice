public class Palindrome{
	public static void main(String[] args) {
		if(palString("madam"))
			{System.out.println("Palindrome");}
		else{System.out.println("Not Palindrome");}
		if(palNumber(454)){System.out.println("Palindrome");}
		else{System.out.println("Not Palindrome");}

		if(palString("Sajith"))
			{System.out.println("Palindrome");}
		else{System.out.println("Not Palindrome");}
		if(palNumber(7320)){System.out.println("Palindrome");}
		else{System.out.println("Not Palindrome");}
	}

	static boolean palString(String str){
		String revStr="";

		for(int i=str.length()-1;i>=0;i--){
			revStr=revStr + str.charAt(i); // rememeber to use str.charAt() not just charAt()
		}

		return (str.toLowerCase().equals(revStr.toLowerCase()));
	}

	static boolean palNumber(int n){
		int ogNum = n;
		int rev=0;

		while(n>0){
			rev = rev*10 + n%10;

			n/=10;
		}

		return(rev==ogNum);
	}
}