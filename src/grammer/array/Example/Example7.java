package grammer.array.Example;

import java.util.Scanner;

public class Example7 {
    // 상품 관리 프로그램
    // 상품은 최대 10개까지 등록가능
    // "1. 상품 등록", "2. 상품 목록", "3. 종료"

    // "1. 상품 등록"을 선택하면, 사용자로부터 상품 이름과 가격을 입력받아 배열에 저장한다
    // "2. 상품 목록"을 선택하면, 배열에 저장된 모든 상품을 출력한다
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = new String[10];
        int[] prices = new int[products.length];


        int count = 0;
        while (true){
            System.out.println("[옵션선택] | 1.상품 등록 | 2.상품 목록 | 3.종료 |");
            int selectedOption = scanner.nextInt();
            scanner.nextLine();


            if(selectedOption == 1){
                if(count > products.length -1){
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                }else{
                    System.out.print("상품명을 입력하세요: ");
                    products[count] = scanner.nextLine();

                    System.out.print("상품가격을 입력하세요: ");
                    prices[count] = scanner.nextInt();

                    count++;
                }
            }else if(selectedOption == 2){
                if(count == 0){
                    System.out.println("등록된 상품이 없습니다.");
                }else{
                    for (int i = 0; i < products.length; i++){
                        if(products[i] != null)  System.out.println(products[i]+": "+ prices[i]+"원");
                    }
                }
            }else if(selectedOption == 3){
                System.out.println("종료합니다.");
                break;

            }else {
                System.out.println("잘못된 메뉴를 선택했습니다.");
            }

        }


        scanner.close();
    }
}
