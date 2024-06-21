package basic.ref.example;

import java.util.Scanner;

public class Example1 {
    
    // 상품 주문 시스템을 사용자 입력을 받는걸로 바꿔보자.
    // 주문 수량
    // 가격, 수량, 상품명
    // 입력 시 상품 순서를 알 수 있게 "n번째 주문 정보를 입력하세요" 메세지 출력
    // 입력이 끝나면 등록한 상품과 총 결제 금액을 출력
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하시오: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] productOrders = new ProductOrder[num];


        for (int i = 0; i < num; i++) {

            System.out.println((i+1)+"번째 주문 정보를 입력하시오.");
            System.out.print("상품명: ");
            String name = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            productOrders[i] = new ProductOrder(name, price, quantity);
        }

        System.out.println("총 결제 금액:" + ProductOrder.calculateOrder(productOrders));


        scanner.close();
    }
}
