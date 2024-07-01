package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        // 날짜와 시간 조회시 항목 중 어떤 필드를 조회할 지 선택 -> ChronoField 사용

        LocalDateTime ldt = LocalDateTime.of(2025, 1, 1, 13, 0);

        // public int get(TemporalField field)
        System.out.println("YEAR: " + ldt.get(ChronoField.YEAR)); // 년도 조회
        System.out.println("MONTH_OF_YEAR: " + ldt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("DAY_OF_MONTH: " + ldt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("HOUR_OF_DAY: " + ldt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("MINUTE_OF_HOUR: " + ldt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("SECOND_OF_MINUTE: " + ldt.get(ChronoField.SECOND_OF_MINUTE));

        // 편의 메서드에 없는 것
        System.out.println("MINUTE_OF_DAY: " + ldt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("SECOND_OF_DAY: " + ldt.get(ChronoField.SECOND_OF_DAY));


        // 편의 메서드 제공 (일반적으로는 편의메서드 사용, 없을 때만 get(TemporalField field)사용 )
        System.out.println("getXXX() =====================================");
        System.out.println("YEAR: " + ldt.getYear()); // 년도 조회
        System.out.println("MONTH_OF_YEAR: " + ldt.getMonth());  // JANUARY (Month 객체)
        System.out.println("MONTH_OF_YEAR: " + ldt.getMonthValue());  // 1

        System.out.println("DAY_OF_MONTH: " + ldt.getDayOfMonth());
        System.out.println("HOUR_OF_DAY: " + ldt.getHour());
        System.out.println("SECOND_OF_MINUTE: " + ldt.getSecond());


    }
}
