package mid1.nested.nested;

public class NestedOuter {

    private static int outClassValue = 1;
    private int outInstanceValue = 2;


    static class Nested {
        private int nestedInstanceValue = 0;

        public void print(){
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에 접근
            //System.out.println(outInstanceValue); //Non-static field 'outInstanceValue' cannot be referenced from a static context
            
            // 바깥 클래스의 클래스멤버에 접근 (private도 가능)
            System.out.println(outClassValue); // NestedOuter.outClassValue 로 안해도 됨
        }
    }
}
