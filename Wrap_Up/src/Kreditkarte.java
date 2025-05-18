import java.util.UUID;

public class Kreditkarte implements PaymentService {


    @Override
    public boolean betragAutorisierung(double zahlungsBetrag) {

        double maximaleBetrag = 1000.00;
        double betragInEuro = 0.00;

        if(zahlungsBetrag <= 0) {
            System.out.println("Ungültiger Betrag: Der Betrag muss größer als 0 sein.");
            return false;

        } else if(zahlungsBetrag > maximaleBetrag){
            System.out.println("Zahlung abgelehnt: Der Betrag überschreitet das Limit von " + maximaleBetrag + "€");
            return false;
        } else {
            double payment = betragInEuro + zahlungsBetrag;
            System.out.println("Sie haben: " +payment +  " €" + " bezahl");
            return true;
        }

    }

    @Override
    public String fuehreZahlungAus() {
        return "Transaktion ID:  " + UUID.randomUUID();
    }
}


class Paypal implements PaymentService{
    @Override
    public boolean betragAutorisierung(double zahlungsBetrag) {
        System.out.println("Paypal Akzeptiert");
        return true;
    }

    @Override
    public String fuehreZahlungAus() {
        return "Transaktion ID:  " + UUID.randomUUID();
    }
}

class Bitcoin implements PaymentService{
    @Override
    public boolean betragAutorisierung(double zahlungsBetrag) {
        double maximaleBTC = 0.02;
        double umrechnungskurs = 50000.0;

        double betragInBTC = zahlungsBetrag / umrechnungskurs;

        if(betragInBTC <= maximaleBTC){
            System.out.println("Bitcoin akzeptiert (BTC: " + betragInBTC + ")");
            return true;
        }else{
            System.out.println("Bitcoin abgelehnt – Betrag zu hoch (BTC: " + betragInBTC + ")");
            return false;
        }

    }

    @Override
    public String fuehreZahlungAus() {
        return "Transaktion ID:  " + UUID.randomUUID();
    }
}
