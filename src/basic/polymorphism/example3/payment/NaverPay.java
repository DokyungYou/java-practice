package basic.polymorphism.example3.payment;

public class NaverPay implements Payment{
    @Override
    public void pay(long amount) {
        System.out.println("네이버페이 연결");
        System.out.println(amount + "원 결제");
    }
}
