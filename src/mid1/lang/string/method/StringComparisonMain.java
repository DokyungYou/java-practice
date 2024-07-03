package mid1.lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Great Java Kim!"; // 대소문자
        String str2 = "great java kim!"; // 소문자
        String str3 = "Spring Boot";

        // equals =========================================================
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));

        // compareTo =======================================================
        System.out.println("'b'.compareTo('a'): "+ "b".compareTo("a")); // 1
        System.out.println("'a'.compareTo('b'): "+ "a".compareTo("b")); // -1
        System.out.println("'c'.compareTo('a'): "+ "c".compareTo("a")); // 2

        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3));  // -12
        System.out.println("str1.compareToIgnoreCase(str2): "+ str1.compareToIgnoreCase(str2)); // 0

        // startWith =======================================================
        System.out.println("str1.startsWith('Great'): " + str1.startsWith("Great"));
        System.out.println("str1.startsWith('great'): " + str1.startsWith("great"));

        System.out.println("str1.endsWith('Kim!'): " + str1.endsWith("Kim!"));


    }
}
