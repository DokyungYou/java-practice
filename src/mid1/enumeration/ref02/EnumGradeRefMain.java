package mid1.enumeration.ref02;


public class EnumGradeRefMain {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();
        int price = 5_000_000;

        int basicDiscount = discountService.discount(Grade.BASIC, price);
        int goldDiscount = discountService.discount(Grade.GOLD, price);
        int diamondDiscount = discountService.discount(Grade.DIAMOND, price);

        System.out.println("BASIC 등급 할인금액: " + basicDiscount + "원");
        System.out.println("GOLD 등급 할인금액: " + goldDiscount + "원");
        System.out.println("DIAMOND 등급 할인금액: " + diamondDiscount + "원");
    }
}
