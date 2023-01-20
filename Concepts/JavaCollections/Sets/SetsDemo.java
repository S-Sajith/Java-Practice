package JavaCollections.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {
    public static void main(String[] args) {
        //set stores only unique elements
        //HashSet does not retain order
        Set<String> set1 = new HashSet<String>();
        //LinkedHashSet remembers the order you added items in
        Set<String> set2 = new LinkedHashSet<String>();
        //TreeSet remembers natural order
        Set<String> set3 = new TreeSet<String>();


        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("skunk");

        set2.add("dog");
        set2.add("cat");
        set2.add("giraffe");
        set2.add("monkey");

        set3.add("dog");
        set3.add("cat");
        set3.add("mouse");
        set3.add("skunk");

        // adding duplicate items does nothing.
        set1.add("dog");

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        //iteration
        for (String element:
             set1) {
            System.out.println(element);
        }

        //does set contain given item
        if (set1.contains("aadvark")){
        System.out.println("contains aadvark");
        }

        ////////intersection/////// finding common elements

        Set<String> intersection = new LinkedHashSet<String>(set1);

        intersection.retainAll(set2);
        System.out.println(intersection);

        //difference//

        Set<String> difference = new LinkedHashSet<String>(set2);

        difference.retainAll(set1);
        System.out.println(difference);
    }
}
