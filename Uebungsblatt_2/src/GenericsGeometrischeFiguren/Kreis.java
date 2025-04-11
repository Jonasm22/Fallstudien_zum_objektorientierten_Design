package GenericsGeometrischeFiguren;

public class Kreis<T extends Number> implements IFlaecheninhal {
    private T radius;

    public Kreis(T radius) {
        this.radius = radius;
    }

    @Override
    public double gibFlaechenInhalt() {
        return Math.PI * radius.doubleValue() * radius.doubleValue();
    }
}
