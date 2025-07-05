package Beispiel_4;

import Beispiel_2.Exercise_2;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


//Flache Strukturen mit flatMap
public class FlacheStrukturen_flatmap {

    public static void main(String[] args) {

     worterSammel();

    }



    public static void useSplit(){


        String phrase = "Learning Java is really fun";
        String[] result = phrase.split(" ");
        System.out.println("Option 1: " + Arrays.toString(result));
        for (String w : result){
            System.out.println("Option 2: " +w);

        }

    }
    public static void worterSammel(){
        List<String> saetze = Arrays.asList(
                "I love Java",
                "Streams are powerful",
                "flatMap flattens streams"
        );


        List<String> sammel = saetze.stream()
                .map( s->s.split(" "))
                .flatMap(arr->Arrays.stream(arr))
                .collect(Collectors.toList());
        System.out.println(sammel);
    }


    public static void exercise(){
        List<List<Integer>> zahlenListen =
                Arrays.asList(
                        Arrays.asList(1,2,3),
                        Arrays.asList(4,5),
                        Arrays.asList(6,7,8)
                );

        int gesamtSumme = zahlenListen.stream()
                .flatMap(list->list.stream())
                .reduce(0,Integer ::sum);

        System.out.println("Summe: " + gesamtSumme);

    }

    public static  void saetze(){

        List<String> listOfColors = Arrays.asList("rot,grün", "blau,gelb");

        List<String>colors = listOfColors.stream()
                .map(c->c.split(","))
                .flatMap(col->Arrays.stream(col))
                .collect(Collectors.toList());

        System.out.println(colors);

    }





}
