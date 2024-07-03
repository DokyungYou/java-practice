package mid1.exception.example.version0;

import java.util.Scanner;

// 예제 - 시작
public class MainV0 {
    public static void main(String[] args) {
        NetworkServiceV0 networkService = new NetworkServiceV0();  // 사용자의 입력을 NetworkServiceV0 에 전달

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
