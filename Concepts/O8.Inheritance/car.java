package O8.Inheritance;

public class car extends Machine{
	public void start(){ // method overriding
		System.out.println("Car started");
	}

	public void wipeWindShield(){
		System.out.println("Wipe windScreen");
	}
}