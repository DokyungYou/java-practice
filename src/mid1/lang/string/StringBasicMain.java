package mid1.lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        String str1 = "java";
        String str1_1 = "java";

        String str2 = new String("java");
        String str2_1 = new String("java");

        System.out.println("str1: " + str1); // 문자열 풀 사용
        System.out.println("str2: " + str2); // 객체


        System.out.println(str1 == str1_1); // true

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.println(str2 == str2_1);
        System.out.println(str2.equals(str2_1));




    }
}
