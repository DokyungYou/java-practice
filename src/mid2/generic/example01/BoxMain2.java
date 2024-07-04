package mid2.generic.example01;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(1);
        Integer integerValue = (Integer)(integerBox.getValue());
        System.out.println("integerValue: " + integerValue);

        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("Hello");
        String stringValue = (String)(stringBox.getValue());
        System.out.println("stringValue: " + stringValue);

        // 실수로 의도치 않은 타입의 인수 전달 시
        integerBox.setValue("string");
        //Integer wrongCasting = (Integer) (integerBox.getValue()); // ClassCastException
        

        /*
        다형성활용으로 코드 중복제거, 코드 재사용 가능해짐
        그러나
        setValue 때 의도하지 않는 타입도 들어갈 수 있는 문제 (타입 안정성 문제)
        getValue 때 다운캐스팅 필요 (타입 안정성 문제로 인해 위험함)
        */

        /* ae719428 (BoxMain1)
        코드중복이 있었으나 타입 안정성이 높았음
        */
    }
}
