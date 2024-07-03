package mid1.lang.immutable.change;

public class MutableObject {

    private int value;

    public MutableObject(int value){
        this.value = value;
    }

    public void add(int addValue){
        value += addValue;  // 속성값이 변함 => MutableObject 는 불변객체가 아니다.
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
