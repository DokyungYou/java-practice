package mid.enumeration.ref03;


public class EnumGradeRefMain {
    public static void main(String[] args) {
        // Grade 자체에서 계산을 해주니 더 이상 DiscountService 이 필요하지 않게 되었음
        int price = 5_000_000;

        for (Grade grade : Grade.values())  printDisCount(grade, price);

    }

    private static void printDisCount(Grade grade, int price){
        System.out.println(grade.name() + "등급 할인금액: " + grade.getDiscountAmount(price) + "원");
    }
}
