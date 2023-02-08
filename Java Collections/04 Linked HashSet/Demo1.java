import java.util.*;

public class Demo1{
	public static void main(String[] args) {
		// HashSet lset = new HashSet();
		// LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>();
		LinkedHashSet lset = new LinkedHashSet();

		lset.add(100);
		lset.add(200);
		lset.add(300);
		lset.add(400);

		System.out.println(lset);
	}
}