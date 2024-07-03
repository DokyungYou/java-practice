package mid1.exception.example.version5;

public class NetworkServiceV5 {
    public void sendMessage(String data) {
        String address = "http://javajava.com";

        try(NetworkClientV5 client = new NetworkClientV5(address)){ // 반납자원을 try() 안에 넣어준다. (AutoCloseable 구현한 클래스 객체)
            client.initError(data); // 에러 시뮬레이션
            client.connect();
            client.send(data);
        }


        // try 가 끝나는 순간 바로 자동으로 AutoCloseable 의 close()를 호출하게된다. (catch문 보다 먼저) <-> finally는 catch문 끝나고 실행


    }
}
