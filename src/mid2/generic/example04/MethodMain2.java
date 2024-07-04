package mid2.generic.example04;

import mid2.generic.animal.Animal;
import mid2.generic.animal.Cat;
import mid2.generic.animal.Tiger;

public class MethodMain2 {
    public static void main(String[] args) {
        Cat cat = new Cat("냥냥이",100);
        Tiger tiger = new Tiger("호냥이",500);

        AnimalMethod animalMethod = new AnimalMethod();
        

        animalMethod.checkup(cat);
        animalMethod.checkup(tiger);

        // 타입추론
        Cat biggerCat = animalMethod.bigger(cat, new Cat("새로운 냥이", 100));
        Tiger biggerTiger = animalMethod.bigger(tiger, new Tiger("타이거", 10000));

        Animal bigger = animalMethod.bigger(cat, tiger); // 참고로 자바 상위버전에서는 한 타입으로만 넣을 수 있음 (본인은 자바11)
    }
}
