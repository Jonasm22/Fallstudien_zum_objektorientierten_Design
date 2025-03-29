package Waschmaschine;

public enum Temperature {
    COLD(20),
    WARM(40),
    HOT(60);

    private final int temperaturWert;

    private Temperature(int temperaturWert) {
        this.temperaturWert = temperaturWert;
    }

    public int getTemperaturWert() {

        return this.temperaturWert;
    }
}


