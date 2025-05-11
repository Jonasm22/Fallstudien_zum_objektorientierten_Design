package Aufgabe_4;

public class program {
    public static void main(String[] args) {
        Queue<Dummy> myQueue = new Queue<>();

        Dummy dummy1 = new Dummy("max", 1);
        Dummy dummy2 = new Dummy("Andreas", 2);
        Dummy dummy3 = new Dummy("Mario", 3);
        myQueue.add(dummy1);
        myQueue.add(dummy2);
        myQueue.add(dummy3);
        myQueue.poll();
        System.out.println("Queue nach Pool: " + myQueue);

        myQueue.peek();
         System.out.println("Queue nach Peek: " + myQueue);

        //myQueue.remove();
        //myQueue.isEmpty()


    }
}
