package Collections_InterfaceITerable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class BuchListe<T> implements Iterable<T>{
    private ArrayList<T> buchListe = new ArrayList<>();

    public void addBuch(T buch){
        buchListe.add(buch);
    }

    @Override
    public Iterator<T> iterator() {
        return buchListe.iterator();
    }


    public static void main(String[] args) {
        BuchListe<String> liste = new BuchListe<>();
        liste.addBuch("Buch 1");
        liste.addBuch("Buch 2");
        liste.addBuch("Buch 3");
        liste.addBuch("Buch 4");


        BuchListe<Integer> ISBN = new BuchListe<>();
        ISBN.addBuch(123);
        ISBN.addBuch(3533);
        ISBN.addBuch(664);
        ISBN.addBuch(2453);

        for(int buch : ISBN){

            System.out.println(buch);

        }

    }

}
