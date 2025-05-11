package Aufgabe_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class UmgedrehteReihenfolge {


    public static void InverseNumbers() {

        //Stack am besten
        //ArrayList<Integer> zahlen = new ArrayList<>();
        Stack<Integer> zahlen = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahlen eingeben: ");
        int zahl = scanner.nextInt();

        while (true) {
            if(zahl == 0){
                break;
            }
            zahlen.add(zahl);
            zahl = scanner.nextInt();

        }

        scanner.close();
        System.out.println("Eingegebene Zahlen: " +zahlen);
        Collections.reverse(zahlen);
        System.out.println("Inverse Zahlen: " + zahlen);
    }


    public static void main(String[] args) {

        InverseNumbers();

    }
}


