package basic.polymorphism.basic;

public class PolyMain {
    public static void main(String[] args) {

        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent(); // Parent 본인 인스턴스만 생성
        parent.parentMethod();


        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child(); // Parent 인스턴스 생성 + Child 인스턴스 생성
        child.childMethod();
        child.parentMethod(); // Child 인스턴스를 먼저 찾아가고 해당 메서드가 없으니 Parent 인스턴스로 이동해서 찾고 호출


        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // Parent 인스턴스 생성 + Child 인스턴스 생성  // 부모타입의 변수가 자식 인스턴스를 참조
        poly.parentMethod();
        //poly.childMethod(); // 자식기능은 호출불가


    }
}
