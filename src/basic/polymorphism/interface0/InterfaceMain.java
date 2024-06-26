package basic.polymorphism.interface0;

// 클래스, 추상 클래스 , 인터페이스는 프로그램코드, 메모리 구조상 모두 동일 (.class 로 다루어짐)
// 인터페이스는 순수추상클래스와 유사
public class InterfaceMain {
    public static void main(String[] args) {

       // Animal animal new Animal(); // 인터페이스 생성 불가

        Cat cat = new Cat();
        Tiger tiger = new Tiger();

        moveAndSound(cat);
        moveAndSound(tiger);

    }

    public static void moveAndSound(Animal animal){
        animal.sound();
        animal.move();
    }
}
