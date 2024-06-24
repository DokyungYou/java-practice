package basic.extends0.access;

import basic.extends0.access.child.Child;

public class AccessMain {
    public static void main(String[] args) {

        // 한 몸인 것 같아보이지만
        // 객체 내부에서는 자식과 부모 인스턴스가 구분돼있기 때문에 접근 제어자 영향을 받음
        Child child = new Child();

        child.printParent();
        child.call();
        child.printParent();
    }
}
