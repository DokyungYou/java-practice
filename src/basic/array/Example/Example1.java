package basic.array.Example;

import java.util.Scanner;

public class Example1 {
    // 정수를 입력받아서 배열에 저장하고, 입력 순서대로 출력
    // ex) 정수, 정수, 정수

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[5];
        System.out.println(nums.length +"번의 정수를 입력하세요.");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if(i < nums.length -1) System.out.print(",");
        }


        scanner.close();
    }
}
