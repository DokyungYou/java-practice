package mid1.time.local;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2024, 7, 1);

        System.out.println("오늘 날짜: " + nowDate);
        System.out.println("지정 날짜: " + ofDate);

        //계산(불변)
        LocalDate plusDays = ofDate.plusDays(7);
        System.out.println("지정 날짜: " + ofDate);
        System.out.println("지정날짜 + days" + plusDays);

        for (Field declaredField : LocalDate.class.getDeclaredFields()) {
            System.out.println(declaredField); // 모든 필드가 final 인 것을 볼 수 있음
        }
        // 모든 날짜 클래스는 불변이므로, 변경 시 반환값 꼭 받기

    }
}
