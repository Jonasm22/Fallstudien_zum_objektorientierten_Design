import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {


    public static void main(String[] args) {

      List<Integer> zahlen = Arrays.asList(3, 7, 4, 9, 12, 8, 6);
      List<Integer> ergebnis = zahlen.stream()
              .filter(n -> n % 2==0)
              .map(n -> n * 2)
              .collect(Collectors.toList());

        //System.out.println(ergebnis);

        //<Sorting>
        List<Integer> unsortiert = Arrays.asList(42, 5, 17, 8, 23);
        List<Integer> sortiert =unsortiert.stream()
                .sorted()
                .collect(Collectors.toList());

       // System.out.println("zahlen sortiert: " +sortiert);




        List<Integer> absteigend = unsortiert.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

       //System.out.println("zahlen  absteigend sortiert: " + absteigend);

        //</Sorting>
        /*
        *
        *
        */

        //<Ausgabe 1>
        List<String> namen = Arrays.asList("Lisa", "Adam", "Mona", "Ben");
        List<String> namenSortiert = namen.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(namenSortiert);



        List<String> namenAbsteigend = Arrays.asList("Lisa", "Adam", "Mona", "Ben");
        List<String> namenAbsteigendSortiert = namen.stream()
                .sorted(Comparator.reverseOrder())
                //.filter(Collectors.toList());
                .collect(Collectors.toList());
        System.out.println(namenAbsteigendSortiert);


        //</Ausgabe 1>

        /*
        *
        * */

        //<Reduce>


        List<Integer> numbers = Arrays.asList(5, 8, 3, 10);
        int summe = numbers.stream()
                .reduce(0, (acc, n) ->  acc + n);
        System.out.println("Summe: " +  summe);



    }


}
