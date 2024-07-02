package mid.anonymous.example;

import java.util.Random;

public class Refactoring01 {
    public static void main(String[] args) {
        hello(new Dice());
        hello(new Sum());
    }
    public static void hello(Processor processor){
        System.out.println("program start");
        processor.run();
        System.out.println("program end");
    }

}

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