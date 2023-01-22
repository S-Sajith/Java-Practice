public class reverseArray{
	public static void main(String[] args) {
		reverseString(["h","e","l","l","o"]);
	}
	public void reverseString(char[] s){
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
	}
}