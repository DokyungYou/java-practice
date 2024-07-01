package time.test;

import java.time.LocalDateTime;

public class PlusDate {
    // 현재 시각에 2년 4개월 5일 2시간 후의 시작 구하기
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println("기존시각: " + now);
        System.out.println("2년 4개월 5일 2시간 후: "+ now.plusYears(2).plusMonths(4).plusDays(5).plusHours(2)); // 불변객체의 변환메서드는 메서드 체이닝이 가능
    }
}
