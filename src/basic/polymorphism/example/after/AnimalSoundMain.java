package basic.polymorphism.example.after;

public class AnimalSoundMain {
    public static void main(String[] args) {

        System.out.println("========= 다형적 참조, 메서드 오버라이딩 =========");

        Animal[] animals = { new Dog(), new Caw(), new Cat(), new Goose()}; // 다형적 참조활용 (업캐스팅되면서 하나의 타입으로 관리가 가능해졌다.)

        System.out.println("동물들아 울어라!");
        for(Animal animal : animals){
            animal.sound();  // 메서드 오버라이딩 활용 (자식 인스턴스의 오버라이딩 된 메서드로 호출)
        }
        System.out.println("동물들아 그만 울어라!");
    }
}
