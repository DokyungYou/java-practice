package mid.lang.math.example;

public class Example03 {
    public static void main(String[] args) {

        String strNum = "111111";

        // 오토 박싱, 언박싱 사용금지
        // String -> Integer
        // Integer -> int
        // int -> Integer

        Integer integerNum = Integer.valueOf(strNum);
        int intNum = integerNum.intValue();
        Integer reBoxing = Integer.valueOf(intNum);

        System.out.println(integerNum);
        System.out.println(intNum);
        System.out.println(reBoxing);


        // 오토 박싱, 언박싱
        // String -> Integer
        // Integer -> int
        // int -> Integer

        Integer integerNum1 = Integer.valueOf(strNum);
        int intNum1 = integerNum1;
        Integer reboxing1 = intNum1;

        System.out.println(integerNum1);
        System.out.println(intNum1);
        System.out.println(reboxing1);


    }
}
