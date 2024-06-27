package mid.lang.immutable.change;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObject object = new ImmutableObject(100);
        ImmutableObject addObject = object.add(300); // 불변객체에서의 변경 메서드들은 보통 객체를 새로 만들어서 반환하기때문에 꼭 변수에 담아줘야한다

        // 계산 후에도 기존값, 계산값 모두 확인 가능
        System.out.println("object.getValue(): "+ object.getValue());
        System.out.println("addObject.getValue(): "+ addObject.getValue());
    }
}
