package JavaCollections.Iterators;

import java.util.Iterator;
import java.util.LinkedList;

public class Iteration {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<String>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Mouse");

        Iterator<String> it = animals.iterator();

        //you can iterate and modify it at the same time
        while (it.hasNext()){
            String value = it.next();
            System.out.println(value);

            if(value.equals("Cat")){
                it.remove();
            }
        }

        System.out.println();

        ///modern iteration/// ///you cannot iterate and modify it at the same time
        for (String animal:
             animals) {
            System.out.println(animal);
        }
    }
}
