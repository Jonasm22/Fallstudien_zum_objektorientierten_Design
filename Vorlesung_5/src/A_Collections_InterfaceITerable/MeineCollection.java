package A_Collections_InterfaceITerable;

import java.util.ArrayList;

public class MeineCollection <T> {
    private ArrayList<T> elemente = new ArrayList<>();

    public void add (T elements){
        elemente.add(elements);
    }

    public void Delete(T elements){
        elemente.remove(elements);
    }



    public boolean contains(T elements){
        return  elemente.contains(elements);
    }


    public int elementSize(){
        return elemente.size();

    }



    public void clean(){
        elemente.clear();
    }

    public static void main(String[] args) {

        MeineCollection<String> sachen = new MeineCollection<>();
        sachen.add("laptop");
        sachen.add("handy");
        sachen.add("ipad");
        sachen.add("macbook");

        sachen.Delete("laptop");
        //System.out.println(sachen.contains("laptop"));
        //System.out.println(sachen.elementSize());
        sachen.clean();
        System.out.println(sachen.elementSize());
        for(String s : sachen.elemente){
            System.out.println(s);
        }



    }
}
