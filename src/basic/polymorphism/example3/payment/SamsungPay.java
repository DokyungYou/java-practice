package basic.polymorphism.example3.payment;

public class SamsungPay implements Payment{
    @Override
    public void pay(long amount) {
        System.out.println("삼성페이 연결");
        System.out.println(amount + "원 결제");
    }
}
