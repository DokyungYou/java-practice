package mid2.collection.list.test.example01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// n개의 정수 입력 받고, List에 저장 후 입력 순서대로 출력
// 0 입력시 입력 종료, 결과 출력
// 출력시 포멧은 정수, 정수, 정수
public class ListPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하시오. (종료: 0)");
        while (true){
            int num = scanner.nextInt();
            if(num == 0) break;
            list.add(num);
        }
        scanner.close();
        printList(list);
        System.out.println("\n총합: " + getTotalSum(list));
        System.out.println("평균: " + getAverage(list));

    }

    private static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));

            if(i < list.size()-1){
                System.out.print(", ");
            }
        }
    }

    private static int getTotalSum(List<Integer> list){
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
    private static double getAverage(List<Integer> list){
        return (double) getTotalSum(list) / list.size();
    }


}
