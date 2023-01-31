public class RemoveWhite{
	public static void main(String[] args) {
		String str = "I Am The Game  And I Want To Play";
		str=str.replaceAll("\\s","");
		System.out.println("After removing the white spaces:"+str);
	}
}