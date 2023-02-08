import java.util.ArrayList;
import java.util.List;
import java.util.*;


public interface Demo {

    public static void main(String[] args) {
    
    // Declare ArrayList
        // List al = new ArrayList();
        // To store homogeneous data
        // ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList al = new ArrayList<>();
    
    // Add new elements to the arraylist
    al.add(100);
    al.add("sajith");
    al.add('A');
    al.add(true);
    System.out.println(al);

    // size
    System.out.println("Number of elements in the ArrayList " + al.size());

    // remove elements
    al.remove(0); 
    // or al.remove("sajith");
    System.out.println("After removing the elements " + al);

    // insert new element
    al.add(0,22);
    System.out.println(al);

    // retrieve specific element
    System.out.println(al.get(2)); 

    // replace element
    al.set(2,"Java");
    System.out.println("After replacing element : " + al);

    // search an element
    System.out.println("Checking if java is present in the arrayList : " + al.contains("Java"));

    // isEmpty()
    System.out.println("Checking if arrayList is empty or not : " + al.isEmpty());

    // reading elements in the arrayList
        // 1 for loop
        System.out.println();
        System.out.println("Reading elements using for loop...");
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        // 2 for each loop
        System.out.println();
        System.out.println("Reading elements using for-each loop");
        for(Object e:al){
            System.out.println(e);
        }
        // 3 using iterator method
        System.out.println();
        System.out.println("Reading elements using iterator method");
        Iterator it=al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
