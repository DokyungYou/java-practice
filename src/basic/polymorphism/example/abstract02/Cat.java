package basic.polymorphism.example.abstract02;

public class Cat extends Animal{
    @Override
    public void sound() {
        System.out.println("왜옹~~");
    }

    @Override
    public void move() {
        System.out.println("고양이가 움직인다.");
    }
}
