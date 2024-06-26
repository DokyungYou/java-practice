package basic.polymorphism.interface0.cross;

public class Bird extends Animal implements Fly{

    @Override
    public void sound() {
        System.out.println("째애애애액---");
    }

    @Override
    public void fly() {
        System.out.println("푸드덕 새가 날아간다.");
    }

}
