package mid.lang.math;

public class MathMain {
    public static void main(String[] args) {
        // 기본 연산 메서드
        System.out.println("max(12,20): " + Math.max(12,20));
        System.out.println("min(12,20): " + Math.min(12,20));

        System.out.println("abs(-12): " + Math.abs(-12));
        System.out.println("abs(12): " + Math.abs(12));

        // 반올림 및 정밀도 메서드
        System.out.println("ceil(4.2): " + Math.ceil(4.2));  // 올림
        System.out.println("round(4.3): " + Math.round(4.3)); // 반올림
        System.out.println("floor(4.6): " + Math.floor(4.6)); // 내림


        // 기타
        System.out.println("sqrt(): " + Math.sqrt(81)); // 제곱근 (square root)
        System.out.println("random(): "+ Math.random()); // 0.0 ~ 1.0 사이의 double 값
        
        // BigDecimal: 아주 정밀한 숫자와 반올림 계산 필요시 사용 (보통 돈 정산같은 곳에 쓰이는 듯) (시간나면 후에 따로 공부해보기)

    }
}
