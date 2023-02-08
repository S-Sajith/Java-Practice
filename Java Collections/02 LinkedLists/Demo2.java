import java.util.*;

public class Demo2{
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();

		l.add("Q");
		l.add("W");
		l.add("E");
		l.add("R");
		l.add("T");
		l.add("Y"); 

		LinkedList l2 = new LinkedList();

		l2.addAll(l);
		System.out.println(l2);

		l2.removeAll(l);
		System.out.println(l2);

		// Sorting
		System.out.println("Before sorting : " + l);
		Collections.sort(l);
		System.out.println("After sorting : " + l);
		System.out.println("Reverse order");
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);

		// SHuffling
		Collections.shuffle(l);
		System.out.println("Data after shuffling " + l);
	}
}