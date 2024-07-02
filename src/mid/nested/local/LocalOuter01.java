package mid.nested.local;

public class LocalOuter01 {
    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;

        // 지역클래스는 접근제어자 사용불가
        // 지역클래스도 인터페이스 구현가능
        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void printValue(){
                System.out.println("멤버변수(localInner): " + value);
                System.out.println("지역변수: " + localVar);
                System.out.println("매개변수: " + paramVar);
                System.out.println("멤버변수(outer): " + LocalOuter01.this.outInstanceVar);
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printValue();
    }

    public static void main(String[] args){
        LocalOuter01 localOuter = new LocalOuter01();
        localOuter.process(2);
    }
}
