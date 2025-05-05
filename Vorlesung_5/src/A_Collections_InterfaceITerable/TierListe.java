package A_Collections_InterfaceITerable;

import java.util.ArrayList;
import java.util.Iterator;

public class TierListe implements Iterable<String> {

    private ArrayList<String> tiere = new ArrayList<>();


    public void fuellen(){
        tiere.add("Mouse");
        tiere.add("Hund");
        tiere.add("Katze");
        tiere.add("Papagei");
        tiere.add("Hamster");
    }

    @Override
    public Iterator<String> iterator() {
        return tiere.iterator();
    }

    public static void main(String[] args) {

        TierListe tierListe = new TierListe();

        tierListe.fuellen();
        for(String tier : tierListe){
            System.out.println(tier);
        }
    }



}
