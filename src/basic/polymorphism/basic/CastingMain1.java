package basic.polymorphism.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모변수 -> 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //poly.childMethod(); 자식기능은 호출 불가
        
        //다운캐스팅
        Child child = (Child) poly;
        child.parentMethod();
        child.childMethod();
        // poly의 타입이 변하는 것이 아닌 poly의 참조값을 복사하고 복사본의 타입을 Child 로 바꾸는 것이다. (poly의 타입은 Parent로 기존과 같이 유지된다)
        // 자바에서 대입연산 시 기존 것을 건드리지 않는다. (기존 것을 복사작업한다.)
    }
}
