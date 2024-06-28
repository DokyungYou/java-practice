package mid.enumeration.example03;


public class EnumGradeMain {
    public static void main(String[] args) {
        DiscountService03 discountService = new DiscountService03();
        int price = 3_000_000;

        int basicDiscount = discountService.discount(Grade.BASIC, price);
        int goldDiscount = discountService.discount(Grade.GOLD, price);
        int diamondDiscount = discountService.discount(Grade.DIAMOND, price);

        System.out.println("BASIC 등급 할인금액: " + basicDiscount + "원");
        System.out.println("GOLD 등급 할인금액: " + goldDiscount + "원");
        System.out.println("DIAMOND 등급 할인금액: " + diamondDiscount + "원");


    }
}
