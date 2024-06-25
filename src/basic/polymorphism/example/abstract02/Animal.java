package basic.polymorphism.example.abstract02;


// 모든 메서드가 추상메서드인 추상클래스
// 자식클래스에게 내려주는 기능은 전혀없고 반드시 구현해야할 규격만 내려주는 꼴
public abstract class Animal {

    // 자식클래스에서 반드시 오버라이딩해야하는 메서드
    public abstract void sound();

    // 자식클래스에서 반드시 오버라이딩해야하는 메서드
    public abstract void move();
}
