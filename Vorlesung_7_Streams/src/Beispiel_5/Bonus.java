package Beispiel_5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Bonus {

    public static void wordsList(){
        List<String> woerter = Arrays.asList("haus", "baum", "autos", "boot", "zug", "schule", "hof");

        Map<Integer, List<String>> filter = woerter.stream()
                .collect(Collectors.groupingBy(w->w.length(),
                        Collectors.collectingAndThen(
                        Collectors.mapping(w->w,Collectors.toList()
                        ), list->{
                            list.sort(Comparator.naturalOrder());
                            return list;
                        }

                )));

        System.out.println(filter);


    }


    public static void main(String[] args) {

        wordsList();
    }
}
