package grammer.array.Example;

import java.util.Scanner;

public class Example3 {
    // 합계와 평균 계산
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.println("정수 5번 입력하시오.");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }


        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println("합계: " + sum);
        System.out.println("평균: " + (double)sum / nums.length );


        scanner.close();
    }
}
