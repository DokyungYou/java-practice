package mid.lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {

        // int -> Integer
        Integer integer = Integer.valueOf(10);
        
        // 문자열 -> Integer
        Integer strIntValue = Integer.valueOf("1");
        //Integer.valueOf("1dd"); // NumberFormatException

        // 문자열 -> int =================================================
        int parsedInt = Integer.parseInt("2");
        // Integer.parseInt("d"); // NumberFormatException

        // 비교 ===========================================================
        int compareResult = integer.compareTo(20);  // return (x < y) ? -1 : ((x == y) ? 0 : 1);
        System.out.println("compareResult: " + compareResult);

        // 산술연산 =========================================================
        System.out.println("Integer.sum(10,30): " + Integer.sum(10,30));
        System.out.println("Integer.max(10,30): " + Integer.max(10,30));
        System.out.println("Integer.min(10,30): " + Integer.min(10,30));
    }
}
