//Generic Interfaces
package GenericInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Customer {
    private String id;
    private String name;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" + id + ": " + name + "}";
    }

}


class CustomerRepository implements IRepository<Customer, String>{

        private List<Customer> store = new ArrayList<>();

        @Override
        public void save(Customer entity) {
            store.add(entity);

        }

        @Override
        public Customer findId(String id) {

            for(Customer customer : store){
                if(customer.getId().equals(id)){
                    return customer;
                }
            }
            return null;
        }


    public static void main(String[] args) {
            // we save two customer
        CustomerRepository repo = new CustomerRepository();
        repo.save(new Customer("C-001" , "Firma A"));
        repo.save(new Customer("C-002" , "Firma B"));

        // searching customer
        Customer result = repo.findId("C-001");
        if(result != null){
            System.out.println("Found: " + result);
        }else{
            System.out.println("Customer no found");
        }

        //customer doesnt exist

        Customer missing = repo.findId("A-001");
        if(missing != null){
            System.out.println("Found: " + missing);
        }else{
            System.out.println("Customer no found");
        }

    }
}





