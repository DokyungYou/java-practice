package basic.polymorphism.example.abstract01;

public abstract class Animal {

    // 자식클래스에서 반드시 오버라이딩해야하는 메서드
    public abstract void sound();
    
    
    // 일반적으로 상속해주는 메서드 (오버라이딩은 자유)
    public void move(){
        System.out.println("움직인다.");
    }
}
