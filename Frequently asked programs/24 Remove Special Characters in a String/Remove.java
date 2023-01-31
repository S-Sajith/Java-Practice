public class Remove{
	public static void main(String[] args) {
		String s = "Pr!ogr#am%m*in&g Lan?#guag(e";

		s=s.replaceAll("[^a-zA-z0-9 ]", "");
		System.out.print(s);
	}
}