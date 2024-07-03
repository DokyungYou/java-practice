package mid1.lang.string.immutable;

public class StringImmutable01 {
    public static void main(String[] args) {
        String str = "java";
        str.concat("Kim"); // 합치는 메서드
        System.out.println(str);  // java  ("Kim 과 합쳐지지 않았다.")
        
        // String 은 불변객체이기때문에 뭔가를 바꾸는 메서드는 기존 값을 바꾸는 것이 아닌 새로운 문자열을 반환해줌
        // String 이 불변객체인 이유: 가변객체일 경우 문자열 풀에서의 사이드이펙트 문제 발생이 불가피함

        String javaKim = str.concat("Kim");
        System.out.println(str);  // java
        System.out.println(javaKim); // javaKim


    }
}
