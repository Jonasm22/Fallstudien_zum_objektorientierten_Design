//Generic only with Numbers

public class Discount<T extends  Number>{ //<-It is only limited to numbers and not strings.
private  T percentage;

    public Discount(T percentage) {
        this.percentage = percentage;
    }

    public T getPercentage() {
        return percentage;
    }

    public double apply (double price){
        return price - price * (percentage.doubleValue() / 100.0);
    }


    public static void main(String[] args) {

        //we create only number data types
        Discount<Integer> integerDiscount = new Discount<>(10);
        Discount<Double> doubleDiscount = new Discount<>(20.5);
        System.out.println("Original price: $200");
        System.out.println("10% off: " + integerDiscount.apply(200.00));
        System.out.println("20.5% off: " + doubleDiscount.apply(200.00));

    }





}


