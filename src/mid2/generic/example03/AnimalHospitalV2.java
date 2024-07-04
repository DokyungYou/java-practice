package mid2.generic.example03;

public class AnimalHospitalV2<T>{
    private T animal;
    public void setAnimal(T animal){
        this.animal = animal;
    }

    public void checkup(){
        
        // T의 타입은 객체 생성전까지는 알 수 없기때문에 Object의 메서드만 사용가능
//        System.out.println("동물이름: " + animal.getName());
//        System.out.println("동물크기: " + animal.getSize());
//        animal.sound();
    }

    public T bigger(T targetAnimal){
        //return animal.getSize() > targetAnimal.getSize() ? animal : targetAnimal;
        return null;
    }

}
