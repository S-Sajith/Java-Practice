import java.util.Random;


public class RandomGenerate{

	public static void main(String[] args) {

		// Approach 1 - Random
		
		Random rand = new Random();

		int rand_int = rand.nextInt(100); // generate random number b/w 0-100 max limit is 1000
		System.out.println(rand_int);

		double rand_dbl = rand.nextDouble(); // range 0.0 and less than 1.0
		System.out.println(rand_dbl);

		// Approach 2  - Math

		// Math.random() generates random number from 0.0 to 0.999
        // Hence, Math.random()*5 will be from 0.0 to 4.999
        double doubleRandomNumber = Math.random() * 5;
        System.out.println("doubleRandomNumber = " + doubleRandomNumber);
        // cast the double to whole number
        int randomNumber = (int)doubleRandomNumber;
        System.out.println("randomNumber = " + randomNumber);
		System.out.println(Math.random());

		


	}

}