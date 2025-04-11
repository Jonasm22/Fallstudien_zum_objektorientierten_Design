package GenericsGeometrischeFiguren;

public class Rechteck <T extends Number> implements IFlaecheninhal{
    private T breite;
    private T hoehe;

    public Rechteck(T breite, T hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }

    @Override
    public double gibFlaechenInhalt() {
        return  breite.doubleValue() * hoehe.doubleValue();
    }
}
