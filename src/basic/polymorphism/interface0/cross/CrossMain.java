package basic.polymorphism.interface0.cross;

public class CrossMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Bird bird = new Bird();
        Duck duck = new Duck();

        // 편의상 클래스는 (c), 인터페이스는 (i)로 표시
        // 해당 인스턴스의 가능한 타입들
        // Bird -> Animal(c) or Fly(i)
        // Duck -> Bird(c) or Swim(i) -> Animal(c) or Fly(i)

        soundMove(cat);
        soundMove(bird);
        soundMove(duck);


        //flyAnimal(cat);
        flyAnimal(bird);
        flyAnimal(duck);
    }

    static void soundMove(Animal animal){
        animal.move();
        animal.sound();
    }

    //
    static void flyAnimal (Fly fly){
        fly.fly();
    }
}

