import java.util.*;

public class Demo1{
	public static void main(String[] args) {

		// Creating HashMap
		HashMap<Integer,String> m = new HashMap<>(); // specifying key and value pair dataType
		// HashMap m = new HashMap();

		// adding values

		m.put(101,"John");
		m.put(102,"Chris");
		m.put(103,"Roman");
		m.put(104,"Seth");
		m.put(105,"Bray");

		System.out.println(m);

		System.out.println(m.get(105));

		m.remove(105);
		System.out.println(m);

		System.out.println(m.containsKey(106));
		System.out.println(m.containsValue("Bray"));

		System.out.println(m.isEmpty());

		System.out.println(m.keySet()); // returns all the keys as set

		// reading individual object

		for(Object i: m.keySet())
		{
			System.out.println(i);
		}

		System.out.println(m.values()); // returns all values as a collections

		System.out.println(m.entrySet()); // returns all entries as a set

		for(Object i : m.keySet()){
			System.out.println(i + " " + m.get(i));
		}


		// *****************************
		// Entry methods
		System.out.println();
		for(Map.Entry entry: m.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		// iterator

		System.out.println();
		Set s = m.entrySet();
		Iterator it = s.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}
}