import java.util.*;

public class Demo1{
	public static void main(String[] args) {
		
		// HashSet hs = new HashSet(); default capacoty is 16 , Load factor 0.75

		// Hashset hs = new Hashset(100); capacity is 100

		// Hashset hs = new HashSet(100,(float)0.90);

		// Hashset<Integer> hs = new HashSet<Integer>();

		HashSet hs = new HashSet();

		// Add objects/elements into HashSet
		hs.add(100);
		hs.add("Sajith");
		hs.add(true);
		hs.add('S');
		hs.add(null);
		System.out.println(hs);

		// remove()
		hs.remove('S');
		System.out.println("After removing object 'S' : "+hs);

		// contains()
		System.out.println("Checking if 'Welcome' is in the Hashset : " + hs.contains("Welcome"));


		System.out.println(hs.isEmpty());

		// Reading elements from HashSet using for each loop

		System.out.println();
		for(Object e :hs){
			System.out.println(e);
		}
		System.out.println();

		// Using iterator

		Iterator it = hs.iterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}

	}
}