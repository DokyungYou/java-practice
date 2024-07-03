package mid1.enumeration.example03;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println(Grade.BASIC.getClass());
        System.out.println(Grade.GOLD.getClass());
        System.out.println(Grade.DIAMOND.getClass());

        System.out.println("ref BASIC: " + Grade.BASIC + "\n"); // enum 은 toString이 재정의 돼있어서 직접 확인불가

        // enum에 정의돼있는 상수들이 서로 다른 참조값임을 볼 수 있다.
        System.out.println("ref BASIC: " + refValue(Grade.BASIC));
        System.out.println("ref GOLD: " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND: " + refValue(Grade.DIAMOND));
    }
    private static String refValue(Object grade){
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
