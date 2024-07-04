package mid2.generic.example04;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 1;
        Object o = GenericMethod.objMethod(i);

        // 타입 인자 명시적 전달 (타입을 지정하면서 호출)
        Integer intV = GenericMethod.<Integer>numberMethod(1);
        Double doubleV = GenericMethod.<Double>numberMethod(1.0);
        Long longV = GenericMethod.<Long>numberMethod(1L);


        // 타입 인자 추론 (인수의 타입을 통해 추론)
        Integer intV1 = GenericMethod.numberMethod(1);
        Double doubleV1 = GenericMethod.numberMethod(1.0);
        Long longV1 = GenericMethod.numberMethod(1L);
    }
}
