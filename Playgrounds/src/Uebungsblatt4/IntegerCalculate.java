package Uebungsblatt4;

import java.util.function.BiFunction;
import java.util.zip.ZipEntry;

public class IntegerCalculate<T extends Number>  implements ICalculator<T> {

    @Override
    public T addieren(T... values) {
        return calculate((a, b) -> a + b, values);
    }

    @Override
    public T subtrahieren(T... values) {
        return calculate((a, b) -> a - b, values);
    }

    @Override
    public T multiplizieren(T... values) {
        return calculate((a, b) -> a * b, values);
    }

    @Override
    public T dividieren(T... values) {
        return calculate((a, b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("Division by zero is not allowed.");
            }
            return a / b;
        }, values);
    }

    private T calculate(BiFunction<Double, Double, Double> operation, T... values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("At least one value is required.");
        }
        double result = values[0].doubleValue(); // empezamos con el primer valor

        for (int i = 1; i < values.length; i++) {
            result = operation.apply(result, values[i].doubleValue());
        }

        // Devolver respetando el tipo original
        if (values[0] instanceof Integer) {
            return (T) Integer.valueOf((int) result);
        } else if (values[0] instanceof Double) {
            return (T) Double.valueOf(result);
        } else if (values[0] instanceof Float) {
            return (T) Float.valueOf((float) result);
        } else if (values[0] instanceof Long) {
            return (T) Long.valueOf((long) result);
        } else {
            throw new UnsupportedOperationException("Type not supported yet.");
        }
    }


}


class myMain {
    public static void main(String[] args) {

        IntegerCalculate <Integer> calculator= new IntegerCalculate<>();
        System.out.println("addition result = " + calculator.addieren(10, 20,56,73,890));
        System.out.println("subtraction result = " + calculator.subtrahieren(50, 40));
        System.out.println("multiplication result = " + calculator.multiplizieren(10, 60));
        System.out.println("division result = " + calculator.dividieren(90, 3));


    }
}