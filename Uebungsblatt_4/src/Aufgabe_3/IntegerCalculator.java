package Aufgabe_3;



public class IntegerCalculator implements ICalculator<Integer> {


    @Override
    public Integer addieren(Integer a, Integer b) {
        int result = a + b;
        return Integer.valueOf(result);
    }

    @Override
    public Integer subtrahieren(Integer a, Integer b) {
        int result = a - b;
        return Integer.valueOf(result);
    }

    @Override
    public Integer multiplizieren(Integer a, Integer b) {
        int result = a * b;
        return Integer.valueOf(result);
    }

    @Override
    public Integer dividieren(Integer a, Integer b) {
        if( b == 0)
            throw new IllegalArgumentException("Division by Zero is not Possible");
        int result = a / b;
        return Integer.valueOf(result);
    }
}


class myMain{
    public static void main(String[] args) {

        IntegerCalculator  calculator = new IntegerCalculator();
        System.out.println("addition result = " + calculator.addieren(10, 20));
        System.out.println("subtraction result = " + calculator.subtrahieren(50, 40));
        System.out.println("multiplication result = " + calculator.multiplizieren(10, 60));
        System.out.println("division result = " + calculator.dividieren(90, 3));




    }
}
