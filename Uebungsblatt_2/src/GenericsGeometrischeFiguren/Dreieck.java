package GenericsGeometrischeFiguren;

public class Dreieck <T extends Number>  implements IFlaecheninhal {
    private T grundSeite;
    private T hoehe;

    public Dreieck(T grundSeite, T hoehe) {
        this.grundSeite = grundSeite;
        this.hoehe = hoehe;
    }

    @Override
    public double gibFlaechenInhalt() {
        return  (grundSeite.doubleValue() * hoehe.doubleValue() ) / 2;

    }
}
