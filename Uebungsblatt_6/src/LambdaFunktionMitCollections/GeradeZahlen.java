package LambdaFunktionMitCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeradeZahlen {
    public static void main(String[] args) {
        List<Integer> listOfNummers = Arrays.asList(1,3,4,6,22,48,22,10,60,7,9,11);
        System.out.println(listOfNummers);

        List<Integer> geradeZahlen = new ArrayList<>();

       // listOfNummers.forEach(numbers-> System.out.println((numbers % 2 == 0))
        listOfNummers.forEach(numbers-> {
            if (numbers % 2 == 0) {
                geradeZahlen.add(numbers);
            }

        });

        System.out.println(geradeZahlen);


    }
}
