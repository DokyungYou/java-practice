package mid1.lang.immutable.address;

// 불변클래스 : 객체의 상태가 변하지 않는 객체
// 공유참조로 인한 사이드이펙트를 방지하기위해 불변객체로 만들었다.
public class ImmutableAddress {
    // 속성에 final 을 붙이거나 (의도를 더 명확히 할 수 있다.)

    // 속성의 초기화를 생성자에 맡기고,
    // 속성을 private 으로 제어 +  setter 메서드 정의 X (첫 할당 이후엔 속성 값 변경불가)

    private String value;


    // 생성자를 통해서만 값 설정 가능 (이후에 값 변경 불가)
    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
