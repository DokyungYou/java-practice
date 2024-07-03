package mid.exception.example.version2;

import java.util.Scanner;


public class MainV2 {
    public static void main(String[] args) throws NetworkClientException{
        NetworkServiceV2_1 networkService = new NetworkServiceV2_1();

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
