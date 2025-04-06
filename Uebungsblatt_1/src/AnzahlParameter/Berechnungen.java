package AnzahlParameter;

public class Berechnungen {

    public  static int multiplikation(int... numbers){
        int result = 1;
        for( int num : numbers){
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println( "Ergebnis: " + multiplikation(6,3,7));

    }

}
