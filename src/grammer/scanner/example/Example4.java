package grammer.scanner.example;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        
        // 입력한 숫자의 합계와 평균 구하기 , -1입력시 종료
        Scanner scanner = new Scanner(System.in);

        int totalSum = 0;
        int count = 0;
        while (true){
            System.out.print("숫자를 입력하십시오 :");
            int num = scanner.nextInt();
            if(num == -1) break;

            totalSum += num;
            count++;
        }
        System.out.printf("합계: %d, 평균: %5.2f", totalSum, (double)totalSum/count);

        
    }
}
