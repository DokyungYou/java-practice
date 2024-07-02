package mid.nested.local;

import java.lang.reflect.Field;

public class LocalOuter02 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar){
        int localVar = 1; // 지역변수는 스택 프레임이 종료되는 순간 함께 제거

        class LocalPrinter implements Printer {
            int value = 0;
            @Override
            public void printValue(){
                System.out.println("멤버변수(localInner): " + value);
                System.out.println("멤버변수(outer): " + LocalOuter02.this.outInstanceVar);

                // LocalPrinter 인스턴스 생성 때 접근이 필요한 지역변수를 복사해서 인스턴스에 같이 포함시킴
                // printValue() 가 실행할때 접근하는 localVar, paramVar는 스택영역의 지역변수에 접근 X
                // 인스턴스에 캡쳐해놓은 값에 접근하는 것
                System.out.println("지역변수: " + localVar);
                System.out.println("매개변수: " + paramVar);
            }
        }
        
        return new LocalPrinter(); // 지역클래스로 만든 객체도 인스턴스이기때문에 Heap 영역에 존재
    }

    public static void main(String[] args){
        LocalOuter02 localOuter = new LocalOuter02();
        Printer printer = localOuter.process(2);

        // 지역클래스 내의 메서드를 밖에서 실행
        // process() 스택 프레임이 사라진 이후에 실행했음
        // 스택 프레임이 사라져도 printer 라는 참조변수가 있는 한 Heap 영역에 남아있음 -> 그래서 밖에서도 printValue()를 실행가능

        // printValue() 안의 지역변수에 접근하는 코드는 어떻게 실행되는가? (지역변수와 인스턴스의 생존주기가 다른데?)
        // 지역클래스의 인스턴스를 생성하는 시점에 접근이 필요한 지역 변수를 복사해서 인스턴스에 함께 넣어둠
        printer.printValue();

        //
        System.out.println("선언된 필드 확인");
        for (Field field : printer.getClass().getDeclaredFields()) {
            System.out.println(field);
        }

        /*
        // 인스턴스변수 (직접 선언해놓은 멤버변수)
        int mid.nested.local.LocalOuter02$1LocalPrinter.value
        
        // 캡쳐 변수
        final int mid.nested.local.LocalOuter02$1LocalPrinter.val$localVar
        final int mid.nested.local.LocalOuter02$1LocalPrinter.val$paramVar
        
        바깥 클래스를 참조하기 위한 필드
        final mid.nested.local.LocalOuter02 mid.nested.local.LocalOuter02$1LocalPrinter.this$0
        */
    }

}
