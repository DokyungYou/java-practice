package mid.nested.inner.example02;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;


    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }


    // Car 의 속성을 외부에 노출할 필요없이 필요한 메서드만 외부노출이 가능해짐 -> 캡슐화 O
    public void start() {
        engine.start();
        System.out.println(model + " 시작완료");
    }

    // 바깥에서 사용하지 않는 클래스가 외부에 노출될 일이 없어짐
    private class Engine {

        // Engine 에서 Car 속성에 바로 접근가능
        void start(){
            System.out.println("충전 레벨 확인: " +  chargeLevel );
            System.out.println(model + "의 엔진을 구동");
        }
    }
}
