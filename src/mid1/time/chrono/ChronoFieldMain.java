package mid1.time.chrono;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {
    public static void main(String[] args) {
        for (ChronoField value : ChronoField.values()) {
            System.out.println("value: " + value + " range: " + value.range());  // ex) value: HourOfDay range: 0 - 23
        }

        System.out.println("ChronoField.MONTH_OF_YEAR.range(): " + ChronoField.MONTH_OF_YEAR.range());  // 1 - 12
        System.out.println("ChronoField.DAY_OF_MONTH.range(): " + ChronoField.DAY_OF_MONTH.range()); // 1 - 28/31
    }
}
