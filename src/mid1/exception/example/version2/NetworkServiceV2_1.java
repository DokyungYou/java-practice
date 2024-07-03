package mid1.exception.example.version2;

// 에러 시뮬레이션 코드 추가 (예외처리 전 상태)
public class NetworkServiceV2_1 {
    public void sendMessage(String data) throws NetworkClientException {
        String address = "http://javajava.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data); // 에러 시뮬레이션

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
