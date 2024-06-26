package basic.polymorphism.interface0;

public class Cat implements Animal{
    @Override
    public void sound() {
        System.out.println("왜옹~~----");
    }

    @Override
    public void move() {
        System.out.println("꽁꽁 얼어붙은 한강 위로 고양이가 걸어다닙니다.");
    }
}
