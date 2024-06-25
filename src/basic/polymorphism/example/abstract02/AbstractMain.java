package basic.polymorphism.example.abstract02;

public class AbstractMain {
    public static void main(String[] args) {

        Animal[] animals = {new Cat(), new Tiger(), new Lion()};
        for(Animal animal : animals){
            animal.sound();
            animal.move();
        }

    }

}

