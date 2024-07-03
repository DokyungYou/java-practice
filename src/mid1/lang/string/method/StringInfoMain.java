package mid1.lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Java Kim";
        System.out.println("문자열의 길이: " + str.length()); // 공백문자도 길이에 포함된다.
        System.out.println("문자열이 비어있는지: " + str.isEmpty()); // return value.length == 0;

        System.out.println("문자열이 비어있거나 공백인지: " + str.isBlank());  // false
        System.out.println("문자열이 비어있거나 공백인지: " + "  ".isBlank()); // true

        char char0 = str.charAt(0);
        System.out.println("char0: " + char0);  // J
        System.out.println("char4: " + str.charAt(4));  // " "
    }
}
