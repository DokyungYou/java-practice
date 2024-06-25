package basic.polymorphism.basic;

// 다운 캐스팅을 자동으로 하지 않는 이유
public class CastingMain2 {
    public static void main(String[] args) {

        // 다운캐스팅이 가능한 경우
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        // 다운캐스팅 불가
        Parent parent2 = new Parent(); // child 인스턴스는 생성 되지 않음
        //Child child2 = (Child) parent2;  // ClassCastException
    }
}
