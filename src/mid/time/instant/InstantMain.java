package mid.time.instant;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        // 생성 (UTC 기준)
        Instant now = Instant.now();
        System.out.println("now: " + now);

        // from() 다른타입의 날짜와 시간 기준으로 생성 (UTC 기준 ,LocalDateTime 사용X)
        ZonedDateTime zdt0 = ZonedDateTime.now();
        Instant from = Instant.from(zdt0);
        System.out.println("from: " + from);

        // ofEpochSecond() 에포크 시간을 기준으로 Instant 생성
        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochSecond: " + epochStart); // 1970-01-01T00:00:00Z

        Instant epochSecond = Instant.ofEpochSecond(100);
        System.out.println("epochSecond: " + epochSecond); // 1970-01-01T00:01:40Z

        // 계산
        Instant later = epochStart.plusSeconds(5000);
        System.out.println("later: " + later);
        
        // 조회
        long epochSecond1 = later.getEpochSecond();
        System.out.println("epochSecond1: " + epochSecond1);
    }
}
