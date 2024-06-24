package basic.extends0.extends02;

public class ElectricGuitar extends  Guitar{
    private boolean isConnectedToAmp;

    public void connectToAmp() {
        isConnectedToAmp = true;
        System.out.println("앰프 연결완료");
    }

    public void disconnectFromAmp() {
        isConnectedToAmp = false;
        System.out.println("앰프 연결 해제");
    }
}
