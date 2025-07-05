
/*
* Das System sollte folgende Funktionen unterstützen:
    - Hinzufügen von Büchern zur Bibliothek.
    - Ausleihen von Büchern an Benutzer.
    - Rückgabe von Büchern.
    - Anzeigen der verfügbaren Bücher
* */

package Bibliotheksverwaltungssystem;

public class Buch {

    private  String titel;
    private  String autor;
    private  boolean  ausgeliehen;

    public Buch(String titel, String autor) {
        this.titel = titel;
        this.autor = autor;
        this.ausgeliehen = false;
    }

    public String getTitel() {
        return titel;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isAusgeliehen() {
        return ausgeliehen;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAusgeliehen(boolean ausgeliehen) {
        this.ausgeliehen = ausgeliehen;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "titel='" + titel + '\'' +
                ", autor='" + autor + '\'' +
                ", ausgeliehen=" + ausgeliehen +
                '}';
    }

    

}
