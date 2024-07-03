package mid1.nested.inner.example01;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    // Engine 에 필요한 메서드들을 제공해야만 함 (Car의 속성을 외부노출이 불가피함 -> 캡슐화 X)
    // Engine 에서만 사용하는 메서드
    public int getChargeLevel(){
        return chargeLevel;
    }

    // Engine 에서만 사용하는 메서드
    public String getModel(){
        return model;
    }

    public void start(){
        engine.start();
        System.out.println(model + " 시작완료");
    }
}
