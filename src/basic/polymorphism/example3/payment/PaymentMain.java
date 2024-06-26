package basic.polymorphism.example3.payment;

import java.util.Scanner;

public class PaymentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();


        System.out.println("결제수단을 선택해주세요. [카카오페이(1), 네이버페이(2), 삼성페이(3)]");
        int optionNumber = scanner.nextInt();

        System.out.println("결제금액을 입력해주세요: ");
        int amount = scanner.nextInt();

        payService.processPay(optionNumber,amount);

        scanner.close();
    }
}
