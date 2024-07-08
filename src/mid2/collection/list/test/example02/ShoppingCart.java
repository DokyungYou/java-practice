package mid2.collection.list.test.example02;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void addItem(Item item){
        cart.add(item);
    }
    public int calculateTotalPrice(){
        int totalPrice = 0;
        for (Item item : cart) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }

    public void showCart(){
        for (int i = 0; i < cart.size(); i++) {
            Item item = cart.get(i);
            System.out.printf("상품명: " + item.name +", 합계: " + item.getTotalPrice() +"\n");
        }

        // calculateTotalPrice 내부에서도 반복문을 돌기때문에 성능이 떨어질 수도 있겠지만
        // 하나의 cart 에 많은 item 이 들어가지는 않을 것으로 예상되기에 성능차이는 별로 없을 것으로 봄
        // 메서드 역할을 나누는 것이 유지보수에도 좀 더 좋을 것
        // 상황에 따라 무엇을 우선할 것인가를 선택 (성능 or 유지보수)
        System.out.println("전체 가격: " + calculateTotalPrice());
    }

    static class Item{
        private String name;
        private int price;

        private int quantity;

        public Item(String name, int price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public int getTotalPrice(){
            return price * quantity;
        }
    }
}
