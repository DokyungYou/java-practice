package mid1.anonymous.example.ref2;

import mid1.anonymous.example.Processor;

import java.util.Random;

public class Refactoring02_2 {

    public static void hello(Processor processor){
        System.out.println("program start");
        processor.run();
        System.out.println("program end");
    }

    public static void main(String[] args) {

        // 일회용일 경우 익명클래스로 구현

        hello(new Processor() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 결과: " + randomValue);
            }
        });
        
        hello(new Processor() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }

}
