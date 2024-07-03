package mid1.nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer1 = new InnerOuter();
        InnerOuter outer2 = new InnerOuter();

        // 내부클래스 생성 시 바깥 클래스의 인스턴스 참조 필요 (인스턴스에 소속 됨)
        // -> 바깥 클래스의 인스턴스는 여러개 생성이 가능
        // -> 어떤 인스턴스를 참조할 것인지 정해줘야함
        InnerOuter.Inner inner1 = outer1.new Inner();
        InnerOuter.Inner inner2 = outer2.new Inner();


        System.out.println("innerClass: "+ inner1.getClass()); // InnerOuter$Inner
    }
}
