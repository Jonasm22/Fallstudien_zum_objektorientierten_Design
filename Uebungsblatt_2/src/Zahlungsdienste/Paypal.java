package Zahlungsdienste;

public class Paypal implements IZahlungsdienst{

    double paypalPayment = 1;
    @Override
    public boolean autoriziereZahlung(double betrag) {
        return true;
    }

    @Override
    public String durchfueherenZahlungd(double betrag) {

        if (betrag >= paypalPayment) {
            System.out.println("Transaktionsnummer:");
        }
        return "PP-392034";
    }
}
