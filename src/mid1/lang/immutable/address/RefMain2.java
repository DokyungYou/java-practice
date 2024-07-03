package mid1.lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {

        ImmutableAddress address1 = new ImmutableAddress("주소1");
        ImmutableAddress address2 = address1; // 똑같은 속성값을 가진 객체가 더 필요할 땐 공유참조를 하는 것이 메모리상 효율적일 수 있다.

        System.out.println("address1: " + address1);
        System.out.println("address2: " + address2);


        System.out.println("주소2 -> address2");
        // address2.setValue("주소2");
        address2 = new ImmutableAddress("주소2");  // 불변객체는 속성값 수정이 불가 -> 수정을 원할시 새로운 객체로 생성하여 새로 할당

        System.out.println("address1: " + address1);
        System.out.println("address2: " + address2);
    }
}
