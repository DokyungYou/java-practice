package basic.extends0.overriding;

public class ElectricGuitar extends Guitar {

    private boolean isConnectedToAmp;


    // 사실 @Override 가 없다고 실행오류가 뜨진 않는다. (어차피 특정 메서드를 선언한 타입 인스턴스에서 먼저 찾기때문에)
    // 컴파일 오류에서 실수를 잡아내기 위한 용도 + 코드의 명확성
    @Override
    public void play() {
        if(!isConnectedToAmp) System.out.println("앰프 미연결상태");
        super.play();
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
