package Waschmaschine;

public enum Temperature {
    COLD(20),
    WARM(40),
    HOT(60);

    private final int temperaturWert;

    //Konstructor
    Temperature(int temperaturWert) {
        this.temperaturWert = temperaturWert;
    }

    //getter
    public int getTemperaturWert() {
        return this.temperaturWert;
    }
}


