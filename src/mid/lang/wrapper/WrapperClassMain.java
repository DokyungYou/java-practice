package mid.lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer integer = new Integer(1);  // 'Integer(int)' is deprecated (내부에 들어가보면 대안을 추천해준다.)
        Integer integer1 = Integer.valueOf(1);
        
        // -128 ~ 127 자주 사용하는 숫자 값 재사용 (자바가 미리 해당 숫자값을 가진 Integer로 캐싱해둠) -> 성능 최적화
        //    public static Integer valueOf(int i) {
        //        if (i >= IntegerCache.low && i <= IntegerCache.high)
        //            return IntegerCache.cache[i + (-IntegerCache.low)];
        //        return new Integer(i);
        //    }

        Long long1 = Long.valueOf(1);
        Float float1 = Float.valueOf(1);
        Double double1 = Double.valueOf(1);

        System.out.println(integer);
        System.out.println(integer1);
        System.out.println(long1);
        System.out.println(float1);
        System.out.println(double1);


        System.out.println("Wrapper 내부 값 ==================================================");
        System.out.println("integer1.intValue(): " + integer1.intValue());   // private final int value    public int intValue() {return value;}


        System.out.println("비교 ==============================================================");
        System.out.println("==: "+ (integer == integer1));
        System.out.println("equals: " + integer.equals(integer1));

        System.out.println("valueOf 로 생성한 객체끼리 ==: "+ (integer1 == Integer.valueOf(1)));  // 내부에서 미리 만들어둔 Integer 객체를 공유


        System.out.println(integer1);  // toString 재정의돼있어서 바로 value 값 출력해줌
    }
}
