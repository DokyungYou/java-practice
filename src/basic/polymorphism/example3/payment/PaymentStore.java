package basic.polymorphism.example3.payment;


public class PaymentStore {

    // 생성자 호출을 막기 위함 (클래스를 추상클래스로 선언해줘도 좋다.)
    private PaymentStore(){
        
    }

    // 결제수단이 추가돼도 클라이언트인 PayService 는 수정하지 않아도 됨
    public static Payment selectPayment(int option){

        switch(option){
            case 1:
                return new KaKaoPayment();
            case 2:
                return new NaverPay();
            case 3:
                return new SamsungPay();
            default:
                return new DefaultPay();
        }

    }
}
