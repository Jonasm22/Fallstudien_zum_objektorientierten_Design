package Aufgabe_4;

public class Dummy {
    private String name;
    private int nummer;

    public Dummy(String name, int nummer) {
        this.name = name;
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Nummer: " + nummer;
    }
}
