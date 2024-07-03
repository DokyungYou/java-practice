package mid1.time.offset;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime nowOdt = OffsetDateTime.now();
        System.out.println(nowOdt);

        LocalDateTime ldt = LocalDateTime.of(2024,7,7,13,10,30);
        System.out.println("ldt: "+ ldt);

        // private final LocalDateTime dateTime;  private final ZoneOffset offset;
        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));
        System.out.println("odt: " + odt);
    }
}
