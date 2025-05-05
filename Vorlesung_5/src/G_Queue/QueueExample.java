package G_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();

        // push items onto the stack

        myQueue.offer("Apple");
        myQueue.offer("Banana");
        myQueue.offer("Cherry");

        System.out.println("Queue " + myQueue);

        // peek at the first item
        System.out.println("------------------------");
        System.out.println("First item (peek): " + myQueue.peek());
        System.out.println("Queue now: " + myQueue);

        // poll items from the queue
        System.out.println("------------------------");
        System.out.println("Polled Item : " + myQueue.poll());
        System.out.println("Queue after Pooped  : " + myQueue);

        System.out.println("Polled Item : " + myQueue.poll());
        System.out.println("Queue after Pooped  : " + myQueue);

        // check if the queue is empty using a boolean variable
        boolean isEmpty = myQueue.isEmpty();
        System.out.println("Is queue empty? " + isEmpty);



        System.out.println("-----------FOR EACH-------------");
        for (String s : myQueue) {
            System.out.println(s);
        }


    }

}