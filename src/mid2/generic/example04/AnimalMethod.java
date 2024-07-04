package mid2.generic.example04;

import mid2.generic.animal.Animal;

public class AnimalMethod {

    public <T extends Animal>void checkup(T t){
        System.out.println("동물이름: " + t.getName());
        System.out.println("동물크기: " + t.getSize());
        t.sound();
    }

    public <T extends Animal>T bigger(T animal1, T animal2){
        return animal1.getSize() > animal2.getSize() ? animal1 : animal2;
    }
}
