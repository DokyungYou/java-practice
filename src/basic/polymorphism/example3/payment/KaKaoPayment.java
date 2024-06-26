package basic.polymorphism.example3.payment;

public class KaKaoPayment implements Payment {
    @Override
    public void pay(long amount){
        System.out.println("카카오페이 연결");
        System.out.println(amount + "원 결제");
    }
}
