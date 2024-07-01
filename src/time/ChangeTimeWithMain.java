package time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2025, 1, 1, 1, 0);
        System.out.println("ldt: " + ldt);

        // 특정필드만 바꾸기 (with) ========================================================
        LocalDateTime changeLdt1 = ldt.with(ChronoField.YEAR, 2030);
        System.out.println("changeLdt1: " + changeLdt1);
        // 편의메서드
        System.out.println("changeLdt1.withYear(2030): "+ changeLdt1.withYear(2030));


        // TemporalAdjusters 사용 (복잡한 조건의 날짜 계산)
        // 다음주 목요일
        LocalDateTime nextMonday = ldt.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("ldt: "+ ldt + " " + ldt.getDayOfWeek());
        System.out.println("ldt의 다음주 목요일: " + nextMonday + " " + nextMonday.getDayOfWeek());

        // 이번 달의 마지막 날짜 TemporalAdjusters.lastDayOfMonth()
        System.out.println("이번 달의 마지막 날짜: " + LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()));

        // 이번 달의 마지막 금요일
        System.out.println("이번 달의 마지막 금요일: " + LocalDate.now().with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY)));
    }
}
