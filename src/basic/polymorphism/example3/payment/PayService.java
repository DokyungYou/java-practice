package basic.polymorphism.example3.payment;

public class PayService {
    
    // 현재 PayService 는 Payment 에만 의존성을 가짐 (클라이언트는 역할에만 의존해야한다.)
    public void processPay(int optionNumber, int amount){

        Payment payment = PaymentStore.selectPayment(optionNumber);
        try{
            payment.pay(amount);
            System.out.println("결제 완료");
        } catch (Exception e){
            System.out.println("존재하지 않는 결제수단입니다.");
        }

    }

    // OCP 원칙을 위해 해당 로직은 다른 클래스로 이동
    // 결제수단이 추가될때마다 해당 메서드를 수정해줘야하니 C 에 위배
//    public Payment selectPayment(int option){
//
//        switch(option){
//            case 1:
//                return new KaKaoPayment();
//            case 2:
//                return new NaverPay();
//            case 3:
//                return new SamsungPay();
//            default:
//                return null;
//        }
//    }
}
