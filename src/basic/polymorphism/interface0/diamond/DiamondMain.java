package basic.polymorphism.interface0.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.methodA();
        child.methodB();

        child.commonNameMethod();

        InterfaceA polyA = (InterfaceA) child;
        polyA.commonNameMethod();

        InterfaceB polyB = (InterfaceB) child;
        polyB.commonNameMethod();

        // InterfaceA, InterfaceB 에 둘다 있는 동일 이름의 메서드이지만 
        // 상속 및 구현시 다형성 참조를 하더라도 자식클래스에서 오버라이딩된 것이 우선시 되기 때문에
        // 자식에서 오버라이딩한 메서드로 호출됨

        // 인터페이스의 메서드는 public abstract 이 기본이기때문에 오버라이딩이 필수
        // 추상클래스가 다중상속을 한다면 동일한 이름의 메서드가 있을 때 어떤 부모클래스의 메서드를 호출해야하지? 라는 모호성이 없음
        // 그러므로 인터페이스의 다중구현은 문제가 없다.

    }
}
