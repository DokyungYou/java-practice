package grammer.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("문자열을 입력하십시오 : ");
            String str = scanner.nextLine();  // 입력한 문자열 한줄
            System.out.println("입력하신 문자열: "+ str);

            System.out.print("정수를 입력해주세요.: ");
            int intValue = scanner.nextInt();  // 입력한 int 한줄
            System.out.println("입력하신 숫자: "+ intValue);


            System.out.print("실수를 입력해주세요.: ");
            double doubleValue = scanner.nextDouble();  // 입력한 double 한줄
            System.out.println("입력하신 실수: "+ doubleValue);

        }catch (InputMismatchException exception){
            System.out.println("타입에 맞게 입력해주세요.");
        }finally {
            scanner.close();
        }

    }
}
