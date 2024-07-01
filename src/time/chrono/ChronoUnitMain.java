package time.chrono;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {
    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println("value: " + value);
        }
        System.out.println("ChronoUnit.HOURS: " + ChronoUnit.HOURS);
        System.out.println("ChronoUnit.HOURS.getDuration().getSeconds(): " + ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println("ChronoUnit.DAYS: " + ChronoUnit.DAYS);


        // 차이 구하기 (시각 & 시각)============================================================================
        LocalTime localTime1 = LocalTime.of(1,10,0);
        LocalTime localTime2 = LocalTime.of(1,30,0);

        // second
        long secondsBetween = ChronoUnit.SECONDS.between(localTime1, localTime2);
        System.out.println("secondsBetween: " + secondsBetween);

        // minute
        long betweenMinute = ChronoUnit.MINUTES.between(localTime1, localTime2);
        System.out.println("betweenMinute: " + betweenMinute);

    }
}
