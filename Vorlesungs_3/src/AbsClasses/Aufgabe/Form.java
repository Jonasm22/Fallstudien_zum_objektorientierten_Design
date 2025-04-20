package AbsClasses.Aufgabe;

abstract class Form {
    //abstract methode
    abstract double berechneFlaeche();
}

class Rechteck extends Form{
    //attribute
    double laenge;
    double breite;


    public Rechteck() {
    }

    // Konstructor
    protected Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }
    //Abstract methode
    @Override
    double berechneFlaeche() {
        return Math.round(laenge * breite);
    }
}

class Circle extends  Form{
    double radius ;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double berechneFlaeche() {
        return Math.round(Math.PI * radius * radius);
    }
}


 class myMain {
     public static void main(String[] args) {

         //Option 1
        /*Form[] figuren = new Form[4];
        figuren[0] = new Circle(6);
        figuren[1] = new Circle(30);
        figuren[2] = new Rechteck(50 , 70);
        figuren[3] = new Rechteck(50 , 90);
        */

         //Option 2
         Form[] formen = new Form[]{
                 new Rechteck(5, 4),
                 new Rechteck(10, 45),
                 new Circle(91),
                 new Circle(46)
         };


         for (Form figur : formen) {
             if (figur instanceof Circle) {
                 System.out.println("Kreis: " + figur.berechneFlaeche());
             } else if (figur instanceof Rechteck) {
                 System.out.println("Rechteck: " + figur.berechneFlaeche());
             }


         }

     }


 }
