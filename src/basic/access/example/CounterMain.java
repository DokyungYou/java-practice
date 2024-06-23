package basic.access.example;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter = new Counter();

        System.out.println("현재 count: " + counter.getCount());


        for (int i = counter.getCount(); i <= 10 ; i++) {
            counter.increase();
            System.out.println("현재 count: " + counter.getCount());
        }

        System.out.println();

        for (int i = 10; i >= 0 ; i--) {
            counter.decrease();
            System.out.println("현재 count: " + counter.getCount());
        }



    }
}
