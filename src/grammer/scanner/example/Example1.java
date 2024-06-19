package grammer.scanner.example;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
       // 이름과 나이 출력 "당신의 이름은 []이고, 나이는 []입니다."
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("당신의 이름을 입력하십시오: ");
        String name = scanner.nextLine();

        System.out.print("당신의 나이를 입력하십시오: ");
        int age = scanner.nextInt();

        System.out.printf("당신의 이름은 [%s]이고, 나이는 [%d]입니다.", name, age);
    }
}
