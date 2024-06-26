package basic.polymorphism.interface0.diamond;

public class Child implements InterfaceA, InterfaceB{

    @Override
    public void methodA() {
        System.out.println("Child methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child methodB");
    }


    // InterfaceA, InterfaceB 에 둘다 있는 동일 이름의 메서드
    // 구현 시 한번만 구현하면 됨
    @Override
    public void commonNameMethod() {
        System.out.println("Child commonNameMethod");
    }
}
