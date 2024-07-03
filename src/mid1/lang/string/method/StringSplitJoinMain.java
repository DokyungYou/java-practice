package mid1.lang.string.method;

import java.util.Arrays;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Chicken-Duck-Goose";

        //split()
        String[] splitArray = str.split("-"); // - 를 기준으로 문자열 쪼개기
        System.out.println(Arrays.toString(splitArray));

        // join() =====================================================================
        System.out.println(String.join("@","Chicken","Duck","Goose"));  // Chicken@Duck@Goose
        System.out.println(String.join("&",splitArray));  // Chicken&Duck&Goose

    }
}
