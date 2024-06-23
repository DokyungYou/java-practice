package basic.access.example;


import java.util.ArrayList;

// 캡슐화 실습이 목적이기때문에 간단하게 구현
public class ShoppingCart {

    private final int maxCount = 10;

    private ArrayList<ShoppingItem> cart = new ArrayList<>();




    public void showCart(){
        for(ShoppingItem item: cart){

            String name = item.getName();
            int price = item.getPrice();
            int quantity = item.getQuantity();

            System.out.printf("이름: %s , 수량: %d , 합계: %d \n", name, quantity , price * quantity);
        }
        System.out.println("결제금액: "+ calculateTotalPrice());
    }

    public void addItem(ShoppingItem item){
        if(cart.size() >= 10){
            System.out.println("최대 "+ maxCount+"개까지 담을 수 있습니다.");
            return;
        }
        cart.add(item);
    }


    // 검증 로직을 앞에, 메인로직을 뒤로 빼는게 좋은 듯하다.
    public void removeItem(int cartNumber){
        if(!(cartNumber >= 0 && cartNumber <= cart.size() - 1)){
            System.out.println("존재하지 않는 카트번호입니다.");
            return;
        }
        cart.remove(cartNumber);
    }

    private int calculateTotalPrice(){
        int totalPrice = 0;

        for(ShoppingItem item: cart){
            totalPrice += item.getTotalPrice();
        }

        return totalPrice;
    }

}
