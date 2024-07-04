package mid2.generic.test.example03;

import mid2.generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> { // 이제 컴파일러는 T에 들어올 값의 범위 예측가능
    private T animal;
    public void setAnimal(T animal){
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물이름: " + animal.getName());
        System.out.println("동물크기: " + animal.getSize());
        animal.sound();
    }

    public T bigger(T targetAnimal){
        return animal.getSize() > targetAnimal.getSize() ? animal : targetAnimal;
    }

}
