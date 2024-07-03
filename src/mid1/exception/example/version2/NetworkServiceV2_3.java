package mid1.exception.example.version2;

// 에러 시뮬레이션 코드 추가 (예외처리 전 상태)
public class NetworkServiceV2_3 {
    public void sendMessage(String data) {
        String address = "http://javajava.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data); // 에러 시뮬레이션


        // 자바의 예외처리 메커니즘 도입 ->  정상흐름과 예외흐름이 분리되었다.
        try { // 정상흐름
            client.connect();
            client.send(data);
        } catch (NetworkClientException e) { //예외흐름
            System.out.println("[Error] code: " + e.getErrorCode() + "message: " + e.getMessage());
        }finally{ //  try블럭 안에 진입하고나면 예외를 잡건 못 잡건 상관없이 finally는 반드시 실행된다.
            client.disconnect(); // 사용한 연결자원 반환을 보장받게되었다!
        }


        /*
        예외를 직접 catch로 처리할 일이 없지만 반드시 호출해야하는 로직이 있다면 catch 문 없이 사용가능
        try{
           코드
        } finally{
            반드시 실행되어야할 코드
        }
        */

    }
}
