package mid.exception.version1;

public class NetworkServiceV1_2 {
    public void sendMessage(String data){
        String address = "http://javajava.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data); // 에러 시뮬레이션
        String connectResult = client.connect();

        // 조건문에 바로 오류라고 인식하게 하는 것이 좋음
        if(isError(connectResult)){
            System.out.println("[Network Error] error code: " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if(isError(sendResult)){
            System.out.println("[Network Error] error code: " + sendResult);
            return;
        }

        // 에러 발생 시 연결자원 해제가 안되는 상태
        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success"); // 원래 조건문에 들어갔던 코드
    }
}
