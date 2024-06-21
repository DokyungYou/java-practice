package basic.array.Example;

import java.util.Scanner;

public class Example2 {
    // 배열의 역순
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("정수 5번 입력하십시오.");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = nums.length-1 ; i >= 0; i--) {
            System.out.print(nums[i]);
            if(i != 0 ) System.out.print(",");
        }
        
        scanner.close();
    }
}
