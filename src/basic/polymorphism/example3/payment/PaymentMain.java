package basic.polymorphism.example3.payment;

public class PaymentMain {
    public static void main(String[] args) {
        PayService payService = new PayService();
        payService.processPay(new KaKaoPayment(), 1000000);
        payService.processPay(new SamsungPay(), 200000);
        payService.processPay(new NaverPay(), 5000);
    }
}
