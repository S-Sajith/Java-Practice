package O8.Inheritance;

public class inheritance{
	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.start();
		mach1.stop();

		car car1 = new car();
		car1.stop();
		car1.wipeWindShield();
		car1.start();
	}
}