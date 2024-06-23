package basic.access.example;

public class ShoppingItem {

    private String name;
    private int price;
    private int quantity;

    public ShoppingItem(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public int getTotalPrice(){
        return  price * quantity;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


}
