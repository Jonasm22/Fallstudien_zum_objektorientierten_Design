package AbsClasses;

abstract class KLASSENAME {
    //Abstract Mehode (Ohne Implementierung)
    abstract void MYMETHODE();
    void konkreteMethode(){
        System.out.println("Hallo ich bin ein Methode");
    }

}

class UNTERKLASSENNAME extends KLASSENAME{
    @Override
    void MYMETHODE() {
        System.out.println("Spezifische Implementierung in der Unterklasse");
    }
}
