package basic.oop;

// 객체지향 프로그래밍이 나오기 전까진 데이터와 기능이 분리돼있었음

// 서로 연관이 있는 데이터와 기능을 한 클래스에서 관리
// 속성과 기능이 하나의 캡슐에 쌓여있는 것과 같다.
// 캡슐화:  속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것
public class Lantern {
    private boolean isOn;
    private int lightness;
    

    void turnOn(){
        isOn = true;
        System.out.println("랜턴을 켭니다.");
    }

    void turnOff(){
        isOn = false;
        System.out.println("랜턴을 끕니다.");
    }


    void upLight(){
        if(lightness == 10){
            System.out.println("랜턴의 최대밝기는 10입니다.");
            return;
        }
        lightness++;
    }
    void downLight(){
        if(lightness == 1){
            System.out.println("랜턴의 최저밝기는 1입니다.");
            return;
        }
        lightness--;
    }

    void showStatus(){
        if(isOn){
            System.out.println("현재 밝기: " + lightness );
        }else {
            System.out.println("현재 랜턴이 꺼져있는 상태입니다.");
        }

    }


}
