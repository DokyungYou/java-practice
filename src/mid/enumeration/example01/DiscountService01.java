package mid.enumeration.example01;

public class DiscountService01 {

    // 문자열로 받으면 타입안정성 부족, 컴파일 오류 감지 불가 ,데이터 일관성 X
    public int discount(String grade, int price){
        int discountPercent = 0;

        if(grade.equals(StringGrade.BASIC)){
            discountPercent = 10;
        }else if(grade.equals(StringGrade.GOLD)){
            discountPercent = 20;
        }else if(grade.equals(StringGrade.DIAMOND)){
            discountPercent = 30;
        }else {
            System.out.println(grade + ": 할인 X");
        }

        return price * discountPercent / 100 ;
    }
}
