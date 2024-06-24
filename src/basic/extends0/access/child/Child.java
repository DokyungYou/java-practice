package basic.extends0.access.child;

import basic.extends0.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicValue = 1;
        protectedValue = 1; // 다른 패키지지만 상속관계라서 가능
        //defaultValue = 1 다른 패키지라서 접근 불가 (컴파일 오류)
        //privateValue = 1 당연히 접근 불가

        publicMethod();
        protectedMethod();
        //defaultMethod();
        //privateMethod();

        printParent();
    }
}
