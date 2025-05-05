package C_InterfaceList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList <T>implements Iterable<T>{
    private ArrayList<T> elemente = new ArrayList<>();

    public void add(T elements){
        elemente.add(elements);
    }

    public T get(int index){
        return elemente.get(index);
    }

    public void setElements(int index,  T elements){
        elemente.set(index, elements);
    }

    public void addAt(int index , T elements){
        elemente.add(index, elements);

    }

    public T removeAt(int index){
        return elemente.remove(index);
    }

    public List<T> subList(int from , int to){
      return elemente.subList(from, to);
    }

    public int indexOf(T element){
        return elemente.indexOf(element);
    }

    public int lastIndexOf(T element){
       return elemente.lastIndexOf(element);
    }


    @Override
    public Iterator<T> iterator() {
        return elemente.iterator();
    }

    public static void main(String[] args) {

        MyList<String> myList = new MyList<>();
        myList.add("Apfel");
        myList.add("Banane");
        myList.add("Kirsche");
        myList.add("Dattel");
        myList.add("Erdbeere");


        System.out.println("----------------OLD FOREACH--------------");
        for(String liste : myList){
            System.out.println(liste);
        }





        //get
        System.out.println("------Test---------");
        System.out.println(myList.get(2));
        //replace
        myList.setElements(1, "Mango");
        System.out.println(myList.get(1));
        //insert
        myList.addAt(3, "Pfirsich");
        System.out.println(myList.get(3));
        //Delete
        myList.removeAt(0);
        System.out.println(myList.subList(1, 4));
        System.out.println("Dattel Index Of: "+ myList.indexOf("Dattel"));
        System.out.println(myList.lastIndexOf("Mango"));



        System.out.println("----------------NEW FOREACH--------------");
        for(String liste : myList){
            System.out.println(liste);
        }

    }

}
