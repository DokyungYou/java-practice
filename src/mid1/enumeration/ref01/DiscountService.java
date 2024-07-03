package mid1.enumeration.ref01;

public class DiscountService {


    // ClassGrade 의 상수객체에 할인퍼센트값을 불변속성값으로 가지게 함으로써 조건문이 필요없게 되었다.
    public int discount(ClassGrade grade, int price){
//        int discountPercent = 0;

//        if(grade.equals(mid.enumeration.example02.ClassGrade.BASIC)){
//            discountPercent = 10;
//        }else if(grade.equals(mid.enumeration.example02.ClassGrade.GOLD)){
//            discountPercent = 20;
//        }else if(grade.equals(ClassGrade.DIAMOND)){
//            discountPercent = 30;
//        }else {
//            System.out.println(grade + ": 할인 X");
//        }

        return price * grade.getDiscountPercent() / 100 ;
    }
}
