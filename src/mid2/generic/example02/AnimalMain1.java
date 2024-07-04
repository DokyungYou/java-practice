package mid2.generic.example02;

import mid2.generic.animal.Animal;
import mid2.generic.animal.Cat;
import mid2.generic.animal.Tiger;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);

        Cat cat1 = new Cat("고냥이", 50);
        Tiger tiger1 = new Tiger("범",500);

        Cage<Cat> catCage = new Cage<>();
        catCage.setValue(cat1);
        System.out.println(catCage.getValue());

        Cage<Tiger> tigerCage = new Cage<>();
        tigerCage.setValue(tiger1);
        System.out.println(tigerCage.getValue());
// =====================================================================================

        Cage<Animal> animalCage = new Cage<>();
        animalCage.setValue(animal);
        animalCage.setValue(cat1);
        animalCage.setValue(tiger1);

        System.out.println(animalCage.getValue());
    }
}
