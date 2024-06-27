package mid.lang.string.method;

public class StringChangeMain01 {
    public static void main(String[] args) {
        String str = "Great JavaKim of Java World!";

        // subString ===============================================================================
        System.out.println("인덱스 6번부터의 부분 문자열: " + str.substring(6));  // JavaKim of Java World!
        System.out.println("substring(6, 13) : " + str.substring(6, 13));  // 6부터 12까지의 문자열을 추출 -> JavaKim

        // concat =================================================================================
        System.out.println("문자열 결합: " + str.concat("?!!!")); // Great JavaKim of Java World!?!!!


        // replace =================================================================================
        System.out.println("Java -> Spring: " + str.replace("Java", "Spring")); // Great SpringKim of Spring World!
        System.out.println("첫번째 Java -> Spring: " + str.replaceFirst("Java", "Spring"));  // Great SpringKim of Java World!

    }
}
