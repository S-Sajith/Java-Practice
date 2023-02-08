import java.util.*;

public class Demo3{
	public static void main(String[] args) {
		// converting array to ArrayList

		String arr[] = {"Cat","Dog","Bird"};

		for(String v : arr){
			System.out.println(v);
		}

		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);
	}
}