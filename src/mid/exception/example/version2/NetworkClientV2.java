package mid.exception.example.version2;


// 오류 상황 시뮬레이션
// 연결실패: "error1" 입력 시 연결 실패 -> 오류코드 "connectError"
// 전송실패: "error2" 입력 시 데이터 전송 실패 -> 오류코드 "sendError"
public class NetworkClientV2 {
    private final String address; // 접속할 외부 서버 주소
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientException { // 외부 서버 연결
        if(connectError){
            throw new NetworkClientException("connectError", address + " 서버 연결 실패");
        }
        System.out.println(address + " 연결 성공");
    }

    public void send(String data) throws NetworkClientException { // 연결한 외부 서버에 데이터 전송
        if(sendError){
            throw new NetworkClientException("sendError", address + " 메세지 전송 실패");
        }
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect(){ // 외부서버와 연결 해제
        System.out.println(address + "서버 연결 해제");
    }

    public void initError(String data){
        if(data.contains("error1")){
            connectError = true;
        }
        if(data.contains("error2")){
            sendError = true;
        }
    }
}
