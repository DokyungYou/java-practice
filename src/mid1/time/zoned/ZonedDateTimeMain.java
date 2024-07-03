package mid1.time.zoned;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime dateZdt  = ZonedDateTime.now(); // private final LocalDateTime dateTime;  private final ZoneOffset offset;  private final ZoneId zone;
        System.out.println(dateZdt);

        LocalDateTime ldtNow = LocalDateTime.now();


        // of
        ZonedDateTime zdt0 = ZonedDateTime.of(ldtNow, ZoneId.systemDefault());
        System.out.println("zdt0: "+ zdt0);

        //ZonedDateTime of( int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond, ZoneId zone)
        ZonedDateTime zdt1 = ZonedDateTime.of(2024, 7, 10, 13, 0, 10, 0, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt1: "+ zdt1);

        // 타임존 변경
        ZonedDateTime utcZdt = zdt1.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println(utcZdt);
    }
}
