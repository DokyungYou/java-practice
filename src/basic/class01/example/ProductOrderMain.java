package basic.class01.example;

// ProductOrder 정보를 배열로 관리, 정보를 출력, 최종 결제 금액 계산
public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder[] productOrders = {
                new ProductOrder("흙대파 1kg",2470, 3),
                new ProductOrder("국내산 절단대파 500g",2500, 2),
                new ProductOrder("냉동대파 500g",4930, 1),
                new ProductOrder("그대로말린 100% 국산 건조 대파 슬라이스 25g 2개",16000, 40),
                new ProductOrder("국내산 파채 300g",3430, 1),
        };

        System.out.println("총 결제 금액: " + ProductOrder.calculateOrder(productOrders)+ "원");
    }
}
