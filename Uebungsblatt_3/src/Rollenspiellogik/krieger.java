package Rollenspiellogik;


 class krieger  extends Spielcharakter implements Strategie{

     //attack
     @Override
     public void angreifen() {
         System.out.println("Der Krieger greift mit einem feurigen Schwert an");
     }
     //defend
     @Override
     public void verteidigen() {
         System.out.println("Der Krieger verteidigt sich mit dem aufgewerteten Schild auf Stufe 99%.");
     }
     //combat maneuvers
     @Override
     public void kampfmanoever() {
         System.out.println("Der Krieger führt mit seinem Schwert ein neues Kampfmanöver durch");
     }

 }

 class Magier extends Spielcharakter implements Strategie{

     //attack
    @Override
    public void angreifen() {
        System.out.println("Der Zauberer greift mit Cruciatus an");
    }
    //defend
    @Override
    public void verteidigen() {
        System.out.println("Der Zauberer verteidigt sich mit dem Patronus.");
    }
    //combat maneuvers
     @Override
     public void kampfmanoever() {
         System.out.println("der Zauberer führt verbotene Manöver aus");
     }
 }

