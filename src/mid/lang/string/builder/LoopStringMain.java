package mid.lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "Great Java Kim";

            // new StringBuilder().append(result).append("Great Java Kim").toString() 
            // 자바는 위와 같이 최적화를 시도 (하지만... 반복문 한번 돌때마다 StringBuilder 객체, String 객체를 매번 생성했을 것임)
            // 컴파일러는 몇번의 반복, 각 반복문에서 어떻게 문자열이 변할지 예측 불가 -> 최적화가 어려움
        }
        long endTime = System.currentTimeMillis();
        System.out.println("result: " + result);
        System.out.println("mid.time: " + (endTime - startTime) + "ms"); // 내 컴은 10초가 넘게 걸렸다..  12008 ~ ms
    }

    /*
    문법 이론상 문자열 + 문자열 -> 기존 문자열은 버리고, 새로운 문자열을 만들기때문에 
    연산이 잦으면 자원 소모가 크지만 대부분 자바가 최적화를 해준다. (알아서 StringBuilder 를 사용해줌)
    
    그러나 우리가 직접 StringBuilder 를 사용해야하는 경우
    - 반복문 내에서 문자를 합치는 것을 반복 시
    - 조건문 통해 동적으로 문자열 조합 시
    - 복잡한 문자열의 특정 부분 변경 시
    - 매우 긴 대용량 문자열을 다룰 시
     */
}
