package mid1.anonymous.example.refRamda;

import mid1.anonymous.example.Processor;

import java.util.Random;

public class Refactoring03 {

    public static void hello(Processor processor){
        System.out.println("program start");
        processor.run();
        System.out.println("program end");
    }

    public static void main(String[] args) {

        // 람다는 클래스나 인스턴스를 정의하지 않고 함수(코드 블럭)을 직접 전달할 수 있다.
        // 람다가 나오기 전까진 매번 익명클래스를 구현해서 넘겼었다. (하지만 람다는 멤버변수 선언 불가)
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 결과: " + randomValue);
        });

        hello(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }
}
