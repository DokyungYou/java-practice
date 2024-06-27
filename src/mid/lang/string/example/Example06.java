package mid.lang.string.example;

public class Example06 {
    public static void main(String[] args) {
        // 문자의 양쪽 공백 제거
        String str = "   Great JavaKim     ";
        System.out.println(str.trim());
        System.out.println(str.strip());

        // 앞만 제거
        System.out.println(str.stripLeading());

        // 뒤만 제거
        System.out.println(str.stripTrailing());
    }
}
