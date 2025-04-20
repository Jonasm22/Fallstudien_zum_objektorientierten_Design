package AbsClasses;

abstract class Tier {
    String name;

    public Tier(String name) {
        this.name = name;
    }

    // Abstrakte Methode - Keine imlementierung hier
    abstract  void macheGeraeusch();


    // eine normale methode
    void schlafen(){
        System.out.println(name + "schäft");
    }

}

class Hund extends Tier{
    //Konstructor Hund
    public Hund(String name) {
        super(name);
    }
    @Override
    void macheGeraeusch() {
        System.out.println(name + "bellt: Wuff!" );
    }
}