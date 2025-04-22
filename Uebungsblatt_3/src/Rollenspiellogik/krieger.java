package Rollenspiellogik;


 class krieger  extends Spielcharakter implements Strategie{

     @Override
     public void angreifen() {
         System.out.println("Der Krieger greift mit einem feurigen Schwert an");
     }

     @Override
     public void verteidigen() {
         System.out.println("Der Krieger verteidigt sich mit dem aufgewerteten Schild auf Stufe 99%.");
     }

     @Override
     public void kampfmanoever() {
         System.out.println("Der Krieger führt mit seinem Schwert ein neues Kampfmanöver durch");
     }

 }

 class Magier extends Spielcharakter implements Strategie{

    @Override
    public void angreifen() {
        System.out.println("Der Zauberer greift mit Cruciatus an");
    }

    @Override
    public void verteidigen() {
        System.out.println("Der Zauberer verteidigt sich mit dem Patronuszauber.");
    }

     @Override
     public void kampfmanoever() {
         System.out.println("der Zauberer führt verbotene Manöver aus");
     }
 }

