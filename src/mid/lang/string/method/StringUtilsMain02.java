package mid.lang.string.method;

public class StringUtilsMain02 {
    public static void main(String[] args) {
        int intNum = 500;
        boolean bool = false;
        String string = "Java Kim";

        // String.format ========================================================
        String format1 = String.format("num: %d, bool: %b string: %s", intNum, bool, string);
        System.out.println("format1: " + format1);

        System.out.println(String.format("%.3f",1234.653414113)); // 1234.653
        System.out.printf("num: %d, bool: %b string: %s\n", 500, bool, string);

        // matches ===============================================================
        String regex = "Java (Java!|Kim)"; // 앞에 Java가 오고 뒤에는 Java! 나 Kim 이 오는 정규식
        System.out.println("패턴 일치여부: " + string.matches(regex));
    }
}
