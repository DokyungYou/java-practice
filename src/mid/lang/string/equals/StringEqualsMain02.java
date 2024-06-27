package mid.lang.string.equals;

public class StringEqualsMain02 {
    public static void main(String[] args) {
        String str1 = new String("java");
        String str2 = new String("java");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "java";
        String str4 = "java";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));

    }

    private static boolean isSame(String a, String b){
        // new 연산자로 만든 것일지, 리터럴이 넘어올지 모르기때문에 == 연산자가 아닌 equals() 를 사용해줘야한다.
       // return a == b;
        return a.equals(b);
    }
}
