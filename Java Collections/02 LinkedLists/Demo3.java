import java.util.*;

// LinkedList specific methods

public class Demo3{
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();

		l.add("dog");
		l.add("cat");
		l.add("dog");
		l.add("horse");

		System.out.println(l);

		l.addFirst("pig");
		l.addLast("elephant");

		System.out.println(l);

		System.out.println("Getting first element : " + l.getFirst());
		System.out.println("Getting last element : " + l.getLast());

		// Removing first and last elements

		l.removeFirst();
		l.removeLast();

		System.out.println("After removing first and last elements " + l);

	}
}