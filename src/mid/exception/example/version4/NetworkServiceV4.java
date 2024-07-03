package mid.exception.example.version4;

public class NetworkServiceV4 {
    public void sendMessage(String data) {
        String address = "http://javajava.com";
        NetworkClientV4 client = new NetworkClientV4(address);

        client.initError(data); // 에러 시뮬레이션


        // ConnectException , SendException 은 자바 프로그램 상에서 해결할 수 없는 예외라는 설정 (catch 에서 잡아봤자 의미 X)
        // catch 나 throws로 무조건 처리해야하는 체크 예외가 아닌 언체크예외로 변경
        // 해결할 수 없는 예외들은 다른 곳에서 공통으로 처리하게끔 한다.
        try{
            client.connect();
            client.send(data);
        } finally{
            client.disconnect();
        }


    }
}
