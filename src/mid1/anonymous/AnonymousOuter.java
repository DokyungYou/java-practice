package mid1.anonymous;

import mid1.nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;

//        class LocalPrinter implements Printer {  // 클래스 선언
//            int value = 0;
//
//            @Override
//            public void printValue(){
//                System.out.println("멤버변수(localInner): " + value);
//                System.out.println("지역변수: " + localVar);
//                System.out.println("매개변수: " + paramVar);
//                System.out.println("멤버변수(outer): " + AnonymousOuter.this.outInstanceVar);
//            }
//        }
        // LocalPrinter localPrinter = new LocalPrinter(); // 인스턴스 생성 (클래스 선언과 분리돼있음)



        // 클래스 body를 정의하면서 생성
        // 인터페이스나 추상클래스를 구현하면서 "구현체를 이름없이" 만드는 것 (익명클래스는 상위클래스나 인터페이스 필요)
        // 상속받으면서 바로 정의&구현

        // 인터페이스 이름 앞에 new 가 붙어서 있어서 착각할 수 있는데
        // Printer 객체를 생성하는 것이 아님 (Printer 인터페이스를 구현한 익명 클래스를 생성)
        Printer anonymousPrinter = new Printer(){
            int value = 0;
            @Override
            public void printValue() {
                System.out.println("멤버변수(localInner): " + value);
                System.out.println("지역변수: " + localVar);
                System.out.println("매개변수: " + paramVar);
                System.out.println("멤버변수(outer): " + AnonymousOuter.this.outInstanceVar);
            }
        };

        anonymousPrinter.printValue();

        System.out.println("anonymousPrinter class:  "+ anonymousPrinter.getClass());
        // class mid.anonymous.AnonymousOuter$1 (익명클래스는 숫자로 정의된다, 여러개일 경우 숫자 증가)
    }

    public static void main(String[] args){
        AnonymousOuter anonymousOuter = new AnonymousOuter();
        anonymousOuter.process(2);

    }
}
