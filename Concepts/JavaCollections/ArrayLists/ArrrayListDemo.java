package JavaCollections.ArrayLists;

import java.util.ArrayList;

public class ArrrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //Adding
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        //Removing This method is very slow
        numbers.remove(0);

        //Use this method instead
        numbers.remove(numbers.size() - 1);

        //Retrieving
        System.out.println(numbers.get(0));

        //Iteration #1
//        int i;
//        for (i = 0; i < numbers.size(); i++) ;
//        System.out.println(numbers.get(i));

        //Iteration 2
        for(Integer value:numbers){
            System.out.println(value);
        }

    }
}
