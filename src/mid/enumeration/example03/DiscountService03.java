package mid.enumeration.example03;


public class DiscountService03 {

    // 이젠 enum 으로 받는다.
    public int discount(Grade grade, int price){
        int discountPercent = 0;

        if(grade == Grade.BASIC){
            discountPercent = 10;
        }else if(grade == Grade.GOLD){
            discountPercent = 20;
        }else if(grade == Grade.DIAMOND){
            discountPercent = 30;
        }else {
            System.out.println(grade + ": 할인 X");
        }

        return price * discountPercent / 100 ;
    }
}
