package basic.extends0.super02;

public class ClassB extends ClassA{

    // 기본 생성자는 없는 상황
    
    public ClassB(int a){
        //super(); // 기본 생성자는 생략 가능 (자바가 자동으로 만들어줌)
        System.out.println("ClassB 생성자 a: " + a);
    }

    public ClassB(int a, int b){
        //super();
        System.out.println("ClassB 생성자 a, b: " + a + "," + b);
    }


}
