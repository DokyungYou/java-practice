package mid.exception.example.version2;

// 에러 시뮬레이션 코드 추가 (예외처리 전 상태)
public class NetworkServiceV2_2 {
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
        }

        /* 문제상황)
           정상상황, 예외상황 둘 다 disconnect() 가 반드시 보장되는 것처럼 보이나,
           만약 저 로직 안에서 미처 모르는 예외가 밖으로 던져지는 상황을 고려해야한다. (실행예외는 catch를 안하면 자동으로 밖으로 던져진다.)
           catch 에서 처리를 못하고 disconnect() 에 도달하지 못한다.
        */
        client.disconnect();
    }
}
