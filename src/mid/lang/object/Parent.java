package mid.lang.object;

// 부모클래스가 없다면 묵시적으로 Object 클래스를 상속 (최상위 클래스)
public class Parent {  // extends Object 가 생략된 것임
    public void parentMethod(){
        System.out.println("Parent.parentMethod");
    };

}
