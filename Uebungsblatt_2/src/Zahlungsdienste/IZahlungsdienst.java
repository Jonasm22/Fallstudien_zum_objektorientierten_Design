package Zahlungsdienste;

public interface IZahlungsdienst {
    boolean autoriziereZahlung(double betrag);
    String durchfueherenZahlungd(double betrag);

}

