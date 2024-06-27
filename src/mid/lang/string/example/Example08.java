package mid.lang.string.example;

public class Example08 {
    public static void main(String[] args) {
        // 이메일 아이디와 도메인 분리
        String str = "myId@gmail.com";
        String[] split = str.split("@");

        String id = split[0];
        String domain = split[1];
        System.out.println("아이디: "+ id + ", 도메인: "+ domain);

    }
}
