package mid1.time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class StartEndDay {
    // 입력받은 월의 첫날 요일과 마지막날 요일 구하기
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Month 입력: ");
        int monthNum = scanner.nextInt();
        if(monthNum >= 1 && monthNum <= 12){

            LocalDate localDate = LocalDate.now().withMonth(monthNum);

            // public LocalDate with(TemporalAdjuster adjuster)
            DayOfWeek startWeek = localDate.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek();
            DayOfWeek endWeek = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

            System.out.println("시작요일: " + startWeek);
            System.out.println("마지막요일: " + endWeek);

        }else{
            System.out.println("잘못된 입력");
        }
        scanner.close();
    }
}
