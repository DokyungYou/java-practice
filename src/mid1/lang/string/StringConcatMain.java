package mid1.lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Kim";

        String result1 = a.concat(b);
        String result2 = a + b;  // 본래 String은 클래스이기때문에 a와 b에는 참조값이 들어있다 -> 원칙적으로는 + 연산이 불가하지만 편의상 제공해줌

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
    }
}
