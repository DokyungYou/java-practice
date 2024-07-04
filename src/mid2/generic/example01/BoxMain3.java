package mid2.generic.example01;

public class BoxMain3 {
    public static void main(String[] args) {
        
        // 생성 시점에 T의 타입 결정
        GenericBox<Integer> integerBox = new GenericBox<>(); // 타입추론: 생성하는 제네릭 타입 생략 가능

        //integerBox.setValue("wrongValue"); // 생성 시점에 결정한 타입만 허용 (컴파일 오류)
        integerBox.setValue(1);
        System.out.println(integerBox.getValue()); // 다운캐스팅 불필요

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setValue("rightValue");
        System.out.println(stringBox.getValue());
        
        
        // 원하는 모든 타입 사용 가능
        GenericBox<Long> longBox = new GenericBox<>();
        longBox.setValue(1L);

        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.setValue(0.0);

        GenericBox<Float> floatBox = new GenericBox<>();
        floatBox.setValue(0.0f);
    }
}
