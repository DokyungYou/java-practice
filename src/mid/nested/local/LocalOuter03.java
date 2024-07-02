package mid.nested.local;

import java.lang.reflect.Field;

public class LocalOuter03 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar){
        int localVar = 1;
        //localVar = 2;
        //paramVar = 0;
        
        // 지역클래스에서 접근하는 지역변수의 값은 변경불가하게 해놨음 (사실상 final) -> 옛날 버전에서는 선언시 직접 final로 명시해줬어야했음
        // LocalPrinter를 생성하는 시점에 지역변수를 캡쳐하는데, 해당 지역변수의 값이 변경이 가능하면
        // 스택영역에 있는 지역변수 != 인스턴스에 캡쳐한 변수의 값

        /* 동기화문제 발생
        - 지역변수 변경 -> 다시 캡쳐해야함
        - 캡쳐한 값 변경 -> 지역변수 값 변경해야함

        이는 사이드이펙트 발생 가능성 매우 높고, 디버깅도 어려움
        멀티쓰레드 상황에서의 동기화는 더더욱 어렵다.
        */

        class LocalPrinter implements Printer {
            int value = 0;
            @Override
            public void printValue(){
                System.out.println("멤버변수(localInner): " + value);
                System.out.println("멤버변수(outer): " + LocalOuter03.this.outInstanceVar);

                System.out.println("지역변수: " + localVar);
                System.out.println("매개변수: " + paramVar);
            }
        }

        // 캡쳐한 값도 변경 불가
        //localVar = 2;
        //paramVar = 0;
        return new LocalPrinter();
    }

    public static void main(String[] args){
        LocalOuter03 localOuter = new LocalOuter03();
        Printer printer = localOuter.process(2);

        printer.printValue();

        //
        System.out.println("선언된 필드 확인");
        for (Field field : printer.getClass().getDeclaredFields()) {
            System.out.println(field);
        }

        /*
        // 인스턴스변수 (직접 선언해놓은 멤버변수)
        int mid.nested.local.LocalOuter03$1LocalPrinter.value
        
        // 캡쳐 변수 (final 로 돼있는것을 볼 수 있음)
        final int mid.nested.local.LocalOuter03$1LocalPrinter.val$localVar
        final int mid.nested.local.LocalOuter03$1LocalPrinter.val$paramVar
        
        바깥 클래스를 참조하기 위한 필드
        final mid.nested.local.LocalOuter03 mid.nested.local.LocalOuter03$1LocalPrinter.this$0
        */
    }

}
