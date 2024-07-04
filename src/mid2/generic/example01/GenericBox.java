package mid2.generic.example01;

public class GenericBox<T> { // 제네릭클래스 , T는 타입 매개변수

    // 객체 생성 시점에 T의 타입 결정
    // 코드 재사용성 & 타입 안정성
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
