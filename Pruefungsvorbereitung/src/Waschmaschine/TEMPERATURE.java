package Waschmaschine;

public enum TEMPERATURE {

    COLD(20),
    WARM(40),
    HOT(60);

    private int TemperatureWerten;

    TEMPERATURE(int temperatureWerten) {
        TemperatureWerten = temperatureWerten;
    }

    public int getTemperatureWerten() {
        return TemperatureWerten;
    }


}

