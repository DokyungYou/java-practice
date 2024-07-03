package mid.exception.example.version0;

public class NetworkServiceV0 { // NetworkClient의 흐름 제어 담당
    public void sendMessage(String data){
        String address = "http://javajava.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
