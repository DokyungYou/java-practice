package basic.oop;

//POP
public class LanternMain {
    public static void main(String[] args) {
        int brightness = 0;
        boolean isOn = false;

        // 랜턴 켜기
        isOn = true;
        
        // 랜턴 밝기 증가
        brightness++;

        // 랜턴 밝기 감소
        brightness--;

        // 랜턴 상태
        if(isOn){
            System.out.println("현재 밝기: " + brightness);
        }

        // 랜턴 끄기
        isOn = false;
    }
}
