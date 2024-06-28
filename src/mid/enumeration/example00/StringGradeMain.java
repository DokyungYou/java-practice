package mid.enumeration.example00;

public class StringGradeMain {
    public static void main(String[] args) {
        int price = 20000;

        DiscountService discountService = new DiscountService();
        int basicDiscount = discountService.discount("BASIC", price);
        int goldDiscount = discountService.discount("GOLD", price);
        int diamondDiscount = discountService.discount("DIAMOND", price);

        // 실수로 존재하지 않는 등급을 넣을 수도 있다.
        int noneDiscount1 = discountService.discount("DIAMAND", price); // 오타
        int noneDiscount2 = discountService.discount("diamond", price); // 대소문자

        System.out.println("BASIC 등급 할인금액: " + basicDiscount + "원");
        System.out.println("GOLD 등급 할인금액: " + goldDiscount + "원");
        System.out.println("DIAMOND 등급 할인금액: " + diamondDiscount + "원");
        System.out.println("DIAMAND 등급 할인금액: " + noneDiscount1 + "원");
        System.out.println("diamond 등급 할인금액: " + noneDiscount2 + "원");

    }
}
