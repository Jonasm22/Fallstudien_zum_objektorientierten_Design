package GenericsGeometrischeFiguren;

public class GenericGeometricFigure <T extends IFlaecheninhal>{
    private T figure;

    public GenericGeometricFigure(T figure) {
        this.figure = figure;
    }

    public double fleacheInhalt(){
        return figure.gibFlaechenInhalt();
    }

}
