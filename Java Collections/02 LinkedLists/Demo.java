import java.util.*;

public class Demo{
	public static void main(String[] args) {
		

		//Declare linked list
		// LinkedList<String> = new LinkedList<String>();
		LinkedList l = new LinkedList();

		// Add elements to linked list
		l.add(100);
		l.add(null);
		l.add(true);
		l.add("Saj");
		l.add("s");

		System.out.println(l);
		System.out.println("Size of array : " + l.size());

		l.remove(3);
		System.out.println("List after removing element at index 3 : " + l);

		l.add(3,"Added");
		System.out.println("Adding new element at 3 : " + l );

		// retreving a value
		System.out.println("Retreving element at index 3 : "+l.get(3));

		// change the value
		System.out.println();
		l.set(3,"set");
		System.out.println(" Set value at index 3 to another value : " + l);

		// check if a value is present in the list
		System.out.println();
		System.out.println("Checking if 'Java' is present : " + l.contains("Java"));
		System.out.println("Checking if 'set' is present : " + l.contains("set"));

		// check if linkedList is empty or not
		System.out.println();
		System.out.println("Checking if list is empty : " + l.isEmpty());

		//Reading elements from LL 

		System.out.println();
		System.out.println("Using for loop to print elements");
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}

		System.out.println();
		System.out.println("Using for each loop to print elements");
		for( Object e : l){
			System.out.println(e);
		}

		System.out.println();
		System.out.println("Using iterator to print elements");
		Iterator it = l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}
}