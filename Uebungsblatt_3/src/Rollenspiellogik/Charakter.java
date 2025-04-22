package Rollenspiellogik;

public class Charakter {
    public static void main(String[] args) {
       krieger krieger = new krieger();
       krieger.kampfmanoever();
       krieger.angreifen();
       krieger.kampfmanoever();

        System.out.println("----------------------------");

       Magier magier = new Magier();
       magier.angreifen();
       magier.kampfmanoever();
       magier.verteidigen();


    }
}
