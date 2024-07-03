package mid.exception.example.version3;
import mid.exception.example.version3.exception.ConnectException;
import mid.exception.example.version3.exception.NetworkClientException;
import mid.exception.example.version3.exception.SendException;

// 에러 시뮬레이션 코드 추가 (예외처리 전 상태)
public class NetworkServiceV3_1 {
    public void sendMessage(String data) {
        String address = "http://javajava.com";
        NetworkClientV3 client = new NetworkClientV3(address);

        client.initError(data); // 에러 시뮬레이션


        // 기존(버전2): NetworkClientException 하나로 관리 (그 안에 어떤 에러인지 데이터를 따로 담았었음)
        // 현재(버전3): 예외를 세분화 (예외 객체 자체만으로 어떤 에러인지 구분이 가능해짐) -> 예외에 따라 다른 로직수행이 가능
        try {
            client.connect(); // ConnectException extends NetworkClientException
            client.send(data);  // SendException extends NetworkClientException
        } catch (ConnectException e) {
            System.out.println("[Connect Error] address: " + e.getAddress());
        } catch (SendException e){
            System.out.println("[Send Error] sendData: " + e.getSendData());
        }finally{
            client.disconnect();
        }


    }
}
