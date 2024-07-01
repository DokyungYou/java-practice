package mid.time.local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {

        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDateTime ofDateTime = LocalDateTime.of(2024, 7, 11, 11, 35, 40);

        System.out.println("현재 날짜시간: " + nowDateTime);
        System.out.println("지정 날짜시간: " + ofDateTime);



        //  private final LocalDate date;
        //  private final LocalTime mid.time;
        
        // 날짜와 시간 분리
        LocalDate tolocalDate = nowDateTime.toLocalDate();
        LocalTime tolocalTime = nowDateTime.toLocalTime();
        
        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(tolocalDate, tolocalTime);
        System.out.println("localDateTime: " + localDateTime);
        
        // 계산
        LocalDateTime nowDateTimePlusDays = nowDateTime.plusDays(1000);
        System.out.println("nowDateTimePlusDays 1000days: " + nowDateTimePlusDays);

        LocalDateTime localDateTimePlusYears = nowDateTime.plusYears(2000);
        System.out.println("localDateTimePlusYears: " + localDateTimePlusYears);

        // 비교
        System.out.println("현재날짜시간 < 지정 날짜시간: " + nowDateTime.isBefore(ofDateTime));
        System.out.println("현재날짜시간 > 지정 날짜시간: " + nowDateTime.isAfter(ofDateTime));
        System.out.println("현재날짜시간 == 지정 날짜시간: " + nowDateTime.isEqual(ofDateTime));

    }
}
