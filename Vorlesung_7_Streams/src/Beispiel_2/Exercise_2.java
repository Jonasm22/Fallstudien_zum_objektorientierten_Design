package Beispiel_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


//Sortieren eines Streams mit sorted
public class Exercise_2 {
    public static void main(String[] args) {

        exercise();
    }


    public static void sorting(){

        List<Integer> unsortiert = Arrays.asList(42, 5, 17, 8, 23);
        List<Integer> sorted =  unsortiert.stream()
                .sorted()
                //.sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sorted);

    }



    public static void exercise(){
        List<String> namen = Arrays.asList("Lisa", "Adam", "Mona", "Ben");
        List<String> sortedNames = namen.stream().sorted()
                //.sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedNames);
    }

}
