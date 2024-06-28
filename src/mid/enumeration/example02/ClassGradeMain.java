package mid.enumeration.example02;


public class ClassGradeMain {
    public static void main(String[] args) {
        DiscountService02 discountService = new DiscountService02();
        int price = 3_000_000;

        int basicDiscount = discountService.discount(ClassGrade.BASIC, price);
        int goldDiscount = discountService.discount(ClassGrade.GOLD, price);
        int diamondDiscount = discountService.discount(ClassGrade.DIAMOND, price);
       // int noneDiscount = discountService.discount(new ClassGrade(),price);

        System.out.println("BASIC 등급 할인금액: " + basicDiscount + "원");
        System.out.println("GOLD 등급 할인금액: " + goldDiscount + "원");
        System.out.println("DIAMOND 등급 할인금액: " + diamondDiscount + "원");
        //System.out.println("없는 등급: " + noneDiscount + "원");
    }
}
