package mid1.lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000; // _를 구분자로 넣어줄 수 있음
        long startTime, endTime;


        // 기본자료형 long ==========================================================
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("long 합계: " + sumPrimitive);  // 499999999500000000
        System.out.println("기본자료형 long 소요시간: " + (endTime - startTime) + "ms"); //  내 컴은 0.27초를 넘지는 않는 상태


        // Wrapper Long ==================================================================
        Long sumWrapper = 0L; // 오토박싱
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i;  // 컴파일러가 오토박싱 해줄 것임
        }
        endTime = System.currentTimeMillis();
        System.out.println("Long 합계: " + sumWrapper); // 499999999500000000
        System.out.println("Wrapper Long 소요시간: " + (endTime - startTime) + "ms"); // 내 컴은 4초 초반
        
        
        // 연산 속도가 4~5배 정도 차이가 나는 것을 볼 수 있었다.
    
        // 기본형은 메모리에서 그 크기만큼의 공간을 차지 (long은 8byte)
        // 래퍼클래스는 기본형값 + 객체 메타데이터 -> 더 많은 메모리 사용 (보통 기본형보다 3~5배?)
        
        // but 특수한 경우가 아니라면 코드 유지보수하기 더 용이한 것을 선택하는 것이 좋다.
        // 요즘 일반적인 경우는 이런 부분을 최적화해도 별 차이가 없음 (위의 경우는 10억번을 반복하는 특수한 상황이었음)
        // 나중에 테스트 시 트래픽이 몰렸을 때 등의 상황에 성능이 많이 떨어지면 그 때 최적화하는게 낫다.
    }
}
