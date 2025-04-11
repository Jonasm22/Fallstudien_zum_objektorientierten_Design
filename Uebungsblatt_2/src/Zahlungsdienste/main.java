package Zahlungsdienste;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

       //Kreditkarte
       // IZahlungsdienst kreditkarte = new Kredikarte();
     //  kreditkarte.autoriziereZahlung(1000);


       List<IZahlungsdienst> zahlungsdiensts = new ArrayList<>();
       zahlungsdiensts.add((new Paypal()));




    }
}
