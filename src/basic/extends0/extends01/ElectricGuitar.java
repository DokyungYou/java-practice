package basic.extends0.extends01;

public class ElectricGuitar {

    private boolean isConnectedToAmp;
    private boolean isTuned;
    public void play(){
        if(isTuned == false) System.out.println("튜닝 전 상태");
        if(isConnectedToAmp = false) System.out.println("앰프 미연결 상태");
        System.out.println("기타를 연주합니다.");
    }

    public void tune() {
        isTuned = true;
        System.out.println("튜닝 완료");
    }

    public void connectToAmp() {
        isConnectedToAmp = true;
        System.out.println("앰프 연결완료");
    }

    public void disconnectFromAmp() {
        isConnectedToAmp = false;
        System.out.println("앰프 연결 해제");
    }
}
