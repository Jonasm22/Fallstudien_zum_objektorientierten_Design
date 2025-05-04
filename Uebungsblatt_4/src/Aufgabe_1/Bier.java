package Aufgabe_1;
import java.util.*;

public class Bier implements Comparable<Bier>{

    //Attibuten
    private String name;
    private String herkunft;
    private double flascheinhalt;

    //Konstructor
    public Bier(String name, String herkunft, double flascheinhalt) {
        this.name = name;
        this.herkunft = herkunft;
        this.flascheinhalt = flascheinhalt;
    }

    //Getter
    public String getName() {
        return name;
    }

    public String getHerkunft() {
        return herkunft;
    }

    public double getFlascheinhalt() {
        return flascheinhalt;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setHerkunft(String herkunft) {
        this.herkunft = herkunft;
    }

    public void setFlascheinhalt(double flascheinhalt) {
        this.flascheinhalt = flascheinhalt;
    }

    //toString Methode
    @Override
    public String toString() {
        return "Bier-name: " + name + " || Herkunft: " + herkunft + " || Flasche Inhalt: " + flascheinhalt + " lt";
    }

    // compareTo Methode
    @Override
    public int compareTo(Bier o) {
        return this.name.compareTo(o.name);
    }


    public static void sortBeerArray(){

        System.out.println("-------------------------------------------------------");
        System.out.println("Sorting beer names with a simple array");
        System.out.println("-------------------------------------------------------");

        Bier[] biers = new Bier[]{

                (new Bier("Augustiner", "Deutschland", 0.5)),
                (new Bier("Corona", "Mexico", 0.355)),
                (new Bier("Becks", "Deutschland", 0.5)),
                (new Bier("Heineken", "Holland", 0.33))
        };

                 Arrays.sort(biers);

                for( Bier bier : biers){
                    System.out.println(bier);
                }

    }

    public static void  sortBeerList(){


        System.out.println("-------------------------------------------------------");
        System.out.println("Sorting beer names with an ArrayList");
        System.out.println("-------------------------------------------------------");

        ArrayList<Bier> bierArrayList = new ArrayList<>();
        bierArrayList.add(new Bier("Augustiner", "Deutschland", 0.5));
        bierArrayList.add(new Bier("Heineken", "Holland", 0.33));
        bierArrayList.add(new Bier("Corona", "Mexico", 0.35));
        bierArrayList.add(new Bier("Becks", "Deutschland", 0.5));

        Collections.sort(bierArrayList);

        for( Bier bier : bierArrayList){
            System.out.println(bier);
        }

    }


    public static void main(String[] args) {

        sortBeerArray();
        sortBeerList();

    }

}