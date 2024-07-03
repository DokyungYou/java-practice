package mid1.time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Calender2 {

    public static void main(String[] args) {

        int year;
        int month;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("년도를 입력하시오: ");
            year = scanner.nextInt();

            System.out.print("\n월을 입력하시오: ");
            int monthNum = scanner.nextInt();
            if(!validateMonth(monthNum)) continue;
            month = monthNum;

            printCalender(LocalDate.of(year, month,1));
            break;
        }
        scanner.close();

    }

    private static boolean validateMonth(int value){
        return (value >= 1 && value <= 12);
    }

    private static long getTotalDays(LocalDate localDate){
        LocalDate firstDayOfNextMonth = localDate.plusMonths(1);
        return ChronoUnit.DAYS.between(localDate, firstDayOfNextMonth);
    }
    private static int getFirstDayNum(LocalDate localDate){
        return localDate.getDayOfWeek().getValue(); // return ordinal() + 1; -> 월1 ~ 일7
    }

    private static void printCalender(LocalDate localDate){
        long totalDays = getTotalDays(localDate);
        int firstDayNum = getFirstDayNum(localDate);

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

