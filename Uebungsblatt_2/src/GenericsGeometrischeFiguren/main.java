package GenericsGeometrischeFiguren;

public class main {

    public static void main(String[] args) {

        IFlaecheninhal[] figuren = new IFlaecheninhal[8];
        //Quadrat
        figuren[0] = new Quadrat<>(5);
        figuren[1] = new Quadrat<>(5.5);

        //Recheck
        figuren[2] = new Rechteck<>(4 , 5);
        figuren[3] = new Rechteck<>(4.5 , 5.9);

        //Dreieck
        figuren[4] = new Dreieck<>(8 , 9);
        figuren[5] = new Dreieck<>(8.9 , 15.2);

        //Kreis

        figuren[6] = new Kreis<>(6);
        figuren[7] = new Kreis<>(8.9);


        for(int i = 0; i< figuren.length; i++){
            System.out.println("Fläche Figur: " +  (i+1) + ": "+ figuren[i].gibFlaechenInhalt());
        }

    }



}