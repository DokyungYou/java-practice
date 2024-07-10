package mid2.collection.map.test.cart;

public class CartMain {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addProduct(new Product("몬스터 에너지 울트라", 2000));
        cart.addProduct(new Product("몬스터 에너지 울트라", 2000));
        cart.addProduct(new Product("몬스터 에너지 제로슈거", 2000));
        cart.addProduct(new Product("몬스터 에너지 울트라", 2000));
        cart.addProduct(new Product("태양의 식후비법W", 1500),24);

        cart.showItems();

        cart.minusQuantity(new Product("몬스터 에너지 제로슈거", 2000));
        cart.minusQuantity(new Product("태양의 식후비법W", 1500), 3);

        cart.showItems();

    }
}
