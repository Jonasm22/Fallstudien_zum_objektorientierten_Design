package InterfaceIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MyCollectiosn <T> implements Iterable<T>{
    private ArrayList<T> elemente = new ArrayList<>();

    public void add (T element){
        elemente.add(element);
    }

    public void remove(T element){
        elemente.remove(element);
    }

    public boolean contains(T element){
        return elemente.contains(element);
    }
    public int size(){
        return elemente.size();
    }

    public void clean(){
        elemente.clear();
    }


    @Override
    public Iterator<T> iterator() {
        return elemente.iterator();
    }


    public static void main(String[] args) {

        MyCollectiosn<String> obs = new MyCollectiosn<>();
        obs.add("Apfel");
        obs.add("Banane");
        obs.add("Kirsche");
        obs.add("Dattel");
        obs.add("Erdbeere");

        System.out.println("Größe vor Iteration: " + obs.size());

        System.out.println("Alle Elemente mit Iterator:" );

        Iterator<String> iterator = obs.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Holen wir einen neuen Iterator
        iterator = obs.iterator();


        if(iterator.hasNext()){
            String deleteElements =  iterator.next();  // Erstes Element holen
            iterator.remove();
            System.out.println("Entferntes Element: " + deleteElements);
        }

        System.out.println("Größe nach Entfernen: " + obs.size());

        System.out.println("Alle Elemente nach Entfernen (mit for-each):");
        for (String element : obs) {
            System.out.println(element);
        }
    }
}
