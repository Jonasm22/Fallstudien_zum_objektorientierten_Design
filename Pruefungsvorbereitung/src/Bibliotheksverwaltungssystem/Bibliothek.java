package Bibliotheksverwaltungssystem;

import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    private final List<Buch> buecher = new ArrayList<>();
   // private final List<Videospiele> games = new ArrayList<>();

    public void hinzufuegenBuch(Buch buch){
        buecher.add(buch);
       // System.out.println(buch);
    }


    public void ausleihenBuch(String titel)  throws NichtVerfuegbarException {

        for (Buch buch : buecher) {
            if (buch.getTitel().equals(titel)) {
                if(buch.isAusgeliehen()){
                    throw new NichtVerfuegbarException("Das Buch ist nicht verfügbar");

                } else {

                    buch.setAusgeliehen(true);
                    return;
                }
            }

        }
    }

    public void rueckgabeBuch(String titel){

        for(Buch buch : buecher){
            if(buch.getTitel().equals(titel)){
                buch.setAusgeliehen(false);
            }
        }
    }


    public void anzeigeVerfuegbareBucher(){

        System.out.println(buecher +"\n");

    }


}


// Method NichtVerfuegbarException
  class NichtVerfuegbarException  extends Exception{
    public  NichtVerfuegbarException (String message){
        super(message);
    }


}

