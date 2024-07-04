package mid2.generic.test.example05;

import mid2.generic.animal.Animal;
import mid2.generic.animal.Cat;
import mid2.generic.animal.Tiger;

public class WildCardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        Box<Tiger> tigerBox = new Box<>();

        catBox.setValue(new Cat("거대냥냥이", 100000));

        // 타입 추론
        WildcardEx.printGenericV1(catBox);
        WildcardEx.printGenericV2(catBox);
        Cat cat = WildcardEx.printAndReturnGeneric(catBox);

        WildcardEx.printWildcardV1(objBox);
        WildcardEx.printWildcardV1(catBox);
        WildcardEx.printWildcardV1(tigerBox);

       //WildcardEx.printWildcardV2(objBox);
        WildcardEx.printWildcardV2(catBox);
        WildcardEx.printWildcardV2(tigerBox);

        Animal animal1 = WildcardEx.printAndReturnWildcard(catBox);
        Animal animal2 = WildcardEx.printAndReturnWildcard(tigerBox);
    }
}
