package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LoopPlus {
    // 현재시각 부터 3주 간격으로 4번 반복하여 날짜 출력
    public static void main(String[] args) {
        
        // 내 풀이
        LocalDate now = LocalDate.now();
        int num = 4;
        int intervalWeeks = 3;

        System.out.println("before: " + now);
        for (int i = 1; i <= num; i++) {
            now = now.plusWeeks(intervalWeeks);
            System.out.println("날짜 "+ i + ": " + now);
        }

        System.out.println("====================================");
        // 정답
        LocalDate now2 = LocalDate.now();
        for (int i = 0; i < 4; i++) {
            System.out.println("날짜"+ (i+1) +": " + now2.plus(intervalWeeks * i, ChronoUnit.WEEKS));
        }
    }
}
