package EigenstaendigGenerischeMethoden.Example_1;


import java.util.Arrays;
import java.util.List;

public class Utils {

    // Returns the first element or null if the list is empty or null.

    public static <T> T getFirstOrNull(List<T> list){
        if(list == null || list.isEmpty()){
            return null;

        } else{
            return list.get(0);
        }

    }

    //Prints each element of the array.

    public static <T> void printArray(T[] myArray){
        for(T element :myArray){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Array of customers
        Customer[] customers = {
                new Customer("Maria", "Maria@T.com"),
                new Customer("Lisa", "Lisa@T.com"),
                new Customer("Pedro", "Pedro@T.com"),
                new Customer("Jonas", "Jonas@T.com"),

        };

        // Show the first customer using getFirstOrNull
        List<Customer> customerList = Arrays.asList(customers);
        System.out.println("First Customer: ");
        System.out.println(getFirstOrNull(customerList));

        // Print all customers using printArray
        System.out.println("All customers:");
        printArray(customers);



    }



}
