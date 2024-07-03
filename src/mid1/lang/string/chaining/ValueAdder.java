package mid1.lang.string.chaining;

public class ValueAdder {
    private int value;

    // 값을 변경시키고 자기자신을 반환
    public ValueAdder add(int addValue){
        value += addValue;
        return this;
    }

    public int getValue(){
        return value;
    }
}
