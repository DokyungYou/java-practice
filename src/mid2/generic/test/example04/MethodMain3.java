package mid2.generic.test.example04;

import mid2.generic.animal.Animal;
import mid2.generic.animal.Cat;
import mid2.generic.animal.Tiger;

public class MethodMain3 {
    public static void main(String[] args) {
        Cat cat = new Cat("냥냥이",100);
        Tiger tiger = new Tiger("호냥이",500);

        ComplexBox<Cat> complexBox = new ComplexBox<>();
        complexBox.setAnimal(cat);
        Tiger returnTiger1 = complexBox.printAndReturnZ(tiger);


        Tiger returnTiger2 = complexBox.printAndReturnZ(tiger); // 제네릭타입보다 제네릭 메서드가 높은 우선순위를 가짐

    }
}
