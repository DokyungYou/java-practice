package mid.lang.string.example;

public class Example02 {
    public static void main(String[] args) {

        // arr 배열에 들어있는 모든 문자열의 길이 합 구하기
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int result = 0;
        for(String str : arr){
            result += str.length();
        }
        System.out.println("길이 합: " + result);
    }
}
