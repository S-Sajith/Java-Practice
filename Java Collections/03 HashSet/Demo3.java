import java.util.*;

public class Demo3{
	public static void main(String[] args) {
		
		// Union, Intersection, Difference

		HashSet<Integer> set1 = new HashSet<Integer>();

		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);

		System.out.println("Hashset 1: "+ set1);

		HashSet<Integer> set2 = new HashSet<Integer>();

		set2.add(3);
		set2.add(5);
		set2.add(7);

		System.out.println("Hashset 2: "+ set2);

		// // union
		// set1.addAll(set2);
		// System.out.println("Union: " + set1);

		// // intersection (common elements)
		// set1.retainAll(set2);
		// System.out.println("Intersection: " + set1);

		// // difference
		// set1.removeAll(set2);
		// System.out.println("Difference: " + set1);

		// subset
		System.out.println(set1.containsAll(set2));
		
	}
}