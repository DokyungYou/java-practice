package basic.polymorphism.example3.payment;

public class PayService {
    public void processPay(Payment payment, int amount){

        try{
            payment.pay(amount);
            System.out.println("결제 완료");
        } catch (Exception e){
            e.getMessage();
            System.out.println("결제 실패");
        }

    }
}
