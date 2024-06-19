package grammer.scanner.example;

import java.util.Scanner;

public class Scanner5 {
    // 두 개의 정수를 입력받고, 두 정수 사이의 모든 정수 출력
    // 첫번째 숫자보다 두번째 숫자가 더 크면 교환
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 수 입력: ");
        int num1 = scanner.nextInt();

        System.out.print("두번째 수 입력: ");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num1; i <= num2 ; i++) {

//            if(i == num2){
//                System.out.println(i);
//            }else {
//                System.out.print(i+",");
//            }

            System.out.print(i);
            if(i < num2) System.out.print(",");

        }

    }
}
