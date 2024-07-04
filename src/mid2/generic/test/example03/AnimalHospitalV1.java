package mid2.generic.test.example03;

import mid2.generic.animal.Animal;

public class AnimalHospitalV1 {
    private Animal animal;
    public void setAnimal(Animal animal){
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물이름: " + animal.getName());
        System.out.println("동물크기: " + animal.getSize());
        animal.sound();
    }

    public Animal bigger(Animal targetAnimal){
        return animal.getSize() > targetAnimal.getSize() ? animal : targetAnimal;
    }

}
