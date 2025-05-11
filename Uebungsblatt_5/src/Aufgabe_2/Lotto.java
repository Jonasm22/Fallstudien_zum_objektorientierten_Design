package Aufgabe_2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {


    public static void main(String[] args) {

        for (int i = 0; i < 10 ; i++) {

            //HashSet -> (duplikatfrei)
            //HashSet<Integer> lotteryNumbers = new HashSet<>();
            Set<Integer> lotteryNumbers = new HashSet<>();

            while (lotteryNumbers.size() < 6){
                Random random = new Random();
                int zahl = random.nextInt(49) +1; // 48 + 1 = 49

                lotteryNumbers.add(zahl);
            }
            System.out.println("lottery Numbers: " + lotteryNumbers);
        }
    }



}
