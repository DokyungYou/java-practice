package basic.polymorphism.example.abstract01;

public class AbstractMain {
    public static void main(String[] args) {

        //Animal animal = new Animal(); 추상메서드는 직접 객체생성 불가

        Animal animal0 = new Animal() {  // 생성과 동시에 추상메서드를 구현하면 가능함 (이 부분은 나중에 )
            @Override
            public void sound() {
                System.out.println("동물이 운다~");
            }
        };
        animal0.sound();

        // ===============================================================

        Animal[] animals = {new Cat(), new Tiger(), new Lion()};
        for(Animal animal : animals){
            animal.sound();
        }

        }
    }

