import java.util.*;

public class Demo2{
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();

		al.add("Q");
		al.add("W");
		al.add("E");
		al.add("R");
		al.add("T");
		al.add("Y");

		ArrayList al2 = new ArrayList();

		al2.addAll(al);
		System.out.println(al2);
		al2.removeAll(al);
		System.out.println("After removing : " + al2);

		// Sorting .. using Collections.sort

		System.out.println();
		System.out.println("Elements in arrayList al : " + al);
		Collections.sort(al);
		System.out.println("After sorting : " + al);
		System.out.println("Sorting in reverse order");
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("After sorting in reverse : " + al);

		// Shuffling elements
		System.out.println();
		Collections.shuffle(al);
		System.out.println("Elements in the array list after shuffling : " + al);

	}
}