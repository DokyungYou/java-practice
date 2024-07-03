package mid1.lang.string.chaining;

public class MethodChainingMain01 {
    public static void main(String[] args) {

        // 메서드 체이닝 전
        ValueAdder valueAdder = new ValueAdder();
        valueAdder.add(10);
        valueAdder.add(20);
        valueAdder.add(30);

        int result = valueAdder.getValue();
        System.out.println(result);
    }
}
