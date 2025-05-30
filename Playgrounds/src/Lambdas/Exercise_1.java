package Lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise_1 {
            public static void main(String[] args) {

                E_6();


            }


            public static void E_1(){

                //CompareTo for filter
                List<String> nombres = Arrays.asList("Juan", "María", "Pedro", "Ana");
                Collections.sort(nombres, (s1, s2) -> s1.compareTo(s2));
                nombres.forEach(personen -> System.out.println(personen));



            }

            public static void E_2(){

                List<Integer> numeros = Arrays.asList(5, 2, 9, 1, 4);

                numeros.sort((a , b) -> b-a);
                //numeros.sort((a , b) -> b.compareTo(a));
                numeros.forEach(n -> System.out.println(n));

            }

            public static void E_3(){

                List<String> palabras = Arrays.asList("Agua", "Perro", "Avión", "Casa", "Abeja");
                palabras.forEach(filter -> {
                    if(filter.startsWith("A")){
                        System.out.println(filter);
                    }
                });



            }






    public static void E_4(){
        List<String> frutas = Arrays.asList("manzana", "banana", "pera", "uva");
        frutas.forEach(words -> System.out.println(words.toUpperCase()));


    }

    public static void E_5(){
        List<String> nombres = Arrays.asList("Ana", "Marcos", "Luis", "Fernando", "Sol");

        nombres.forEach(countingWords -> {
            if(countingWords.length() >= 4){
                System.out.println(countingWords);
            }

        });


    }


    public static void E_6(){
        List<String> palabras = Arrays.asList("Agua", "Estrella", "Invierno", "Sol", "Universo", "Luz", "Oso");

        palabras.forEach(startWithVowel -> {

            char firstWord = startWithVowel.toUpperCase().charAt(0);

            if("AEIOU".indexOf(firstWord) >=0 && startWithVowel.length() >= 5){

                System.out.println(startWithVowel);
            }


        });




    }

            public static void E_7(){
                Comparator<String> comparator = new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        return s1.length() - s2.length();
                    }


                };



            };
}