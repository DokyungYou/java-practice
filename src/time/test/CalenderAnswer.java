package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class CalenderAnswer {
    // 입력 조건: 년도, 월
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

    private static int getOffsetWeekDays(LocalDate localDate){
        return localDate.getDayOfWeek().getValue() % 7;  // 월(1) ~ 일(7) % 7 -> 일(0) ~ 토(6)
    }

    private static void printCalender(LocalDate localDate){

        int offsetWeekDays = getOffsetWeekDays(localDate);

        System.out.println("일 \t월 \t화 \t수 \t목 \t금 \t토");
        for (int i = 0; i < offsetWeekDays ; i++) {
            System.out.print("\t");
        }

        LocalDate firstDayOfNextMonth = localDate.plusMonths(1);
        LocalDate dayIterator = localDate;

        while (dayIterator.isBefore(firstDayOfNextMonth)){
            System.out.printf("%2d\t", dayIterator.getDayOfMonth());
            if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY){
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }


        }
    }



