package mid1.lang.string.example;

public class Example03 {
    public static void main(String[] args) {

        // 문자열에서 "큰일"이라는 문자열이 몇번 인덱스부터 시작하는지 출력
        String str = "탈모가 온 것 같다.. 큰일났다..";  // 13
        System.out.println("큰일: " + str.indexOf("큰일"));

    }
}
