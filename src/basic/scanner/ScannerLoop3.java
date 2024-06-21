package basic.scanner;

import java.util.Scanner;

public class ScannerLoop3 {
    public static void main(String[] args) {
        // 사용자의 입력을 받아 합계를 계산하는 프로그램
        // 0입력시 종료

        Scanner scanner = new Scanner(System.in);
        System.out.println("합계를 구해줄 것이니 정수를 입력하라. 종료를 원한다면 0을 입력하라.");

        int sum = 0;
        while (true){
            int enteredInt = scanner.nextInt();
            if(enteredInt == 0){
                System.out.println("종료하느니라.");
                break;
            }
            sum += enteredInt;
        }
        System.out.println("자네가 입력한 정수의 합은 " + sum + "이느니라");
    }

}
