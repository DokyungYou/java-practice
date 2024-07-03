package mid1.exception.example.version3;

import mid1.exception.example.version3.exception.ConnectException;
import mid1.exception.example.version3.exception.NetworkClientException;

// 에러 시뮬레이션 코드 추가 (예외처리 전 상태)
public class NetworkServiceV3_2 {
    public void sendMessage(String data) {
        String address = "http://javajava.com";
        NetworkClientV3 client = new NetworkClientV3(address);

        client.initError(data); // 에러 시뮬레이션



        // 예외를 세분화하는 것까지는 좋았으나 에러가 무수히 많은 상황이라 가정했을 때 각 예외마다 별도의 catch문 추가? no...
        // 중요한 에러 외는 부모 예외클래스로 퉁쳐서 관리해보기,  (예외클래스1 | 예외클래스2 e)로도 가능
        // 하위 -> 상위 순으로 catch문 배치
        try {
            client.connect();
            client.send(data);
        } catch (ConnectException e) {  // 중요한 에러인 ConnectException을 우선순위로
            System.out.println("[Connect Error] address: " + e.getAddress());
        } catch (NetworkClientException e){
            System.out.println("[Network Error] message: " + e.getMessage());
        } catch (Exception e){ // 예상치 못한 에러는 상위클래스로 잡고보자
            System.out.println("[Network 외 오류 발생] message: " + e.getMessage());
        }finally{
            client.disconnect();
        }


    }
}
