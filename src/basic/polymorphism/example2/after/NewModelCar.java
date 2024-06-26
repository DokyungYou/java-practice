package basic.polymorphism.example2.after;

public class NewModelCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("신형차 엔진 시동건다!!");
    }

    @Override
    public void offEngine() {
        System.out.println("신형차 엔진 시동 끕니다.");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("신형차 액셀 밟아!");
    }
}
