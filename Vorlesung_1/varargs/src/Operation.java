import java.lang.reflect.Array;
import java.util.Arrays;

public class Operation {


    public static int add(int... numbers) {
        int result = 0;
        for (int i : numbers) {
            result += i;
        }
        return result;
    }


    public static int multiplication(int... numbers) {
        int result = 1;
        for (int n : numbers) {
            result *= n;
        }
        return result;
    }


    public static int subs(int... numbers) {
        if (numbers.length == 0) return 0;
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    


    public static void main(String[] args) {

        System.out.println( add(3,6,3,22,1));
        System.out.println(multiplication(3,6,3,22,1));
        System.out.println(subs(0,-2));

    }

}
