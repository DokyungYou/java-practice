package grammer.scanner.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Example5 {

    static class Product{
        String name;
        int price;
        int quantity;

        Product(String name, int price, int quantity){
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

    }


    // 세가지 옵션 제공 ) 1: 상품입력, 2: 결제, 3: 프로그램 종료 (정수로 입력받기)
    // 1번옵션 시 상품명, 가격, 수량을 입력받기
    // 2번옵션 시 총 비용 출력, 총 비용을 0으로 초기화 
    // 3번 옵션 시 프로그램을 종료합니다 출력 후 프로그램 종료
    // 다른옵션 선택 시 올바른 옵션을 선택해주세요 출력
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, String> options = new HashMap<>();
        options.put(1,"상품입력");
        options.put(2,"결제");
        options.put(3,"프로그램 종료");


        ArrayList<Product> products = new ArrayList<>();

        while (true){

            System.out.println("옵션을 선택해주십시오. [ 상품입력: 1 | 결제: 2 | 프로그램 종료: 3 ]");
            int selectedOption = scanner.nextInt();
            scanner.nextLine();

            if(selectedOption == 3 ){
                System.out.println("프로그램 종료");
                break;
            }

        switch(selectedOption){
            case 1:
                System.out.print("상품명을 입력하십시오: ");
                String productName = scanner.nextLine();

                System.out.print("가격을 입력하십시오: ");
                int productPrice = scanner.nextInt();

                System.out.print("수량을 입력하십시오: ");
                int productQuantity = scanner.nextInt();

                products.add(new Product(productName,productPrice,productQuantity));
                break;

            case 2:
                System.out.println("결제");

                int totalPrice = 0;
                for(Product product : products){
                    totalPrice += product.price * product.quantity ;
                    System.out.printf("상품명: %s %4d개 %8d원\n", product.name, product.quantity, (product.price * product.quantity));
                }
                System.out.println("총 금액: " + totalPrice);
                break;

            default:
                System.out.println("올바른 옵션을 입력해주십시오.");
                break;
            }
        }

    }
}
