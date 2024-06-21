package basic.array.Example;

import java.util.Scanner;

public class Example4 {
    // 합계와 평균 계산 (숫자의 개수도 입력받기)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 몇번 입력하시겠습니까? : ");

        int enterTime = scanner.nextInt();
        int[] nums = new int[enterTime];


        System.out.println(enterTime + "번 입력해주십시오.");

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
