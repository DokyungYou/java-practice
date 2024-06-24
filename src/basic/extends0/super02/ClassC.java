package basic.extends0.super02;

public class ClassC extends ClassB{
    public ClassC() {
        // 자식 클래스의 생성자 첫줄엔 반드시 부모클래스의 생성자를 호출해야한다.
        super(1);
        System.out.println("ClassC 생성자 호출");
    }


    public ClassC(int a) {

        // 이 경우는 해당 this 생성자 내에 super()가 있기때문에 생략가능
        // 결국 this()를 몇번을 쓰건 마지막 this()에서는 super()가 호출되어야한다는 점
        this(a, 0);
        System.out.println("ClassC 생성자 호출 a: " + a);
    }



    public ClassC(int a, int b) {
        // 자식 클래스의 생성자 첫줄엔 반드시 부모클래스의 생성자를 호출해야한다.
        super(1);
        System.out.println("ClassC 생성자 호출 a, b: " + a + ","+ b);
    }


}
