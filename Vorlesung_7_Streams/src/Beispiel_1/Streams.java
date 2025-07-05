package Beispiel_1;

import java.util.Arrays;
import java.util.List;

public class Streams {

    //Filtern und Transformieren mit filter und map
    public static void main(String[] args) {

    FilternEinerListe();

    }


    public static void FilternEinerListe(){

      //alle geraden Zahlen daraus ausgeben
      List<Integer> zahlen = Arrays.asList(1,2,3,4,5,6,7,8,9);
      zahlen.stream()
             .filter(n -> n % 2 != 0) // Filter immer mit lambda anwenden
              //.filter(n -> n <= 4 ) // Filter immer mit lambda anwenden
              .forEach(System.out::println);


    }

    public static void FilternEinerListe_Exercise(){
          //alle Namen, die mit "A" beginnen
        List<String> nameList = Arrays.asList("Anna", "Albert", "Berta", "Anton", "Zacharias");
        nameList.stream()
                .filter(nameWith_a -> nameWith_a.toLowerCase().startsWith("a"))
                .forEach(System.out::println);
    }

}
