import java.util.*;

public class Demo4{
	public static void main(String[] args) {
		LinkedList q = new LinkedList();

		// adding elements using add and offer

		q.add("a");
		q.add("b");
		q.add("c");
		q.offer("c");
		q.offer(100);

		System.out.println(q);

		// get head element element() peek()

		System.out.println(q.element()); // if queue is empty return NoSuchElementException
		System.out.println(q.peek()); // if queue is empty returns null

		// return and remove element from queue remove() and poll()

		// System.out.println(q.remove()); // if queue is empty return NoSuchElementException
		// System.out.println(q);

		System.out.println(q.poll()); // if queue is empty returns null
		System.out.println(q);

		/// iteration

		Iterator it = q.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}


	}
}