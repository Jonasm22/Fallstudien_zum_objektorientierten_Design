package Bibliotheksverwaltungssystem;

public class Program {
    public static void main(String[] args)  {

        Bibliothek bibliothek = new Bibliothek();
        bibliothek.hinzufuegenBuch(new Buch("Buch A" , "A"));
        bibliothek.hinzufuegenBuch(new Buch("Buch B" , "B"));
        bibliothek.hinzufuegenBuch(new Buch("Buch C" , "C"));


        try{
            bibliothek.ausleihenBuch("Buch A");
            System.out.println("Buch wurde erfolgreich ausgeliehen.");

        } catch (NichtVerfuegbarException e){

            System.out.println("Fehler: " + e.getMessage());

        }


        bibliothek.anzeigeVerfuegbareBucher();
        bibliothek.rueckgabeBuch("Buch A");
        bibliothek.anzeigeVerfuegbareBucher();

    }
}
