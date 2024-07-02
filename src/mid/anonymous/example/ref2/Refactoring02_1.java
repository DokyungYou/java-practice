package mid.anonymous.example.ref2;

import mid.anonymous.example.Processor;

import java.util.Random;

public class Refactoring02_1 {

    public static void hello(Processor processor){
        System.out.println("program start");
        processor.run();
        System.out.println("program end");
    }

    public static void main(String[] args) {

        class Dice implements Processor {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 결과: " + randomValue);
            }
        }

        class Sum implements Processor {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        }

        hello(new Dice());
        hello(new Sum());
    }

}
