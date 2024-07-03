package mid1.time.amount;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(20);
        System.out.println("duration: " + duration);

        LocalTime localTime = LocalTime.of(1, 0);
        System.out.println("localTime: " + localTime);

        // 계산
        LocalTime plusDuration = localTime.plus(duration);  // TemporalAmount
        System.out.println("plusDuration: " + plusDuration);

        // 시간 차이
        LocalTime startTime = LocalTime.of(7, 1);
        LocalTime endTime = LocalTime.of(18, 30);
        Duration betweenTime = Duration.between(startTime, endTime);

        // private final long seconds;  private final int nanos; (초 속성만 있음 -> 시간, 분은 toXXX()  |  초, 나노초는 getXXX() )
        System.out.println("차이: " + betweenTime.getSeconds() + "초");
        System.out.println("시간: " + betweenTime.toHours() + "시간 " + betweenTime.toMinutesPart() + "분" ); // 부분 분 (시간 제외하고 남은 분)
        System.out.println("분: " + betweenTime.toMinutes()); // 전체 시간 -> 전체 분

    }
}
