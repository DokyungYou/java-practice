package basic.polymorphism.example2.after;

// Driver 는 Car 의 역할에만 의존 (Car 의 구현인 제네시스, 아반떼에 의존하지 않음)
// 의존: 클래스 상에서 어떤 클래스를 알고 있는가를 뜻함
// Car는 자동차의 역할이자 인터페이스

public class Driver {

    private Car car;


    // 객체 의존 관계 주입
    public void setCar(Car car){
        this.car = car;
        System.out.println("자동차를 설정했습니다:" + car.toString());
    }

    public void testDrive(){
        System.out.println("시운전을 시작합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
        System.out.println("시운전을 종료합니다.");
    }
}
