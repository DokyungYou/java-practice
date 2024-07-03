package mid.exception.example.version1;

public class NetworkServiceV1_3 {
    public void sendMessage(String data){
        String address = "http://javajava.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data); // 에러 시뮬레이션

        // 정상흐름과 예외흐름이 섞여있어서 직관적이지 못하다 (1_2도 포함) -> 중요한 정상흐름이 한 눈에 들어오지 않음 -> 분리 필요 -> 자바의 예외처리 메커니즘 필요
        String connectResult = client.connect(); // 정상
        if(isError(connectResult)){
            System.out.println("[Network Error] error code: " + connectResult);
        }else{
            String sendResult = client.send(data); // 정상
            if(isError(sendResult)){
                System.out.println("[Network Error] error code: " + sendResult);
            }
        }
        client.disconnect(); // 로직이 성공하건 실패하건간에 마지막에 연결을 꼭 해제를 해야한다.
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success"); // 원래 조건문에 들어갔던 코드
    }
}
