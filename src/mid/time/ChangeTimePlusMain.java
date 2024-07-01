package mid.time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {

        // TemporalAccessor (조회)
        // Temporal (조작)

        LocalDateTime ldt = LocalDateTime.of(2025, 1, 1, 1, 1);
        System.out.println("     ldt: " + ldt);

        // public LocalDateTime plus(long amountToAdd, TemporalUnit unit)
        // "10 시간" 플러스
        LocalDateTime plusLdt1 = ldt.plus(10, ChronoUnit.HOURS);
        System.out.println("plus10HOURS: " + plusLdt1);

        // "10 년" 플러스
        LocalDateTime plusLdt2 = ldt.plus(10, ChronoUnit.YEARS);
        System.out.println("plus10YEARS: " + plusLdt2);


        // public LocalDateTime plus(TemporalAmount amountToAdd)
        // Period
        Period period =Period.ofYears(10);
        System.out.println(ldt.plus(period));


        // 편의메서드
        System.out.println(ldt.plusMonths(10));
        System.out.println(ldt.plusHours(10));
        System.out.println(ldt.plusHours(10));
        System.out.println(ldt.plusMinutes(10));
        System.out.println(ldt.plusSeconds(10));
    }
}
