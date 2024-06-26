package basic.polymorphism.interface0;

public class Tiger implements Animal{

    @Override
    public void sound() {
        System.out.println("어흥");
    }

    @Override
    public void move() {
        System.out.println("범 내려온다.");
    }
}
