package basic.polymorphism.example.abstract02;

public class Lion extends Animal{
    @Override
    public void sound() {
        System.out.println("크엉!");
    }

    @Override
    public void move() {
        System.out.println("사자가 달려온다.");
    }
}
