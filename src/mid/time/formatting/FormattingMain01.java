package mid.time.formatting;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now: " + now); // 2024-07-01 -> ISO 표준출력

        // 포맷팅: Date -> String ==============================================

        // 수작업
        System.out.println(now.getYear() + "년 " + now.getMonthValue() + "월 " + now.getDayOfMonth()+ "일");

        // DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"); // ex) DD일 -> getDayOfYear() 로 나옴 (7월 1일 -> 183일) / 소문자와 대문자 값이 다름 (패턴 공식 참조)
        String formatted = formatter.format(now);
        System.out.println("formatted: " + formatted);


        // 파싱: String -> Date ==============================================

        String nowStr = "2024년 07월 01일";
        LocalDate parsed = LocalDate.parse(nowStr, formatter); // 문자열에 맞는 formatter 도 같이 넣어줘야한다.
        System.out.println("parsed: " + parsed);
    }
}
