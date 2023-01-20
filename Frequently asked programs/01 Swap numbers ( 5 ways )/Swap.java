public class Swap  {
	
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Numbers before swapping are: " + a + " " + b );
		
		// Logic 1 : using third variable

		int t = a; a=b; b=t;
		System.out.println("Numbers after swapping are: " + a + " " + b);

		// Logic 2 : use + & - without using third variable

		System.out.println("Numbers before swapping are: " + a + " " + b );

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("Numbers after swapping are: " + a + " " + b);


		// Logic 3 : use * & /  without using third variable , a & b shouldn't be zero

		System.out.println("Numbers before swapping are: " + a + " " + b );

		a=a*b;
		b=a/b;
		a=a/b;

		System.out.println("Numbers after swapping are: " + a + " " + b);

		// Logic 4 : use + & - without using bitwise XOR (^)

		System.out.println("Numbers before swapping are: " + a + " " + b );

		a=a^b;
		b=a^b;
		a=a^b;

		System.out.println("Numbers after swapping are: " + a + " " + b);

		// Logic 5 : Single Statement

		System.out.println("Numbers before swapping are: " + a + " " + b );

		b=a+b-(a=b);

		System.out.println("Numbers after swapping are: " + a + " " + b);

	}
}