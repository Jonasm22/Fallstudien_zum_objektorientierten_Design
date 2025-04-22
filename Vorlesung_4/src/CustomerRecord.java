//Simple Generic Class
public class CustomerRecord <T>{

    private T id;
    private String name;

    //Constructor
    public CustomerRecord(T id, String name) {
        this.id = id;
        this.name = name;
    }

    //Getters
    public T getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //Setters
    public void setId(T id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    //String methode
    public String toString(){
        return "CustomerRecord {id= " + id + ", name='" + name + "' }";
    }

    public static void main(String[] args) {
        CustomerRecord<String> record_1 = new CustomerRecord<>("Customer-001",  "LUCAS GmbH");
        CustomerRecord<Integer> record_2 = new CustomerRecord<>(002, "BETA LLC");
        CustomerRecord<Double> record_3 = new CustomerRecord<>(004.4, "M LC");
        System.out.println(record_1);
        System.out.println(record_2);
        System.out.println(record_3);
    }
}
