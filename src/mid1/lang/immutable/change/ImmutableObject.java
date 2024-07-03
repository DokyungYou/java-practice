package mid1.lang.immutable.change;

public class ImmutableObject {
    private final int value;

    public ImmutableObject(int value){
        this.value = value;
    }

    // 속성값을 변경해야할 때
    // 자기자신 객체를 바꾸지 않고 아예 새로운 객체로 만들어서 반환
    // 불변성을 유지하면서 새로운 결과를 만들 수 있음
    public ImmutableObject add(int value){
        return new ImmutableObject(this.value + value);
    }

    public int getValue() {
        return value;
    }
}
