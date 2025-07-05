package Bibliotheksverwaltungssystem;

public class Videospiele extends Buch{
    private String titel;
    private String genre;
    private  boolean ausgeliehen;

    public Videospiele(String titel, String autor, String titel1, String genre) {
        super(titel, autor);
        this.titel = titel1;
        this.genre = genre;
        this.ausgeliehen = false;
    }

    @Override
    public String toString() {
        return "Videospiele{" +
                "titel='" + titel + '\'' +
                ", genre='" + genre + '\'' +
                ", ausgeliehen=" + ausgeliehen +
                '}';
    }
}
