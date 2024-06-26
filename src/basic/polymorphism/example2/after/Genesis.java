package basic.polymorphism.example2.after;

public class Genesis implements Car{

    @Override
    public void startEngine(){
        System.out.println("GenesisCar startEngine");
    }
    @Override
    public void offEngine(){
        System.out.println("GenesisCar offEngine");
    }
    @Override
    public void pressAccelerator(){
        System.out.println("GenesisCar pressAccelerator");
    }
}
