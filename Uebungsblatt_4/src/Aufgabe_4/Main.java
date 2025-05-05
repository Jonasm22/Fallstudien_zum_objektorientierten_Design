package Aufgabe_4;

public class Main {
    public static void main(String[] args) {
        // Instanz von MyGenericCollection<Animal>
        MyGenericCollection<Animal> animals = new MyGenericCollection<>();

        // Dog- und Cat-Objekte hinzufügen
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());

        // Alle Beschreibungen und Geräusche ausgeben

        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            System.out.println(animal.describe());
            System.out.println("Sound:" + animal.getSound());
            System.out.println();

        }

    }
}
