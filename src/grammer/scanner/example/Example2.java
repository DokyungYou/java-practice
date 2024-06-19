package grammer.scanner.example;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        // 입력받은 정수가 홀수인지 짝수인지 판별

        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하시오.");
        int enteredInt = scanner.nextInt();

        if(enteredInt % 2 == 0){
            System.out.printf("당신이 입력한 정수 %d는 짝수입니다.",enteredInt);
        }else {
            System.out.printf("당신이 입력한 정수 %d는 홀수입니다.",enteredInt);
        }
    }
}
