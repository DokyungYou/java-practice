package basic.static2.example;

import static basic.static2.example.MathArrayUtils.*;

public class MathArrayMain {
    public static void main(String[] args) {
        int[] array = {34,56,166,100,200,44,22};

        System.out.println("sum: " + getSum(array));
        System.out.println("average: " + getAverage(array));
        System.out.println("minValue: " + getMin(array));
        System.out.println("maxValue: " + getMax(array));
    }
}
