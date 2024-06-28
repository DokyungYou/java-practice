package mid.lang.wrapper;

public class MyInteger {
    private final int value;

    public int getValue() {
        return value;
    }

    public MyInteger(int value) {
        this.value = value;
    }


    // 자기자신 값을 사용한 자신의 메서드 제공 (객체지향적)
    public int compareTo(int target){
        if(value < target){
            return -1;
        }else if(value > target){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
