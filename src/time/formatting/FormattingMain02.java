package time.formatting;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain02 {
    public static void main(String[] args) {
        // // 포맷팅: DateTime -> String
        LocalDateTime ldtNow = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss");

        String formatted = ldtNow.format(formatter);
        System.out.println("formatted: " + formatted);

        System.out.println(ldtNow.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초")));


        // 파싱: String -> DateTime
        System.out.println("parsed: " + LocalDateTime.parse(formatted, formatter));

    }
}
