package basic.polymorphism.overriding;

public class Child extends Parent{

    // 필드는 부모클래스와 이름이 같아도 오버라이딩이 되지 않는다.
    public String value = "child";

    
    // 현재 클래스의 인스턴스를 Parent 타입으로 선언한 뒤 method를 호출 시 
    // parent method가 아닌 현재 클래스의 override된 메서드가 호출된다.
    
    // 오버라이딩 된 메서드는 항상 우선권을 가진다. (절대적으로)
    // 자식에서도 , 손자에서도 같은 메서드를 오버라이딩 시 손자 오버라이딩 메서드가 우선권을 가짐
    @Override
    public void method(){
        System.out.println("ChildMethod");
    }

}
