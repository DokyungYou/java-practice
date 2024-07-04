package mid2.generic.example04;

import mid2.generic.animal.Animal;

public class ComplexBox<T extends Animal> {

    private T animal;

    public void setAnimal(T animal){
        this.animal = animal;
    }

    public <Z> Z printAndReturnZ(Z z){
        System.out.println("animal.classname: " + animal.getClass().getName());
        System.out.println("z.className: " + z.getClass().getName());
        return z;
    }

    // 제네릭타입과 제네릭메서드의 이름이 같은상황 -> 그럼 매개변수 T의 타입은 무엇인가?
    // 이 경우 제네릭타입보다 제네릭 메서드가 높은 우선순위를 가짐
    // 우선순위 덕분에 이름이 동일해도 오류가 발생하진 않지만 바꾸는 것을 지향
    public <T> T printAndReturnT(T t){ 
        System.out.println("animal.classname: " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        return t;
    }
}
