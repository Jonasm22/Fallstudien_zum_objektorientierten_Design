import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lambdas {

    public static void main(String[] args) {

        //Block with {} and return
        BiFunction<String, String, String> combineReverse = (String a, String b) ->{
            return  a+b;
        };

      //  System.out.println(combineReverse.apply("Hello", "World"));

        // Single statement – omit {} and return
        Function<String, Integer> parseInteger = (text) -> Integer.valueOf(text);
       // System.out.println("ParseToInteger: "+parseInteger.apply("123"));


        //Type Inference – omit types
        BiFunction<Integer, Integer, Integer> multyply= (a , b) -> a*b;
        //System.out.println("multiply: "+multyply.apply(5, 5));

        //Single parameter – omit parentheses
        Consumer<String> print = message -> System.out.println(message);
                //print.accept("Hallo Welt");

        // No parameters – use ()
        Supplier<String> sayBreak=() -> "Lets talk about something.";
        System.out.println(sayBreak.get());
    }

}
