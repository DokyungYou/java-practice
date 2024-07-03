package mid1.enumeration.test;

import java.util.Scanner;

public class HttpStatusScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("HTTP CODE: ");
            HttpStatus httpStatus = HttpStatus.getByCode(scanner.nextInt());
            if(httpStatus == null){
                System.out.println("정의되지 않은 코드입니다.");
                continue;
            }
            httpStatus.printStatus();
            break;
        }

        scanner.close();
    }
}
