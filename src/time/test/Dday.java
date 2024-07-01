package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Dday {
    // 시작날짜와 목표날짜를 입력해서 남은 기간과 디데이 구하기
    // 남은 기간: X년 X개월 X일 형식으로 출력
    // 디데이: X일 남은 형식으로 출력
    public static void main(String[] args) {
        // 시작날짜: 현재날짜
        // 목표날짜: 내년 1월1일

        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.of(2025,1,1);

        // TemporalAmount - Period(년, 월, 일)
        Period between = Period.between(startDate, endDate);
        System.out.printf("%d년 %d개월 %d일\n", between.getYears(), between.getMonths(), between.getDays());

        // 일 단위
        long remainingDays = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("디데이: " + remainingDays + "일 남음");

    }
}
