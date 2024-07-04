package mid2.generic.test.example05;

import mid2.generic.animal.Animal;

public class WildcardEx {

    static <T> void printGenericV1(Box<T> box){
        System.out.println("T: " + box.getValue());
    }


    static <T extends Animal> void printGenericV2(Box<T> box){
        T t = box.getValue();
        System.out.println("이름: " + t.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box){
        T t = box.getValue();
        System.out.println("이름: " + t.getName());
        return t;
    }

    static void printWildcardV1(Box<?> box){  // Box<? extends Object > box
        System.out.println("?: " + box.getValue());
    }

    static void printWildcardV2(Box<? extends Animal> box){
        Animal animal = box.getValue();
        System.out.println("?: " + box.getValue());
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box){
        Animal value = box.getValue();
        System.out.println("이름: " + value.getName());
        return value;
    }


}
