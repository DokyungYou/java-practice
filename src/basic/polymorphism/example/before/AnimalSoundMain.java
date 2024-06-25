package basic.polymorphism.example.before;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Caw caw = new Caw();
        Cat cat = new Cat();

        
        // 각 객체의 sound()를 매번 직접 호출해야함 (번거로움 + 중복코드)
        System.out.println("동물들아 울어라!");
        dog.sound();
        caw.sound();
        cat.sound();
        System.out.println("동물들아 그만 울어라!");
    }
}
