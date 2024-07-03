package mid1.lang.object.equals;

public class EqualsMain02 {
    public static void main(String[] args) {
        Member02 member1 = new Member02("id-001");
        Member02 member2 = new Member02("id-001");

        System.out.println("identity: " + (member1 == member2));
        System.out.println("equality: " + (member1.equals(member2)));

    }
}
