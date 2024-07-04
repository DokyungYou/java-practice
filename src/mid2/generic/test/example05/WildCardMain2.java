package mid2.generic.test.example05;

import mid2.generic.animal.Animal;
import mid2.generic.animal.Cat;
import mid2.generic.animal.Tiger;

public class WildCardMain2 {
    public static void main(String[] args) {

        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        Box<Tiger> tigerBox = new Box<>();

        writeBox(objBox);
        writeBox(animalBox);
        
        // Animal 타입 하위 클래스는 불가능
        //writeBox(catBox);
        //writeBox(tigerBox);


    }

    static void writeBox(Box<? super Animal> box) { // Animal 포함 상위타입 전달 가능 (Animal이 하한)
        box.setValue(new Cat("냥냥이", 1000));

    }
}
