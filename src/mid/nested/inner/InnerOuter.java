package mid.nested.inner;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 4;

    class Inner {  // 이너 클래스 == 인스턴스 멤버
        private int innerInstanceValue = 1;

        public void print(){
            // 자기 자신에 접근
            System.out.println(innerInstanceValue);

            // 외부 인스턴스멤버 접근 가능
            System.out.println(outInstanceValue);
            
            // 외부 클래스멤버 접근 가능
            System.out.println(outClassValue);
        }
    }
}
