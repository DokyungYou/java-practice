package mid1.lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {

        Address address1 = new Address("주소1");
        Address address2 = new Address("주소1");

        System.out.println("address1: " + address1);
        System.out.println("address2: " + address2);

        System.out.println("주소2 -> address2");
        address2.setValue("주소2");
        System.out.println("address1: " + address1);
        System.out.println("address2: " + address2);
    }
}
