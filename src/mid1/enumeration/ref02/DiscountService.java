package mid1.enumeration.ref02;


public class DiscountService {


    public int discount(Grade grade, int price){
        return price * grade.getDiscountPercent() / 100 ;
    }
}
