package mid1.lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        
        //참조형 변수는 하나의 인스턴스를 공유할 수 있음
        Address address1 = new Address("주소1");
        Address address2 = address1;

        System.out.println("address1: " + address1);
        System.out.println("address2: " + address2);


        System.out.println("주소2 -> address2");
        address2.setValue("주소2");
        System.out.println("address1: " + address1);
        System.out.println("address2: " + address2);
    }
}
