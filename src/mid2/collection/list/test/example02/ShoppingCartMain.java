package mid2.collection.list.test.example02;

import static mid2.collection.list.test.example02.ShoppingCart.Item;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("부추", 4000, 5));
        cart.addItem(new Item("마늘", 2000, 10));
        cart.addItem(new Item("양파", 3000, 15));

        cart.showCart();
    }
}
