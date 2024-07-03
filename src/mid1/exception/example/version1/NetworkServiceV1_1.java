package mid1.exception.example.version1;

// 에러 시뮬레이션 코드 추가 (예외처리 전 상태)
public class NetworkServiceV1_1 {
    public void sendMessage(String data){
        String address = "http://javajava.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data); // 에러 시뮬레이션

        // 중간에 에러가 발생해도 다음 로직으로 넘어가는 상태이다.
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
