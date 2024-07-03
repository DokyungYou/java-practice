package mid.exception.example.version1;

import java.util.Scanner;


public class MainV1 {
    public static void main(String[] args) {
        //NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
        //NetworkServiceV1_2 networkService = new NetworkServiceV1_2();
        NetworkServiceV1_3 networkService = new NetworkServiceV1_3();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("전송할 메세지를 입력해주십시오: ");
            String inputMessage = scanner.nextLine();
            if(inputMessage.equals("exit")) break;

            networkService.sendMessage(inputMessage);
            System.out.println();

        }
        System.out.println("프로그램을 정상적으로 종료합니다.");
        scanner.close();
    }
}
