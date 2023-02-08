public class Reverse{
	public static void main(String[] args) {
		int num = 5387;
		String strr = "Hello there";
		System.out.println(revStr(strr));
		System.out.println(revNum(num));
	}

	static String revStr(String str){
		String reverseS = "";

		for(int i=str.length()-1;i>=0;i--){
			reverseS=reverseS+str.charAt(i);
		}

		return reverseS;
	}

	static int revNum(int n){
		int reverseN = 0;

		while(n>0){
			reverseN = reverseN*10 + n%10;

			n/=10;
		}

		return reverseN;
	}
}
