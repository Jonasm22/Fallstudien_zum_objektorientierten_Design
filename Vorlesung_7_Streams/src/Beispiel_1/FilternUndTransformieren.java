package Beispiel_1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilternUndTransformieren {

    //Filtern und Transformieren mit filter und map
    public static void main(String[] args) {

      ZahlenVerdoppeln();
    }

    public static void ZahlenVerdoppeln(){

        List<Integer> numbers = Arrays.asList(3, 7, 4, 9, 12, 8, 6);
        List<Integer> verdoppelt = numbers.stream() // neu Liste
                .filter(n ->n % 2 == 0)
                .map( n -> n*2)
                .collect(Collectors.toList()); // wird auf die neue Liste gespeichert

        System.out.println(verdoppelt);

    }


    public static void deleteDuplicate(){

        List<Integer> numbers =  Arrays.asList(3, 3, 4, 9, 9, 8, 6);
        Set<Integer> ergebnis = numbers.stream()
                .filter(n ->n % 2 == 0)
                .collect(Collectors.toSet()); // wird auf die neue Liste gespeichert
        System.out.println(ergebnis);


        List<String> names =  Arrays.asList("a", "a", "b", "c", "d", "c", "b");
        Set<String> ergebnisnames = names.stream()
                // .filter(n ->n % 2 == 0)
                .collect(Collectors.toSet()); // wird auf die neue Liste gespeichert
        System.out.println(ergebnisnames);

    }


    public static  void Excersice(){
        List<String> woerter = Arrays.asList("Java", "Stream", "API", "Lambda", "Filter", "Map");
        List<String> gross = woerter.stream()
               // .filter(w -> w.contains("e"))
                //.map(up-> up.toUpperCase()).sorted()
                .map(String :: toUpperCase)
                        .collect(Collectors.toList());
        System.out.println(gross);

        System.out.println("For-each");
        System.out.println("--------------------------------");
        List<String> Alphabet = Arrays.asList("A", "b", "c", "D", "e", "f");
        Alphabet.stream()
                .map(up-> up.toUpperCase()).sorted()
                .forEach(System.out::println);



    }






}
