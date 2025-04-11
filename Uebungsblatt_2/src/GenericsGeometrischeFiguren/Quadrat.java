package GenericsGeometrischeFiguren;

public class Quadrat <T extends Number> implements IFlaecheninhal {
    private T seite;

    public Quadrat(T seite) {
        this.seite = seite;
    }

    @Override
    public double gibFlaechenInhalt() {
        double s = seite.doubleValue();
        return s*s;
    }
}
