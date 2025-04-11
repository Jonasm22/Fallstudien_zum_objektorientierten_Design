package Zahlungsdienste;

public class Kredikarte implements IZahlungsdienst {


    double credicardPaymentLimit = 1000;

    @Override
    public boolean autoriziereZahlung(double betrag) {
        if (betrag <=credicardPaymentLimit) {
            System.out.println("Zahlung wurde Akzeptiert");
            return true;
        } else{
            System.out.println("Zahlung wurde Abgelehnt");
            return false;
        }

    }

    @Override
    public String durchfueherenZahlungd(double betrag) {
        return "";
    }

}
