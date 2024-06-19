package grammer.scanner;

import java.util.Scanner;

public class ScannerLoop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 수를 모두 0으로 입력 시 프로그램 종료");

        while (true){
            System.out.print("첫번째 수: ");
            int int1 = scanner.nextInt();

            System.out.print("두번째 수: ");
            int int2 = scanner.nextInt();

            if(int1 == 0 && int2 == 0){
                System.out.println("프로그램 종료");
                break;
            }
        }


    }
}
