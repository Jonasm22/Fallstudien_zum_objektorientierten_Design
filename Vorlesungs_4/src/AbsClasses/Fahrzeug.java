package AbsClasses;

import javax.xml.namespace.QName;

abstract class Fahrzeug {
    String marke;
    //Konstruktor
    public Fahrzeug(String marke) {
        this.marke = marke;
    }
    abstract void beschleunigen(int wert);

    void zeigeMarke(){
        System.out.println(marke + ": Audi");
    }
}

class Auto extends Fahrzeug{

    public Auto(String marke) {
        super(marke);
    }

    @Override
    void beschleunigen(int wert) {
        System.out.println("Auto beschleunigt um " + wert + " km/h.");
    }
}