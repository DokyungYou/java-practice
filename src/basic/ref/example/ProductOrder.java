package basic.ref.example;

public class ProductOrder {
    String name;
    int price;
    int quantity;

    public ProductOrder(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static int calculateOrder(ProductOrder[] productOrders){
        int totalPayment = 0;
        for (ProductOrder order : productOrders) {
            totalPayment += (order.price * order.quantity);
            System.out.println("상품명: " + order.name + ",가격: " + order.price + ", 수량: "+ order.quantity);
        }

        return totalPayment;
    }
}
