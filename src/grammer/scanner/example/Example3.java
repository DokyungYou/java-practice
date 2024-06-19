package grammer.scanner.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Example3 {

    static class Order{
        String menu;
        int serving = 0;

        Order(String menu, int serving){
            this.menu = menu;
            this.serving += serving;
        }
    }


    public static void main(String[] args) {
        // 음식, 가격, 수량 입력 받아 , 음식 총 가격 계산, 출력
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> menu = new HashMap<>();
        menu.put("돈까스", 10000);
        menu.put("초밥", 5000);
        menu.put("피자",7000);
        menu.put("딤섬",500);
        menu.put("떡볶이",3000);


        ArrayList<Order> orderedMenuList = new ArrayList<>();


        System.out.println("손님, 무엇을 주문하시겠습니까?");
        while (true){
            System.out.println();
            System.out.print("주문하실 메뉴를 입력해주십시오 [주문취소시 exit] "); // 2. serving을 입력한 뒤 남은 enter (\n)가 여기서 읽혀버림
            String orderedMenu = scanner.nextLine();

            if(orderedMenu.equals("exit")){
                break;
            }

            if(!menu.containsKey(orderedMenu)){  // 3. enter 가 읽히면서 해당 조건문으로 진입
                System.out.println("없는 메뉴입니다.");
                continue;
            }


            System.out.print("몇인분 주문하시겠습니까? ");
            int orderedServing = scanner.nextInt();  // 1. 숫자입력시 숫자만 가져가고 enter (\n)이 남아버림

            scanner.nextLine(); // 6. 그렇게  남은 enter 를 날려버릴 용도로 씀

            orderedMenuList.add(new Order(orderedMenu, orderedServing));

        }
        int totalOrderAccount = 0;
        System.out.println("=== 계산서 ===");
        for(Order order : orderedMenuList){
            String orderMenu = order.menu;
            int serving = order.serving;
            int account = (menu.get(order.menu) * order.serving);
            totalOrderAccount += account;

            System.out.printf("%8s %3d인분 : %8d원\n", orderMenu, serving, account );
        }
        System.out.println("총 계산금액은 " + totalOrderAccount + "입니다.");
    }
}
