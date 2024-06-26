package basic.polymorphism.example2.after;

public class Avante implements Car{
    @Override
    public void startEngine() {
        System.out.println("Avante startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("Avante offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Avante pressAccelerator");
    }
}
