package JavaCollections.LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        /*
        * ArrayLists manage internally
        * [0][1][2][3][4].....
        */
        /*
        LinkedLists consists if elements where each element has a reference to the previous ad next element
        [0]->[1]->[2]......
           <-   <-
        */
        List<Integer> arrayList = new ArrayList<Integer>(); //use arraylist to add items at the end of the list
        List<Integer> linkedList = new LinkedList<Integer>(); //add or remove items anywhere else use this as its faster
        doTimings("ArrayList",arrayList);
        doTimings("LinkedList",linkedList);
    }
    public static void doTimings(String type, List<Integer> list){

        for(int i=0 ; i<1e5 ; i++){
            list.add(i);
        }

        long start = System.currentTimeMillis();

        //Add items in the beginning of the list
//        for(int i=0 ; i<1e5 ; i++){
//            list.add(i);
//        }

        //Add items elsewhere ex beginning
        for(int i=0 ; i<1e5 ; i++){
            list.add(0,i);
       }

        long end = System.currentTimeMillis();

        System.out.println("Time taken :" + (end- start) + "ms for" + type);

}

}

