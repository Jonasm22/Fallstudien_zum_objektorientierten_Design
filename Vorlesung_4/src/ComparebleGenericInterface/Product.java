package ComparebleGenericInterface;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Product implements Comparable<Product>{

    private String name;
    private double price;

     public Product(String name, double price) {
         this.name = name;
         this.price = price;
     }

     public double getPrice() {
         return price;
     }

    public String getName() {
        return name;
    }

    @Override
     public int compareTo(Product other) {
         return Double.compare(this.price, other.price);
     }


    @Override
     public String toString() {
         return name + " ($" + price + ")";
     }


 }

 class Main{
     public static void main(String[] args) {
         Product[] products = {

                 new Product("Beer" , 4.00),
                 new Product("Wasser" , 1.50),
                 new Product("Coca Cola" , 3.00)
         };

         Arrays.sort(products);

         for(Product product : products){
             System.out.println(product);
         }
     }

 }
