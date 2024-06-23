package basic.access.example;

public class ShoppingCartMain {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new ShoppingItem("시금치", 3000, 3));
        cart.addItem(new ShoppingItem("수박", 20000, 3));
        cart.addItem(new ShoppingItem("참외", 5000, 4));
        cart.addItem(new ShoppingItem("대파", 3000, 2));
        cart.showCart();
        cart.removeItem(10);

        cart.removeItem(0);

        cart.showCart();

    }

}
