package mid.exception.example.version5;

import mid.exception.example.version2.NetworkClientException;
import mid.exception.example.version4.exception.SendException;

import java.util.Scanner;


public class MainV5 {
    public static void main(String[] args) throws NetworkClientException {
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("전송할 메세지를 입력해주십시오: ");
            String inputMessage = scanner.nextLine();
            if(inputMessage.equals("exit")) break;

            // 공통처리
            try{
                networkService.sendMessage(inputMessage);
            }catch (Exception e){
                exceptionHandler(e);
            }

            System.out.println();

        }
        System.out.println("프로그램을 정상적으로 종료합니다.");
        scanner.close();
    }

    
    // 공통 처리 메서드
    private static void exceptionHandler(Exception e) {
        System.out.println("사용자에게 보낼 로직");
        System.out.println("== 개발자용 디버깅 메세지 로직 ==");

        // 스택 트레이스 출력 (실무에서는 콘솔에 출력 X, 별도의 로그 라이브러리를 사용)
        e.printStackTrace(System.out);
        //e.printStackTrace(System.err);
        //e.printStackTrace();

        // 필요 시 예외별로 별도의 추가 처리 가능
        if(e instanceof SendException){
            SendException sendException = (SendException) e;
            System.out.println("[전송 오류] 전송 데이터: " + e.getMessage() );
        }
    }
}
