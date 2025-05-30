package Beispiel_3;

import java.util.Arrays;
import java.util.List;


//Reduktion mit reduce


public class ReduktionMitreduce {
    public static void main(String[] args) {
valMax();

    }
    public static void reduce_Exercise(){
        List<Integer> zahlen = Arrays.asList(5, 8, 3, 10);
        int summe = zahlen.stream()
                .reduce(1, (aac,n)-> aac+n);
        System.out.println("Summe: " + summe);
    }

    public static void Aufgabe_1(){
        List<Integer> zahlen = Arrays.asList(2, 4, 3);
        int mult = zahlen.stream()
                .reduce(1, (aac,n)-> aac*n);
        System.out.println("Multiplication: " + mult);
    }


    public static void Aufgabe_2(){
        List<String> texte = Arrays.asList("Mo", "di", "fi");
        String txt = texte.stream()
                .reduce("", (acc,teil)-> acc+teil);
        System.out.println(txt);

    }

    public static void valMax(){
      //  Maximum mit reduce (eine Möglichkeit):
        List<Integer> werte = Arrays.asList(5, 17, 9, 3);
        int max = werte.stream()
                .reduce(Integer.MIN_VALUE,(acc, n) -> acc > n ? acc : n);
        System.out.println("Max: " + max);
    }
}



