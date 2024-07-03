package mid1.enumeration.example01;


public class StringGradeMain01 {
    public static void main(String[] args) {
        int price = 20000;

        DiscountService01 discountService = new DiscountService01();

        int basicDiscount = discountService.discount(StringGrade.BASIC, price);
        int goldDiscount = discountService.discount(StringGrade.GOLD, price);
        int diamondDiscount = discountService.discount(StringGrade.DIAMOND, price);

        // StringGrade 에 정의한 상수로 넣으면서 오타 등의 실수를 해결한듯 보이나
        // 여전히 실수로 존재하지 않는 등급을 넣을 수도 있다. (매개변수가 String이기때문)
        int noneDiscount1 = discountService.discount("DIAMAND", price); // 오타
        int noneDiscount2 = discountService.discount("diamond", price); // 대소문자

        System.out.println("BASIC 등급 할인금액: " + basicDiscount + "원");
        System.out.println("GOLD 등급 할인금액: " + goldDiscount + "원");
        System.out.println("DIAMOND 등급 할인금액: " + diamondDiscount + "원");

    }
}
