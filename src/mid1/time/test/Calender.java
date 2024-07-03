package mid1.time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Calender {
    // 입력 조건: 년도, 월
    public static void main(String[] args) {

        int year = 2024;
        int month = 3;

        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);
        long totalDays = ChronoUnit.DAYS.between(firstDayOfMonth, firstDayOfNextMonth);

        // return ordinal() + 1; -> 월1 ~ 일7
        // 월1 ~ 일7 % 7 -> (일0 토6)
        int firstDayNum = firstDayOfMonth.getDayOfWeek().getValue(); // 1이면 -> 월요일 , 1칸 띄운다.


        System.out.println("일 \t월 \t화 \t수 \t목 \t금 \t토");
        for (int i = 0; i < totalDays + firstDayNum; i++) {

            if(i < firstDayNum){
                System.out.print("\t");
            }else {
                if(i % 7 == 0) {
                    System.out.println();
                }
                    System.out.printf("%02d\t", (i - firstDayNum + 1));
                }

            }

        }

    }

