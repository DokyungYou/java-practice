package mid1.lang.string.method;

import java.util.Arrays;

public class StringUtilsMain01 {
    public static void main(String[] args) {
        int intNum = 500;
        boolean bool = false;
        Object object = new Object();
        String string = "Java Kim";

        // String.valueOf() ===============================================
        String intString = String.valueOf(intNum); // "500"
        System.out.println(intString + 1); // 5001

        String boolString = String.valueOf(bool);
        System.out.println(intString + boolString);

        String objectString = String.valueOf(object);
        System.out.println(objectString + boolString);

        // 문자열 + 연산 시 문자열화
        System.out.println("" + 100 + 3); //1003


        // toCharArray  ===================================================
        char[] charArr = "JavaKim".toCharArray();
        System.out.println(Arrays.toString(charArr)); // [J, a, v, a, K, i, m]
        System.out.println(charArr); // JavaKim
        System.out.println("" + charArr); // [C@90f6bfd
    }
}
