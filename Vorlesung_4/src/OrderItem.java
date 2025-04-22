// Using two Generic classe

import java.time.Year;

public class OrderItem <K, V>{
    private  K productCode;
    private  V quantity;

    public OrderItem(K productCode, V quantity) {
        this.productCode = productCode;
        this.quantity = quantity;
    }

    public K getProductCode() {
        return productCode;
    }

    public V getQuantity() {
        return quantity;
    }

    public void setProductCode(K productCode) {
        this.productCode = productCode;
    }

    public void setQuantity(V quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "OrderItem {code=" + productCode + ", qty=" + quantity + "}";
    }


    public static void main(String[] args) {
        OrderItem<String, Integer> stringOrderItem = new OrderItem("P-001", 4);
        OrderItem<Integer, Double> integerDoubleOrderItem = new OrderItem<>(2344, 3.74);
        System.out.println(stringOrderItem);
        System.out.println(integerDoubleOrderItem);
    }

}
