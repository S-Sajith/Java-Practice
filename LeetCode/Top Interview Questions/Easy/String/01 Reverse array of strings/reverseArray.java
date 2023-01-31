public class reverseArray{
	
	public char[] reverseString(char[] s){
		int left=0;
		int right=s.length-1;
		char temp;

		while(right>left)
		{
			temp=s[left];
			s[left]=s[right];
			s[right]=temp;

			left++;
			right--;
		}

		return s;
	}

	public static void main(String[] args) {
		reverseArray obj = new reverseArray();

		char[] s = {'h','e','l','l','o'};

		System.out.println(obj.reverseString(s));
	}
}