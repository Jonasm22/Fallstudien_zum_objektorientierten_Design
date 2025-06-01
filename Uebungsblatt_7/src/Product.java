import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Product {


    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " | " + category + " | $" + price;
    }





    public static void main(String[] args) {

    List<Product> products = new ArrayList<>();

    products.add(new Product("Laptop", "Elektronik", 1400.00));
        products.add(new Product("Smartphone", "Elektronik", 800.00));
        products.add(new Product("Toaster", "Haushalt", 35.50));
        products.add(new Product("Vacuum Cleaner", "Haushalt", 150.00));
        products.add(new Product("Blender", "Haushalt", 60.00));
        products.add(new Product("Headphones", "Elektronik", 120.00));
        products.add(new Product("Desk Lamp", "Möbel", 45.99));
        products.add(new Product("Office Chair", "Möbel", 210.00));
        products.add(new Product("T-Shirt", "Kleidung", 25.00));
        products.add(new Product("Sneakers", "Kleidung", 85.00));



        System.out.println("-------------1-----------------------");
        List<Product> productList = products.stream()
                .filter(p-> p.getCategory().equals("Elektronik"))
                .filter(p->p.getPrice() > 100)
                .sorted((p1,p2)-> Double.compare(p2.getPrice(), p1.getPrice()))
                        .collect(Collectors.toList());
        //Foreach wichtig
         productList.forEach(System.out::println);

        System.out.println("-------------2-----------------------");
        //Aufgabe 4

        Map<String , List<Product>> sortiert = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
        sortiert.forEach((categorie , productList1)-> {

            System.out.println("\n"+categorie);

            productList1.forEach(c-> System.out.println(c.getName() + " - "  +  c.getPrice()));
        });
        }




    }



