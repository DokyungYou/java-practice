package basic.extends0.super01;

public class SuperMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.call();
        System.out.println("===========");
        // child 인스턴스로 접근 시 같은 이름의 부모 요소는 노출이 안되고 본인요소로만 인식됨
        child.hello(); // hello of Child

        // 이름 다른 요소는 접근 가능
        System.out.println(child.differNameParentValue);
    }
}
