package basic.scanner;

import java.util.Scanner;

public class ScannerLoop1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("문자를 입력해주십시오.(종료 시 exit)");
            String enteredStr = scanner.nextLine();

            if(enteredStr.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열은 "+ enteredStr +"입니다.");
        }

        scanner.close();
    }
}
