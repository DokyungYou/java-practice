package mid.lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        
        //참조형 변수는 하나의 인스턴스를 공유할 수 있음
        Address address1 = new Address("주소1");
        Address address2 = address1;

        System.out.println("address1: " + address1);
        System.out.println("address2: " + address2);

        System.out.println("주소2 -> address2");
        change(address2, "주소2");
        System.out.println("address1: " + address1); // 사이드이펙트 발생 (현재코드는 매우 단순해서 왜 이렇게 되는지 알지만 실무에서는...?)
        System.out.println("address2: " + address2);
    }

    private static void change(Address address, String changeAddress){
        System.out.println("주소 값 변경: " + address.getValue() +" -> "+ changeAddress);
        address.setValue(changeAddress);
    }
}
