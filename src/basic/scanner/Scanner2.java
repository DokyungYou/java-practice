package basic.scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하시오.");
        int num1 = scanner.nextInt();

        System.out.println("두번째 숫자를 입력하시오.");
        int num2 = scanner.nextInt();

        int sum = num1 + num2 ;
        System.out.println("두 수의 합은 "+ sum + "입니다.");

        scanner.close();



    }
}
