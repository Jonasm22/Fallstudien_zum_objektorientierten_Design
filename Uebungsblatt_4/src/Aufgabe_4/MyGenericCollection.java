package Aufgabe_4;

import java.util.ArrayList;
import java.util.List;

public class MyGenericCollection <T>{
    private ArrayList<T> items;

    public MyGenericCollection() {
        items = new ArrayList<>();
    }

    //Fügt ein Element zur Sammlung hinzu.
    void add(T item){
        items.add(item);
    }

    /*
    * Entfernt ein Element aus der Sammlung.
    * Gibt true zurück, wenn das Element erfolgreich entfernt wurde, andernfalls false
    */
    boolean remove(T item){
      return items.remove(item);
    }

    //Gibt das Element an der angegebenen Position zurück.
     T get(int index){
        return items.get(index);
    }

    //Gibt die Anzahl der Elemente in der Sammlung zurück.
    int size(){
      return items.size();
    }
}
