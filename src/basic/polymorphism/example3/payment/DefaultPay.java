package basic.polymorphism.example3.payment;

public class DefaultPay implements Payment{
    @Override
    public void pay(long amount){
        System.out.println("존재하지 않는 결제 수단입니다.");
    }
}
