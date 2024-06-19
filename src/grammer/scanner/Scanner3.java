package grammer.scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        // 사용자로부터 두 개의 정수를 입력 받고, 더 큰 수를 출력하는 프로그램을 작성,두 숫자가 같은 경우 두숫자는 같다고 출력
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력해주십시오.");
        int int1 = scanner.nextInt();

        System.out.println("두번째 숫자를 입력해주십시오.");
        int int2 = scanner.nextInt();


       if(int1 > int2){
           System.out.printf("%d가 %d보다 더 큰 수입니다.", int1, int2);
       }else if(int1 < int2){
           System.out.printf("%d가 %d보다 더 큰 수입니다.", int2, int1);
       }else {
           System.out.printf("%d와 %d는 같은 수입니다.", int1, int2);
       }

       scanner.close();
    }
}
