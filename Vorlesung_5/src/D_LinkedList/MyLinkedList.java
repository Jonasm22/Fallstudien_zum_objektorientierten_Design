package D_LinkedList;

import java.util.LinkedList;

public class MyLinkedList<T> {

    //LinkedList
    private LinkedList<T> elemente = new LinkedList<T>();

    //Methoden
    public void add(T element){
        elemente.add(element);
    }
    public void addFirst(T element){
        elemente.addFirst(element);
    }

    public void addLast(T element){
        elemente.addLast(element);
    }

    public void addAt(int index, T element) {
        elemente.add(index, element);
    }

    public void removeAt(int index){
        elemente.remove(index);
    }

    public static void main(String[] args) {
        MyLinkedList<String> Liste = new MyLinkedList<String>();

        Liste.add("A");
        Liste.add("B");
        Liste.add("D");
        Liste.add("E");

        Liste.addAt(2, "C");


        for(String myString : Liste.elemente){
            System.out.println(myString);
        }

        System.out.println("------------------");

        Liste.removeAt(3);


        for(String myString : Liste.elemente){
            System.out.println(myString);
        }




    }

}

