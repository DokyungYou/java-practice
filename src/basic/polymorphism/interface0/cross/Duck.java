package basic.polymorphism.interface0.cross;

public class Duck extends Bird implements Swim{

    @Override
    public void sound() {
        System.out.println("꽉 꽉 꽈아아악---");
    }

    @Override
    public void fly() {
        System.out.println("오리 날다");
    }

    @Override
    public void swim() {
        System.out.println("오리 헤엄친다!!");
    }
}
