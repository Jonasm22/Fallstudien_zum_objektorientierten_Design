package F_Stacks;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();

        // push items onto the stack

        myStack.push("Apple");
        myStack.push("Banana");
        myStack.push("Cherry");

        System.out.println("Stack " + myStack);

        // peek at the top item
        System.out.println("------------------------");
        System.out.println("Top item (peek): " +myStack.peek());
        System.out.println("Stack now: " + myStack);

        // pop items from the stack
        System.out.println("------------------------");
        System.out.println("Pooped Item : " + myStack.pop());
        System.out.println("Pooped Item : " + myStack.pop());

        // check if the stack is empty
        System.out.println("is empty?: " +myStack.empty());

        boolean isEmpty = myStack.empty();
        System.out.println("Is stack empty? " + isEmpty);


        System.out.println("-----------FOR EACH-------------");
        for (String s : myStack){
            System.out.println(s);
        }



    }






}
