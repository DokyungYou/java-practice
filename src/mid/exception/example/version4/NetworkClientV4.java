package mid.exception.example.version4;


import mid.exception.example.version4.exception.ConnectException;
import mid.exception.example.version4.exception.SendException;

// 오류 상황 시뮬레이션
// 연결실패: "error1" 입력 시 연결 실패 -> 오류코드 "connectError"
// 전송실패: "error2" 입력 시 데이터 전송 실패 -> 오류코드 "sendError"
public class NetworkClientV4 {
    private final String address; // 접속할 외부 서버 주소
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV4(String address) {
        this.address = address;
    }

    // 실행 예외여서 throws 필요 X
    public void connect() {
        if(connectError){
            throw new ConnectException(address, address + " 서버 연결 실패");
        }
        System.out.println(address + " 연결 성공");
    }

    public void send(String data) {
        if(sendError){
            throw new SendException(data, address + " 메세지 전송 실패");
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
