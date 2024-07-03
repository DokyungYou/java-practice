package mid1.lang.wrapper;

public class AutoBoxingMain {
    public static void main(String[] args) {

        // 수동 박싱, 언박싱 ==================================================
        // 기본형 -> 래퍼
        int intValue = 1;
        Integer boxedValue = Integer.valueOf(intValue);

        // 래퍼 -> 기본형
        int unboxedValue = boxedValue.intValue();


        // 오토 박싱, 언박싱 ===================================================
        // 수동으로 했던 과정을 컴파일러가 대신 해준다! (수동과 자동은 동일하게 작동한다.)

        // 기본형 -> 래퍼
        Integer autoBoxed1 = intValue;
        Integer autoBoxed2 = 2;

        // 래퍼 -> 기본형
        int autoUnBoxed1 = boxedValue;
        int autoUnBoxed2 = Integer.valueOf(2);

    }
}
