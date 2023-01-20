package JavaCollections.Queues;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        // (head) <- ooooooooooooooooooooooooo <- (tail) FIFO (First in first out)
        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3); // it has capacity of 3
        q1.add(12);
        q1.add(26);
        q1.add(57);

        try{
            q1.add(38);
        }catch (IllegalStateException e){
            System.out.println("Tried to add too many elements to the queue");
        }

        for(Integer q : q1){
            System.out.println(q);
        }

        System.out.println("Removed from queue :" + q1.remove());
        System.out.println("Removed from queue :" + q1.remove());
        System.out.println("Removed from queue :" + q1.remove());
        try {
            System.out.println("Removed from queue :" + q1.remove());
        }catch (NoSuchElementException e){
            System.out.println("Tried to remove too many elements");
        }

        /////////////////////////////////////////////////////////////////////
        //////////Offer,poll,peek they don't return exceptions like head,add and remove////////////

        Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2); // it has capacity of 3
        System.out.println("Queue 2 peek :" + q2.peek());

        q2.offer(12);
        q2.offer(26);
        q2.offer(57);

        System.out.println("Queue 2 peek :" + q2.peek());

        for( Integer queue2 : q2){
            System.out.println(queue2);
        }

        System.out.println("Queue 2 poll :" + q2.poll());
        System.out.println("Queue 2 poll :" + q2.poll());
        System.out.println("Queue 2 poll :" + q2.poll());
    }
}

