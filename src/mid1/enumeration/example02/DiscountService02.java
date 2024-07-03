package mid1.enumeration.example02;

public class DiscountService02 {

    // 이젠 문자열이 아닌 ClassGrade 타입으로 받는다.
    // 타입 안전 열거형 패턴
    public int discount(ClassGrade grade, int price){
        int discountPercent = 0;

        if(grade.equals(ClassGrade.BASIC)){
            discountPercent = 10;
        }else if(grade.equals(ClassGrade.GOLD)){
            discountPercent = 20;
        }else if(grade.equals(ClassGrade.DIAMOND)){
            discountPercent = 30;
        }else {
            System.out.println(grade + ": 할인 X");
        }

        return price * discountPercent / 100 ;
    }
}
