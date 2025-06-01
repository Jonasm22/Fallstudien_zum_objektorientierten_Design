package Beispiel_5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Gruppieren von Daten mit Collectors.groupingBy
public class GruppierenDatenGroupingBy {

    public static void main(String[] args) {
       test();
    }




    public static void woerterMitIhreLaenger(){


        List<String> woerter = Arrays.asList("haus", "baum", "autos", "boot","zug", "schule", "hof", "murcielago");


        Map<Integer, List<String>> woerterNachLaenge = woerter.stream()
                .collect(Collectors.groupingBy(words->words.length()));

        System.out.println (woerterNachLaenge);


    }


    public static void indexVocable(){
        List<String> woerter = Arrays.asList("haus", "baum", "autos", "boot","zug", "schule", "hof", "murcielago");

        List<String> beschreibungen = woerter.stream()
                .map(words -> {
            int laenge = words.length();
            int vokale = (int) words.chars()
                    .filter(vocals->"aeiou".indexOf(vocals) >= 0)
                    .count();
            return "'"+ words +"'"+ " has " + laenge + " woerter und " + vokale + " vokales";
        })
                .collect(Collectors.toList());

            beschreibungen.forEach(System.out::println);
    }


    public static void anfangsbuchstaben(){


        List<String> woerter = Arrays.asList("haus", "baum", "autos", "boot","zug", "schule", "hof", "murcielago");
        Map<Character, List<String>> woerterNachLaenge = woerter.stream()
                .collect(Collectors.groupingBy(w->w.charAt(0)));

        System.out.println(woerterNachLaenge);


    }


    public  static  void test(){

        List<String> namen = Arrays.asList("Anna", "Ben", "Clara", "Eva", "Tom");

        Map<Integer, List<String>> gruppiert = namen.stream()
                .collect(Collectors.groupingBy(String::length));

        gruppiert.forEach((laenge, liste)->{
            System.out.println("Länge: " + laenge + " " + liste );




        });

    }






}
