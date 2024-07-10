package mid2.collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cart = new HashMap<>();

    public void addProduct(Product product){
        cart.put(product, cart.getOrDefault(product,0) + 1);
    }

    public void addProduct(Product product, int quantity){
        cart.put(product, cart.getOrDefault(product,0) + quantity);
    }

    public void minusQuantity(Product product){
        if(cart.containsKey(product)){
            cart.put(product, cart.get(product) - 1);

            if(cart.get(product) <= 0){
                cart.remove(product);
            }
        }
    }

    public void minusQuantity(Product product, int quantity){
        if(cart.containsKey(product)){
            cart.put(product, cart.get(product) - quantity);

            if(cart.get(product) <= 0){
                cart.remove(product);
            }
        }
    }

    public void showItems(){
        System.out.println("== 담아놓은 상품 출력 ==");
        for(Map.Entry<Product, Integer> entry :cart.entrySet()){
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }
}
