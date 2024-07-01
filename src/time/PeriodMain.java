package time;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        // 생성
        Period period = Period.ofDays(10);
        System.out.println("period: " + period);
        
        // 계산에 사용
        LocalDate localDate = LocalDate.of(2024, 7, 7);
        LocalDate plusPeriod = localDate.plus(period);  // TemporalAmount

        System.out.println("localDate: " + localDate);
        System.out.println("plusPeriod: " + plusPeriod);

        // 기간 차이
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.of(2025, 1, 1);

        System.out.println("\nstartDate: " + startDate);
        System.out.println("endDate: " + endDate);

        Period between = Period.between(startDate, endDate);  // private final int years;  private final int months;  private final int days;
        System.out.println("between: " + between);
        System.out.println("기간: " + between.getYears() + "년 " + between.getMonths() +"개월 " + between.getDays() + "일");
    }
}
