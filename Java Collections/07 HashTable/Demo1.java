import java.util.*;

public class Demo1{
	public static void main(String[] args) {
		
		// Hashtable t = new Hashtable(); // default capacity is 11, load factor is 0.75
		// HashTable t =new(initital capacity); // create hashtable object with some capacity
		// HastTable t =new(inital capacity, fill ratio);

		Hashtable<Integer,String> t = new Hashtable<>();

		t.put(101,"John");
		t.put(102,"David");
		t.put(103,"Washington");
		// t.put(null,null); //NullPointerException

		System.out.println(t);

		System.out.println(t.get(103));

		t.remove(103);
		System.out.println(t);

		System.out.println(t.containsKey(102));
		System.out.println(t.containsValue("John"));

		System.out.println(t.isEmpty());

		System.out.println(t.keySet());
		System.out.println(t.values());

		System.out.println();

		for(int k : t.keySet())
		{
			System.out.println(k + " " + t.get(k));
		}

		System.out.println();

		// Entry specific methods..

		for(Map.Entry entry:t.entrySet()) // (key,value)
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

		// iterator()

		Set s = t.entrySet();

		Iterator it = s.iterator();

		while(it.hasNext())
		{
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}
}