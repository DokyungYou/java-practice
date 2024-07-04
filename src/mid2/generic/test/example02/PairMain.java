package mid2.generic.test.example02;

import mid2.generic.animal.Cat;
import mid2.generic.animal.Tiger;

public class PairMain {
    public static void main(String[] args) {
        Pair<Cat, Tiger> catPair = new Pair<>();
        catPair.setFirst(new Cat("고냥이", 50));
        catPair.setSecond(new Tiger("큰 고냥이", 500));

        System.out.println(catPair.getFirst());
        System.out.println(catPair.getSecond());

        System.out.println(catPair);
    }
}
