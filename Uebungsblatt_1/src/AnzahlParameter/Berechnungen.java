package AnzahlParameter;

public class Berechnungen {


    public static int multiplikation(int... value){

        int result = 1;
        for(int i : value){
            result *= i;
        }
        return result;

    }
    public static void main(String[] args) {


        int r = multiplikation(3,3,3,2,4,6);

        System.out.println(r);


    }

}
