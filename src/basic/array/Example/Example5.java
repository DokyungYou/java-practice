package basic.array.Example;

import java.util.Scanner;

public class Example5 {
    // n개의 정수 입력 받아서 배열에 저장 후 , 가장 작은 수와 가장 큰 수를 찾아 출력
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받으면서 동시에 최소치, 최대치 구하기 ========================

        System.out.print("정수를 몇번 입력하시겠습니까? : ");
        int time = scanner.nextInt();

        int[] nums = new int[time];

        int min = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();

            // 처음 시작 시 최소치로
            if(i == 0){
                min = nums[i];
            }else {
                if(nums[i] < min){
                    min = nums[i];
                } else if (nums[i] > max) {
                    max = nums[i];
                }
            }
        }
        System.out.printf("최소치: %d, 최대치: %d", min, max);


        // 입력받고 난 후 최소치, 최대치 구하기 =============================

//        System.out.print("정수를 몇번 입력하시겠습니까? : ");
//        int time = scanner.nextInt();
//
//        int[] nums = new int[time];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = scanner.nextInt();
//        }
//
//
//        int min , max = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            if(nums[i] < min){
//                min = nums[i];
//            }
//            if(nums[i] > max){
//                max = nums[i];
//            }
//        }
//        System.out.printf("최소치: %d, 최대치: %d", min, max);


        scanner.close();
    }

}